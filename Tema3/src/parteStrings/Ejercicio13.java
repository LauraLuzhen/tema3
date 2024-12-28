package parteStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la primera frase
		String frase1;
		// Variable que guarda la segunda frase
		String frase2;

		// Le pedimos las dos frases al usuario
		System.out.println("Introduce la primera frase: ");
		frase1 = reader.nextLine().toLowerCase();
		System.out.println("Introduce la segunda frase: ");
		frase2 = reader.nextLine().toLowerCase();

		// Imprimimos el resultado
		System.out.println("¿Ambas son anagramas? " + anagrama(frase1, frase2));

		// Cerramos el Scanner
		reader.close();
	}

	// Función que dice si dos frases o palabras son anagramas o no
	static boolean anagrama(String frase1, String frase2) {

		// Declaración de variables
		// Variable que indica si son anagramas
		boolean esAnagrama;

		// Creamos dos tablas una por cada frase para guardar cada carácter de la frase
		// o palabra
		char palabra1[] = new char[frase1.length()];
		char palabra2[] = new char[frase2.length()];

		// Creamos un if-else que si ambas frases no tienen la misma longitud no pueden
		// ser anagramas
		if (frase1.length() == frase2.length()) {
			// Creamos dos for que guarde cada carácter en la tabla
			// Uno para la primera
			for (int i = 0; i < frase1.length(); i++) {
				palabra1[i] = frase1.charAt(i);
			}
			// Otro para la segunda
			for (int j = 0; j < frase2.length(); j++) {
				palabra2[j] = frase2.charAt(j);
			}

			// Ordenamos los caracteres de ambas tablas
			Arrays.sort(palabra1);
			Arrays.sort(palabra2);

			// Comparamos ambas tablas y si son iguales es un anagrama
			if (Arrays.equals(palabra1, palabra2)) {
				esAnagrama = true;
			} else {
				esAnagrama = false;
			}
		} else {
			esAnagrama = false;
		}

		// Devolvemos el resultado
		return esAnagrama;
	}
}
