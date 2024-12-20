package parteStrings;

import java.util.Scanner;

public class Ejercicio2Avanzado {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la contraseña
		String clave = "clave";
		// Variable que guarda la respuesta del usuario
		String userClave;
		// Variable que guarda la cadena que se le va a mostrar al usuario con *
		String aciertos;

		// Le pedimos la contraseña al usuario
		System.out.println("Introduce la contraseña: ");
		userClave = reader.nextLine();

		// Creamos un while que sale del bucle cuando el usuairo haya acertado la
		// contraseña
		while (!clave.equals(userClave)) {
			// Comenzamos con la cadena que se va a mostrar vacía
			aciertos = "";

			// Creamos un for que recorra cada carácter de la contraseña
			for (int i = 0; i < clave.length(); i++) {
				// Creamos un if-else que compare cada carácter con la contraseña introducida
				// por el usuario
				if (userClave.charAt(i) == clave.charAt(i)) {
					// Si coinciden lo guardamos en los aciertos
					aciertos += clave.charAt(i);
				} else {
					// Si no coinciden será un *
					aciertos += "*";
				}
			}

			// Imprimimos la cadena de aciertos
			System.out.println("Contraseña: " + aciertos);

			// Le pedimos la contraseña al usuario
			System.out.println("Introduce la contraseña: ");
			userClave = reader.nextLine();
		}

		System.out.println("Has acertado la contraseña");

		// Cerramos el Scanner
		reader.close();
	}
}
