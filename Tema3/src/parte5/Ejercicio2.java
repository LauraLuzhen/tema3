package parte5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que indica si hay o no un error
		boolean error;
		// Variable que guarda la longitud de la tabla
		int longitud = 0;

		// Creamos una tabla
		int tabla[];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimos la longitud al usuario
				System.out.println("Introduce la longitud de la tabla: ");
				longitud = reader.nextInt();
				assert (longitud > 0);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos los valores válidos que permite
				System.err.println("La longitud de la tabla debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Le damos la longitud a la tabla
		tabla = new int[longitud];

		// Creamos un for que vaya recorriendo la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Creamos un do-while que salga del bucle cuando no haya errores
			do {
				try {
					// Le pedimos un elemento al usuario
					System.out.println("Introduce un valor: ");
					tabla[i] = reader.nextInt();
				} catch (Exception e) {
					// Imprimimos un mensaje de error
					System.err.println("Introduce un valor válido");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}

		// Imprimimos la tabla originar
		System.out.println("La tabla es:\n" + Arrays.toString(tabla));

		// Llamamos a la función para desordenar la tabla
		desordenar(tabla);

		// Imprimimos la tabla desordenada
		System.out.println("La tabla desordenada:\n" + Arrays.toString(tabla));

		// Cerramos el Scanner
		reader.close();
	}

	static void desordenar(int t[]) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;
		// Variable que guarda el contenido
		int contenido;

		// Creamos el Random
		Random rand = new Random();

		for (int i = 0; i < t.length; i++) {
			// Generamos un número random
			numRandom = rand.nextInt(0, t.length);
			// Intercambiamos los valores
			contenido = t[i];
			t[i] = t[numRandom];
			t[numRandom] = contenido;
		}
	}
}
