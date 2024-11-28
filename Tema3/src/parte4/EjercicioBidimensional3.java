package parte4;

import java.util.Scanner;

public class EjercicioBidimensional3 {

	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el elemento de la tabla
		int elemento = 0;
		// Variable que indica si hay o no un error
		boolean error = false;

		// Creamos una tabla bidimensional que guarde la longitud de la tabla
		int[] dimensiones = longitud();
		// Creamos una tabla
		int tabla[][] = new int[dimensiones[0]][dimensiones[1]];

		// Creamos dos for que le pida los elementos al usuario y los guarda en la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				// Creamos un do-while que sale del bucle cuando no haya errores
				do {
					try {
						// Le pedimos un elemento al usuario para la tabla
						System.out.println("Introduce un número: ");
						elemento = reader.nextInt();
						error = false;
					} catch (Exception e) {
						// Imprimimos un mensaje de error
						System.err.println("Introduce un valor válido");
						error = true;
					} finally {
						reader.nextLine();
					}
				} while (error);
				
				tabla[i][j] = elemento;
			}
		}

		boolean simetrica = simetrica(tabla);
		// Llamamos e imprimimos la función
		System.out.println("¿La tabla es simétrica? " + simetrica);

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
	
	static boolean simetrica(int t[][]) {

		// Declaración de variables
		// Variable que indica si es simétrica o no
		boolean simetrica = true;
		// Variables para recorrer la tabla
		int i = 0;
		int j = 0;
		
		while (simetrica && i < t.length) {
			while (simetrica && j < t[i].length) {
				simetrica = t[i][j] == t[j][i];
				j++;
			}
			i++;
		}
		
		// Devolvemos el resultado
		return simetrica;
	}
}
