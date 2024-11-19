package parte4;

// Importamos el Arrays
import java.util.Arrays;
// Importamos el Random
import java.util.Random;
// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la longitud dada por el usuario
		int longitud = 0;
		// Variable que guarda hasta que número se va a generar
		int fin = 0;
		// Variable que indica si hay o no un error
		boolean error = false;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que se sale del bucle cuando no hay errores
		do {
			try {
				// Le pedimos la longitud al usuario
				System.out.println("Introduce la longitud: ");
				longitud = reader.nextInt();
				assert (longitud > 0);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos los valores válidos que puede tomar
				System.err.println("La longitud debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Creamos un do-while que se sale del bucle cuando no hay errores
		do {
			try {
				// Le pedimos el fin al usuario
				System.out.println("Introduce hasta que número se puede generar: ");
				fin = reader.nextInt();
				assert (fin > 2);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos los valores válidos que puede tomar
				System.err.println("El valor debe ser mayor que 2");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Llamamos a la función rellenaPares
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));

		// Cerramos el Scanner
		reader.close();
	}

	static int[] rellenaPares(int longitud, int fin) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;

		// Creamos una tabla de longitud dada por el usuario
		int tabla[] = new int[longitud];

		// Creamos el Random
		Random rand = new Random();

		// Creamos un for que genere un número random según el rango y si es par lo
		// guarda en la tabla
		for (int i = 0; i < tabla.length; i++) {
			numRandom = rand.nextInt(2, fin + 1);
			while (numRandom % 2 != 0) {
				numRandom = rand.nextInt(2, fin + 1);
			}
			tabla[i] = numRandom;
		}

		// Devuelve una tabla
		return tabla;
	}
}
