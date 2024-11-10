package parte2;

import java.util.Arrays;
// Importamos el Random
import java.util.Random;
// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;
		// Variable que guarda un número introducido por el usuario
		int numUsuario = 0;
		// Variable que indica si el número existe o no dentro del array
		int existe;
		// Variable que guarda el número de veces que se repite el numUsuario en el
		// array
		int numVeces = 0;
		// Variable que indica si hay o no un error
		boolean error = false;

		// Creamos una tabla de longitud 1000
		int tabla[] = new int[1000];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos el Random
		Random rand = new Random();

		// Creamos un for que guarde 1000 números randoms en la tabla[]
		for (int i = 0; i < tabla.length; i++) {
			// Generamos un número random entre el 0-99
			numRandom = rand.nextInt(0, 100);

			// Guardamos el numRandom en la tabla
			tabla[i] = numRandom;
		}

		// Creamos un do-while que se salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimos un número al usuario
				System.out.println("Introduce un número: ");
				numUsuario = reader.nextInt();
				assert (numUsuario >= 0 && numUsuario < 100);
				error = false;
			} catch (Exception e) {
				// Imprimimos el error si ocurre
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Indicamos el rango de valores admitidos
				System.err.println("Introduce un valor entre el 0-99");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Ordenamos la tabla[] en orden creciente
		Arrays.sort(tabla);

		// Comprobamos si existe el numUsuario en la tabla con el método binarySearch
		existe = Arrays.binarySearch(tabla, numUsuario);
		// Creamos un if-else que imprima si el numUsuario está o no en la tabla
		if (existe >= 0) {
			System.out.println("El número " + numUsuario + " está dentro de la tabla");
		} else {
			System.out.println("El número " + numUsuario + " no está dentro de la tabla");
		}

		// Creamos un for-each que cuente cuántas veces aparece numUsuario en la tabla
		for (int valor : tabla) {
			if (valor == numUsuario) {
				numVeces++;
			}
		}

		// Imprimimos el número de veces
		System.out.println("El número " + numUsuario + " aparece " + numVeces + " veces");

		// Cerramos el Scanner
		reader.close();
	}
}
