package parte4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la longitud de la tabla que dice el usuario
		int longitud = 0;
		// Variable que guarda el número de elementos que vamos a agrupar
		int numAgrupar = 0;
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

		// Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimos al usuario el número a agrupar
				System.out.println("Los elementos se agrupan en: ");
				numAgrupar = reader.nextInt();
				assert (numAgrupar > 0 && (longitud % numAgrupar == 0) && numAgrupar <= longitud);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos los valores válidos que acepta
				System.err.println(
						"La agrupación debe ser entre 0 y " + longitud + " y debe ser un divisor de " + longitud);
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Llamamos e imprimimos la función suma
		System.out.println(Arrays.toString(suma(tabla, numAgrupar)));

		// Cerramos el Scanner
		reader.close();
	}

	static int[] suma(int t[], int numElementos) {

		// Declaración de variables
		// Variable que guarda la longitud de la tabla final
		int longitud = t.length - numElementos + 1;

		// Creamos una tablaSuma que será la final con la longitud calculada
		int tablaSuma[] = new int[longitud];

		// Creamos dos for para calcular la suma y guardarlo en la tabla final
		for (int i = 0; i < longitud; i++) {
			for (int j = i; j < i + numElementos; j++) {
				tablaSuma[i] = tablaSuma[i] + t[j];
			}
		}

		// Devolvemos la tabla final
		return tablaSuma;
	}
}
