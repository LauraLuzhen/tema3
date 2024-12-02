package parte5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que indica si hay o no un error
		boolean error;

		// Creamos una tabla que guarda en sus posiciones las filas y las columnas de la
		// tabla
		int dimensiones[] = longitud();
		// Creamos una tabla y le damos las dimensiones dadas
		int tabla[][] = new int[dimensiones[0]][dimensiones[1]];

		// Creamos dos for que recorran la tabla entera
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				// Creamos un do-while que salga del bucle cuando no haya errores
				do {
					try {
						// Le pedimos un valor al usuairo
						System.out.println("Introduce un valor: ");
						tabla[i][j] = reader.nextInt();
						error = false;
					} catch (Exception e) {
						// Imprimimos un mensaje de error
						System.out.println("Introduce un valor válido");
						error = true;
					} finally {
						reader.nextLine();
					}
				} while (error);
			}
		}

		// Creamos dos for-each para imprimir la tabla
		System.out.println("\nTABLA");
		for (int fila[] : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		// Desordenamos la tabla
		desordenar(tabla);

		// Imrpimimos la tabla desordenada con dos for-each
		System.out.println("\nTABLA DESORDENADA");
		for (int fila[] : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		// Cerramos el Scanner
		reader.close();
	}

	// Creamos una función para recoger la longitud de la tabla
	static int[] longitud() {

		// Declaración de variables
		// Variable que indica si hay o no un error
		boolean error;

		// Creamos una tabla de longitud 2
		int t[] = new int[2];
		// Creamos una tabla que guarda que contiene en la tabla
		String valores[] = { "filas", "columnas" };

		// Creamos un for que tenga 2 iteraciones
		for (int i = 0; i < t.length; i++) {
			// Creamos un do-while que salga del bucle cunado no haya errores
			do {
				try {
					// Le pedimos las longitudes al usuario
					System.out.println("Introduce el número de " + valores[i] + ": ");
					if (i == 0) {
						t[i] = reader.nextInt();
						assert (t[i] > 0);
					} else {
						t[i] = reader.nextInt();
						assert (t[i] > 0);
					}
					error = false;
				} catch (Exception e) {
					// Imprimimos un mensaje de error
					System.err.println("Introduce un valor válido");
					error = true;
				} catch (AssertionError e) {
					// Imprimimos los valores válidos posibles
					System.out.println("El número de " + valores[i] + " debe ser mayor que 0");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}

		// Devolvemos la tabla
		return t;
	}

	// Función que desordena la tabla dimensional
	static void desordenar(int t[][]) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom1;
		int numRandom2;
		// Variable que guarda el valor de la posición
		int valor;

		// Creamos el Random
		Random rand = new Random();

		// Recorremos la tabla con dos for
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				// Generamos los números randoms
				numRandom1 = rand.nextInt(0, t.length);
				numRandom2 = rand.nextInt(0, t[i].length);

				// Desordenamos los elementos
				valor = t[i][j];
				t[i][j] = t[numRandom1][numRandom2];
				t[numRandom1][numRandom2] = valor;
			}
		}
	}

}
