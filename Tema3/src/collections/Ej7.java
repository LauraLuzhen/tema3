package collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej7 {
	
	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que almacena la opción del usuario
		int opc;
		// Variable que guarda la palabra en Español
		String palabraEspañol;
		// Variable que guarda la palabra en Inglés
		String palabraIngles;
		
		// Creamos el diccionario
		Map<String, String> diccionario = new TreeMap<String, String>();
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		// Do-while que sale del bucle cuando el usuario lo elija
		do {
			// Le pedimos una opción e imprimimos el menu
			System.out.println("Elige una opción: ");
			menu();
			opc = reader.nextInt();
			reader.nextLine();
			
			// Switch según la opción del usuario
			switch (opc) {
			case 1 -> {
				
				// Le pedimos la palabra
				System.out.println("Introduce la palabra en Español: ");
				palabraEspañol = reader.nextLine();
				
				// If-else que si contiene ya la palabra lo indica, en caso contrario le pide su traducción y lo guarda
				if (diccionario.containsKey(palabraEspañol)) {
					System.out.println("La palabra ya se encuentra en el diccionario.");
				} else {
					System.out.println("Introduce su traducción: ");
					palabraIngles = reader.nextLine();
					diccionario.put(palabraEspañol, palabraIngles);
				}
			}
			case 2 -> {
				
				// Le pedimos la palabra
				System.out.println("Introduce la palabra en Español: ");
				palabraEspañol = reader.nextLine();
				
				//If-else que si contiene la palabra muestra su traducción, en caso contrario lo indicamos
				if (diccionario.containsKey(palabraEspañol)) {
					System.out.println("La traducción es: " + diccionario.get(palabraEspañol));
				} else {
					System.out.println("La palabra no se encuentra en el diccionario.");
				}
			}
			case 3 -> System.out.println("Saliendo del programa...");	// Salir del programa
			default -> System.out.println("Opción no válida"); 		// Opción que no está en el menú
			}
		} while (opc != 3);
		
		// Cerramos el Scanner
		reader.close();
	}
	
	// Función que imprime el menú
	public static void menu() {
		System.out.println("1. Insertar palabra");
		System.out.println("2. Buscar palabra");
		System.out.println("3. Salir");
	}
}
