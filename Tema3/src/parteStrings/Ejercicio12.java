package parteStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Varbale que guarda la frase del usuario
		String frase;
		// Variable que guarda las letras que tenga la palabra mas larga
		int letrasMayorPalabra = 0;
		// Variable que indica los elementos de la tabla palabraLarga
		int indice = 0;
		// Variable que indica la longitud de la tabla palabraLarga
		int longPalabraLarga = 0;

		// Creamos una tabla que contenga cada palabra de la frase introducida
		String palabras[];
		// Creamos una tabla que contenga las palabras largas de la frase
		String palabraLarga[];

		// Le pedimos una frase al usuario
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine();

		// Le damos los elementos a la tabla palabras que el separador será un espacio
		palabras = frase.split(" ");

		// Creamos un for que reocorra la tabla palabras
		for (int i = 0; i < palabras.length; i++) {
			// Creamos un if que cambia la letrasMayorPalabra en caso de que haya una
			// palabra con mayor longitud
			if (palabras[i].length() > letrasMayorPalabra) {
				letrasMayorPalabra = palabras[i].length();
			}
		}

		// Creamos un for-each que recorra cada palabra de la tabla palabras
		for (String palabra : palabras) {
			// Creamos un if que si la palabra tiene la longitud de la máxima palabra
			// aumentamos la longitud de la tabla palabraLarga
			if (palabra.length() == letrasMayorPalabra) {
				longPalabraLarga++;
			}
		}

		// Le damos la longitud a la tabla
		palabraLarga = new String[longPalabraLarga];

		// Creamos un for-each que recorra cada palabra de la tabla palabras
		for (String palabra : palabras) {
			// Creamos un if que si la palabra tiene la longitud de la máxima palabra la
			// añadimos a la tabla palabraLarga
			if (palabra.length() == letrasMayorPalabra) {
				palabraLarga[indice] = palabra;
				indice++;
			}
		}

		// Imprimimos el resultado
		System.out.println("La longitud máxima conseguida de una palabra es " + letrasMayorPalabra
				+ " y las palabras que tienen esa longitud son: ");
		System.out.println(Arrays.toString(palabraLarga));

		// Cerramos el Scanner
		reader.close();
	}
}
