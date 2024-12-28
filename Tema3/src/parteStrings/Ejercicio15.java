package parteStrings;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase original
		String fraseOriginal;
		// Variable que guarda la respuesta del jugador 2
		String respuesta;
		// Variable que guarda el anagrama generado
		String anagrama = "";

		// Tabla que guarda la frase anagrama de la original
		String[] fraseAnagrama;

		// Le pedimos al jugador 1 que introduzca la frase
		System.out.println("Jugador 1 introduce una frase o palabra: ");
		fraseOriginal = reader.nextLine().toLowerCase();

		// Le damos la misma longitud que la frase introducida
		fraseAnagrama = fraseOriginal.split("");

		// Generamos el anagrama
		generaAnagrama(fraseAnagrama);

		// Guardamos el anagrama en forma de String con un for-each
		for (String caracter : fraseAnagrama) {
			anagrama += caracter;
		}

		// Imprimimos el anagrama
		System.out.println("Anagrama generado: " + anagrama);

		// Creamos un do-while que salga del bucle cuando haya acertado la frase
		// original
		do {
			System.out.println("Introduce la frase original: ");
			respuesta = reader.nextLine();
		} while (!respuesta.equalsIgnoreCase(fraseOriginal));

		System.out.println("Enhorabuena!! Has acertado");

		// Cerramos el Scanner
		reader.close();
	}

	// Función que desornena los elementos de una lista
	static void generaAnagrama(String anagrama[]) {

		// Declaración de variables
		// Variable que guarda el contenido temporalmente
		String temp;
		// Variable que guarda la segunda posición generada para guardarla
		int pos2;

		// Creamos el Random
		Random rand = new Random();

		// Creamos un for que modifique los caracteres de la frase
		for (int pos1 = anagrama.length - 1; pos1 > 0; pos1--) {
			// Generamos una posición random
			pos2 = rand.nextInt(pos1 + 1);

			// Realizamos el cambio
			temp = anagrama[pos1];
			anagrama[pos1] = anagrama[pos2];
			anagrama[pos2] = temp;
		}
	}
}
