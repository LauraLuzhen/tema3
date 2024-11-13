package parte3;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número de filas dadas por el usuario
		int filas = 0;
		// Variable que guarda el número de columnas dadas por el usuario
		int columnas = 0;
		// Variable que indica si hay o no un error
		boolean error = false;

		// Creamos una tabla
		int tabla[][];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimso el nº de filas
				System.out.println("Introduce el número de filas: ");
				filas = reader.nextInt();
				assert (filas > 0);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error si lo hay
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos el rango de valores válidos
				System.err.println("El número debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimso el nº de columnas
				System.out.println("Introduce el número de columnas: ");
				columnas = reader.nextInt();
				assert (columnas > 0);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error si lo hay
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos el rango de valores válidos
				System.err.println("El número debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Le damos las dimensiones a la tabla
		tabla = new int[filas][columnas];

		// Creamos dos for, uno que recorre las filas y otro las columnas
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				// Calculamos e imprimimos el valor de cada celda
				tabla[i][j] = 10*i+j;
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}

		// Cerramos el Scanner
		reader.close();
	}
}
