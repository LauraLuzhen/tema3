package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda la opción del usuario
		int opc;
		// Variable que guarda el nombre del usuario
		String usuario;
		// Variable que guarda la contraseña
		String contraseña;
		// Variable que guarda la posible contraseña
		String constraseñaUser;
		
		// Creamos el diccionario
		Map<String, String> usuarios = new HashMap<String, String>();
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Do-while que sale del bucle cuando quiera el usuario
		do {
			// Le pedimos una opción
			System.out.println("Introduce una opción: ");
			menu();
			opc = reader.nextInt();
			reader.nextLine();
			
			// Switch según la opción
			switch (opc) {
			case 1 -> {
				
				// Le pedimos el nombre del usuario
				System.out.println("Introduce el nombre de usuario: ");
				usuario = reader.nextLine();
				
				// If-else que si contiene el usuario lo indica, en caso contrario le pide la contraseña y lo añadimos al mapa
				if (usuarios.containsKey(usuario)) {
					System.out.println("El usuario ya existe");
				} else {
					System.out.println("Introduce la contraseña: ");
					contraseña = reader.nextLine();
					usuarios.put(usuario, contraseña);
				}
			}
			case 2 -> {
				
				// Le padimos el usuario
				System.out.println("Introduce el nombre de usuario: ");
				usuario = reader.nextLine();
				
				// If-else si existe le pedimos la contraseña, en caso contrario lo indicamos
				if (usuarios.containsKey(usuario)) {
					System.out.println("Introduce la contraseña: ");
					constraseñaUser = reader.nextLine();
					
					// If-else que si la contraseña es correcta accede a la cuenta, en caso contrario lo indicamos
					if (usuarios.get(usuario).equals(constraseñaUser)) {
						System.out.println("Has accedido a tu cuenta");
					} else {
						System.out.println("Contraseña incorrecta");
					}
				} else {
					System.out.println("El usuario no se ha encontrado");
				}
			}
			case 3 -> System.out.println("Saliendo del programa...");	
			default -> System.out.println("Opción no válida");		
			}
		} while (opc != 3);
		
		// Cerramos el Scanner
		reader.close();
	}
	
	// Función que imprime el menú
	public static void menu() {
		System.out.println("1. Registro");
		System.out.println("2. Login");
		System.out.println("3. Salir");
	}
}
