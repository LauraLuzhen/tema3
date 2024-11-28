package parte4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la longitud de la tabla que dice el usuario
		int longitud = 0;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla
		int tabla[];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimos una longitud al usuario
				System.out.println("Introduce la longitud de la tabla: ");
				longitud = reader.nextInt();
				assert (longitud > 0);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error si se produce
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos los valores válidos
				System.err.println("La longitud debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Le damos la longitud del ususario a la tabla
		tabla = new int[longitud];

		// Creamos un for que le pida los elementos de la tabla al usuario
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce un elemento de la tabla: ");

			// Guardamos en la posición los datos del usuario
			tabla[i] = reader.nextInt();
		}

		// Llamamos la función maximo
		System.out.println(maximo(tabla));

		// Cerramos el Scanner
		reader.close();
	}

	static int maximo(int t[]) {

		// Declaración de variables
		// Variable que guarda el valor máximo
		int max = t[0];

		// Creamos un for-each
		for (int elemento : t) {
			// Creamos un if si el elemento es mayor que le máximo se cambia el valor
			if (elemento > max) {
				max = elemento;
			}
		}

		// Devuelve el valro máximo
		return max;
	}
}
