package parte4;

import java.util.InputMismatchException;
// Importamos el Scanner
import java.util.Scanner;

public class EjercicioBidimensional2 {

	static Scanner reader=new Scanner(System.in);
	
	public static void main(String[] args) {

		// Declaración de variables
		// Variable que indica si hay o no errores
		boolean error = false;

		// Creamos una tabla bidimensional que guarde la longitud de la tabla
		int[] dimensiones = longitud();
		// Creamos una tabla
		int tabla[][] = new int[dimensiones[0]][dimensiones[1]];
		// Creamos una tabla que sea la traspuesta
		int traspuesta[][];
		
		// Creamos un do-while que se salga del bucle cuando no haya errores
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				do {
					try {
						// Le pedimos al usuario un valor
						System.out.println("Introduce un valor de la tabla: ");
						tabla[i][j] = reader.nextInt();
						error = false;
					} catch (InputMismatchException e) {
						// Imprimimos un mensaje de erro
						System.err.println("Introduce un valor válido");
						error = true;
					} finally {
						reader.nextLine();
					}
				} while (error);
			}
		}

		// Creamos dos for para imprimir la tabla
		System.out.println("MATRIZ");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print("\t" + tabla[i][j]);
			}
			System.out.println();
		}

		// Llamamos a la función y la guardamos en la variable traspuesta
		traspuesta = traspuesta(tabla);

		// Creamos dos for-each para imprimir la traspuesta
		System.out.println("MATRIZ TRASPUESTA");
		System.out.println("\t");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print("\t" + traspuesta[i][j]);
			}
			System.out.println();
		}
		
		// Cerramos el Scanner
		reader.close();
	}
	
	static int[] longitud() {
		
		// Declaración de variables
		// Variable que indica si hay o no error
		boolean error = false;
		
		// Creamos una tabla bidimensional
		int[] tabla = new int[2];
		String[] valores = {"filas", "columnas"};
			
		for (int i=0; i<2; i++) {
			// Creamos un do-while que salga del bucle cuando no haya errores
			do {
				try {
					// Le pedimos la longitud al usuario
					System.out.println("Introduce el número de " + valores[i] + " de la tabla: ");
					if (i==0) {
						tabla[0] = reader.nextInt();
						assert (tabla[0] > 0);
					} else {
						tabla[1] = reader.nextInt();
						assert (tabla[1] > 0);
					}
					error = false;
				} catch (Exception e) {
					// Imprimimos un mensaje de error
					System.err.println("Introduce un valor válido");
					error = true;
				} catch (AssertionError e) {
					// Imprimimos el rango de valores válidos
					System.err.println("Las " + valores[i] + " deben ser mayor que 0");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}
		
		// Devolvemos la tabla
		return tabla;
	}

	static int[][] traspuesta(int t[][]) {

		// Declaración de variables
		// Variable que guarda la longitud de la tabla
		int longitud = t.length;
		
		// Creamos una tabla que guarda la traspuesta de t[]
		int traspuesta[][] = new int[longitud][longitud];

		// Creamos dos for que recorran la t[] y lo guarde en la traspuesta[]
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				traspuesta[j][i] = t[i][j];
			}
		}

		// Devuelve la tabla traspuesta
		return traspuesta;
	}
}
