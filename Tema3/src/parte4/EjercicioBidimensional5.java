package parte4;

// Importamos el Scanner
import java.util.Scanner;

public class EjercicioBidimensional5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la longitud de la tabla
		int longitud = 0;
		// Variable que guarda un elemento de la tabla
		int elemento = 0;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla
		int tabla[][];
		// Creamos una tabla que será la girada 90º
		int tablaGirada[][];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimos la longitud de la tabla al usuario
				System.out.println("Introduce la longitud de la tabla bidimensional: ");
				longitud = reader.nextInt();
				assert (longitud > 0);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos los valores permitidos
				System.err.println("La longitud debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Le damos la longitud a la tabla[][]
		tabla = new int[longitud][longitud];

		// Creamos un for que vaya rellenando la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				// Creamos un do-while que se salga del bucle cuando no haya errores
				do {
					try {
						// Le pedimos un elemento de la tabla al usuario
						System.out.println("Introduce un valor para un elemento de la tabla: ");
						elemento = reader.nextInt();
						error = false;
					} catch (Exception e) {
						// Imprimimos un mensaje de error
						System.err.println("Introduce un valor válido");
						error = true;
					} finally {
						reader.nextLine();
					}
				} while (error == true);

				// Guardamos el valor del elemento en la tabla
				tabla[i][j] = elemento;
			}
		}

		// Cremamos dos for-each para imprimir la tabla inicial
		System.out.println("TABLA INICIAL");
		for (int[] fila : tabla) {
			for (int valor : fila) {
				System.out.print("\t" + valor);
			}
			System.out.println();
		}

		// Llamamos a la función
		tablaGirada = gira90(tabla);

		// Creamos dos for-each para imprimir la tabla girada
		System.out.println("\nTABLA GIRADA 90º");
		for (int[] fila : tablaGirada) {
			for (int valor : fila) {
				System.out.print("\t" + valor);
			}
			System.out.println();
		}

		// Cerramos el Scanner
		reader.close();
	}

	static int[][] gira90(int tablaInicio[][]) {

		// Declaracón de variables
		// Variable que guarda la longitud de la tablaInicio
		int longitudInicial = tablaInicio.length;
		// Variable que guarda la posición para girar 90º la tabla
		int posicionGiro = longitudInicial - 1;

		// Creamos una tablaFinal con la longitud de la tablaInicial
		int tablaFinal[][] = new int[longitudInicial][longitudInicial];

		// Creamos dos for uno para las filas y otro para las columnas
		for (int i = 0; i < tablaInicio.length; i++) {
			for (int j = 0; j < tablaInicio[i].length; j++) {
				tablaFinal[i][j] = tablaInicio[posicionGiro][i];
				posicionGiro--;
			}
			posicionGiro = longitudInicial - 1;
		}

		// Devolvemos la tablaFinal
		return tablaFinal;
	}
}
