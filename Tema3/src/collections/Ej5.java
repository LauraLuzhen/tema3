package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ej5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la palabra del usuario
		String palabra;
		
		// Creamos la colección
		Set<String> lista = new LinkedHashSet<String>();
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		// Le pedimos al usuario que introduzca una palabra
		System.out.println("Introduce una palabra: ");
		palabra = reader.nextLine();
		
		// While que se sale del bucle cuando el usuario escribe fin
		while (!palabra.equalsIgnoreCase("fin")) {
			
			// Guardamos la palabra
			lista.add(palabra);
			
			// Le preguntamos al usuario
			System.out.println("Introduce una palabra: ");
			palabra = reader.nextLine();
		}
		
		// Imprimimos la lista
		System.out.println(lista);
		
		// Cerramos el Scanner
		reader.close();
	}
}
