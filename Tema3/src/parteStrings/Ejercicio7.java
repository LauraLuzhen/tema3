package parteStrings;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase introducida por el usuario
		String frase;
		// Variable que guarda la palabra que queremos saber cuántas veces se repite
		String palabra;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimso la frase al usuario
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine();

		// Le pedimos la palabra al usuario
		System.out.println("Introduce la palabra que quieras saber cuántas veces se repite en la frase: ");
		palabra = reader.next();

		// Llamamos la función y la immprimimos
		System.out.println("La palabra " + palabra + " aparece " + repetidor(frase, palabra) + " veces.");

		// Cerramos el Scanner
		reader.close();
	}

	// Función que devuelve cuántas veces se repite una palabra en una cadena
	static int repetidor(String f, String p) {

		// Declaración de variables
		// Variable que gaurda la cantidad de veces que se repite
		int contador = 0;
		// Variable que guarda la posición donde se encuentra la palabra a buscar
		int pos = 0;
		// Variable que guarda el indice donde empezar a buscar
		int indice = 0;

		// Creamos un while que salga del bucle cuando no encuentre la palabra
		while (pos >= 0) {
			// Buscamos la palabra
			pos = f.indexOf(p, indice);
			// Si la encuentra modificamos el índice para seguir buscando en la parte de la
			// cadena que falta
			if (pos >= 0) {
				indice = pos + 1;
				// Aumentamos el contador
				contador++;
			}
		}

		// Devolvemos el resultado
		return contador;
	}
}
