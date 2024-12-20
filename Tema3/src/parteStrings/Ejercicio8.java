package parteStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase del usuario
		String frase;

		// Creamos una tabla donde se van a guardar las palabras de la frase
		String palabras[];

		// Le pedimos la frase al usuario
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine().toLowerCase();

		// Guardamos en la tabla cada palabra de la frase
		palabras = frase.split(" ");

		// Ordenamos la tabla alfabéticamente
		Arrays.sort(palabras);

		// Imprimimos la tabla ya ordenada
		System.out.println(Arrays.toString(palabras));

		// Cerramos el Scanner
		reader.close();
	}
}
