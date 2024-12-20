package parteStrings;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase
		String frase = "";
		// Variable que guarda cada palabra que introduce el usuario
		String palabra;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos el inicio de la frase al usuario
		System.out.println("Introduce una palabra: ");
		palabra = reader.next();
		reader.nextLine();

		while (!palabra.equalsIgnoreCase("fin")) {

			// Guardamos en la frase cada palabra y un espacio
			frase += palabra + " ";

			// Le volvemos a pedir otra palabra
			System.out.println("Introduce una palabra: ");
			palabra = reader.next();
			reader.nextLine();
		}

		System.out.println(frase);

		// Cerramos el Scanner
		reader.close();
	}
}
