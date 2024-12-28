package parteStrings;

import java.util.Scanner;

public class Ejercicio14 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase del usuario
		String frase;
		// Variable que guarda la frase sin espacios
		String fraseSinEspacios;
		// Variable que guarda la letra a imprimir en el resultado
		char letra;

		// Constante que guarda la letra a
		final char letraA = 'a';

		// Creamos una tabla que contenga los caracteres de la frase
		char caracteres[];
		// Creamos una tabla que contenga la cantidad de veces que se repite una letra,
		// tine longitud 26 pq cada posición es una letra del abecedario
		int cantCaracteres[] = new int[26];

		// Le pedimos una frase al usuario
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine().toLowerCase();

		// Eliminamos los espacios
		fraseSinEspacios = frase.replace(" ", "");

		// Le damos la longitud a la tabla de caracteres
		caracteres = new char[fraseSinEspacios.length()];

		// Creamos un for que recorra la frase entera y guarde cada carácter en la tabla
		// de caracteres
		for (int i = 0; i < caracteres.length; i++) {
			caracteres[i] = fraseSinEspacios.charAt(i);
		}

		// Creamos un for-each que recorra toda la tabla caracteres y aumnete la
		// cantidad de veces que se repite en la tabla cantCaracteres
		for (char caracter : caracteres) {
			cantCaracteres[caracter - letraA]++;
		}

		// Creamos un for que recorra toda la tabla de cantCaracteres
		for (int j = 0; j < cantCaracteres.length; j++) {
			// Si el contador es mayor que 0 entonces lo imprimimos
			if (cantCaracteres[j] > 0) {
				// Obtenemos la letra que aparece gracias a las posiciones de la tabla
				// cantCaracteres
				letra = (char) (j + letraA);
				// Imprimimos la letra y la cantidad de veces que se repite
				System.out.println(letra + ": " + cantCaracteres[j] + (cantCaracteres[j] == 1 ? " vez" : " veces"));
			}
		}

		// Cerramos el Scanner
		reader.close();
	}
}
