package parte4;

import java.util.Arrays;
// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la longitud de la tabla que dice el usuario
		int longitud = 0;
		// Varibale que guarda el número que queremos saber si está en la tabla
		int valor = 0;
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
		} while (error == true);

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
				// Le pedimos el número que queremos saber si está
				System.out.println("Introduce el valor que quieras saber: ");
				valor = reader.nextInt();
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Llamamos e imprimimos la función buscarTodos
		System.out.println(Arrays.toString(buscarTodos(tabla, valor)));

		// Cerramos el Scanner
		reader.close();
	}

	static int[] buscarTodos(int t[], int valor) {

		// Declaración de variables
		// Variable que guarda el índice de los elementos de la tabla final
		int indice = 0;
		// Variable que guarda el índice de t[] que contenga el valor
		int indiceValor = 0;
		// Variable que guarda la longitud de la tabla final
		int longitud = 0;

		// Creamos la tabla final
		int tablaValor[];

		// Creamos un for-each que calcule la longitud de la tabla final que va a
		// contener los índices de t[] que tengan el valor
		for (int elemento : t) {
			if (elemento == valor) {
				longitud++;
			}
		}

		// Le damos la longitud obtenida a la tabla final
		tablaValor = new int[longitud];

		// Creamos un for-each que almacene los índices encontrados de t[] en la tabla
		// final
		for (int elemento : t) {
			if (elemento == valor) {
				tablaValor[indice] = indiceValor;
				indice++;
			}
			indiceValor++;
		}

		// Devolvemos la tabla final
		return tablaValor;
	}
}
