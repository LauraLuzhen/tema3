package parte2;

import java.util.Arrays;
// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el tamaño introducido por el usuairo
		int tamaño = 0;
		// Variable que guarda el valor introducido por el usuario
		int valor = 0;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla
		int tabla[];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que sale del bucle cuando no haya errores
		// Uno para pedir el tamaño
		do {
			try {
				// Le pedimos un número al usuario
				System.out.println("Introduce el tamaño: ");
				tamaño = reader.nextInt();
				assert (tamaño > 0);
				error = false;
			} catch (Exception e) {
				// Imprimimos el error si ocurre
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos un mensaje en caso de no cumplir con el rango
				System.err.println("El tamaño debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Uno para pedir el valor
		do {
			try {
				// Le pedimos un número al usuario
				System.out.println("Introduce un valor: ");
				valor = reader.nextInt();
				error = false;
			} catch (Exception e) {
				// Imprimimos el error si ocurre
				System.err.println("Introduce un valor válido");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Le damos a la tabla[] la longitud del tamaño introducido por el usuario
		tabla = new int[tamaño];

		// Inicializamos todos los elementos de la tabla[] a el valor introducido por el
		// usuario
		Arrays.fill(tabla, valor);

		// Imprimimos la tabla[]
		System.out.println(Arrays.toString(tabla));

		// Cerramos el Scanner
		reader.close();
	}
}
