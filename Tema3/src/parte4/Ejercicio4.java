package parte4;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la longitud de la tabla que dice el usuario
		int longitud = 0;
		// Varibale que guarda el número que queremos saber si está en la tabla
		int clave = 0;
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
				// Le pedimos el número que queremos saber si está
				System.out.println("Introduce el valor que quieras saber: ");
				clave = reader.nextInt();
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Llamamos a la función buscar
		System.out.println(buscar(tabla, clave));

		// Cerramos el Scanner
		reader.close();
	}

	static int buscar(int t[], int clave) {

		// Dclaración de variables
		// Variable que inicia el índice de búsqueda
		int indiceBusqueda = 0;
		// Variabe que guarda el resultado a imprimir
		int buscar;

		// Creamos un while que vaya aumentando el índice de búsqueda hasta que
		// encuentre la clave
		while (indiceBusqueda < t.length && clave != t[indiceBusqueda]) {
			indiceBusqueda++;
		}

		// Creamos un if-else que le de el valor del índice de la clave a buscar
		if (indiceBusqueda < t.length) {
			buscar = indiceBusqueda;
		} else {
			buscar = -1;
		}

		// Devolvemos buscar
		return buscar;
	}
}
