package parte5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;
		// Variable que guarda un valor
		int valor = 0;
		// Variable que indica si hay o no error
		boolean error = false;
		
		// Creamos una tabla bidimensional que guarde la longitud de la tabla
		int[] dimensiones = longitud();
		// Creamos una tabla bidimensional
		int tabla[][] = new int[dimensiones[0]][dimensiones[1]];
		
		// Creamos el Random
		Random rand = new Random();
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		// Creamos dos for que recorra las filas y columnas de la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				// Generamos un número random y lo añadimos a la tabla
				numRandom = rand.nextInt(0, 1000);
				tabla[i][j] = numRandom;
			}
		}
		
		// Creamos un do-while que se salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimos al usuario un valor
				System.out.println("¿Qué valor crees que está en la tabla? (0-1000): ");
				valor = reader.nextInt();
				assert (valor > 0 && valor < 1001);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de erro
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos el rango de valores válidos
				System.err.println("El valor debe estar entre 0 y 1000");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);
		
		System.out.println(presente(tabla, valor));
		
		// Cerramos el Scanner
		reader.close();
	}
	
	static int[] longitud() {
		
		// Declaración de variables
		// Variable que indica si hay o no error
		boolean error = false;
		
		// Creamos una tabla bidimensional
		int[] tabla = new int[2];
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		for (int i=0; i<2; i++) {
			// Creamos un do-while que salga del bucle cuando no haya errores
			do {
				try {
					// Le pedimos la longitud al usuario
					System.out.println("Introduce la longitud de la tabla: ");
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
					System.err.println("La longitud deben ser mayor que 0");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error == true);
		}
		
		// Cerramos el Scanner
		reader.close();
		
		// Devolvemos la tabla
		return tabla;
	}
	
	static boolean presente(int t[][], int valor) {
		
		// Declaración de variables
		// Variable que indica si está o no en la tabla
		boolean noPresente = true;
		
		while ()
	}
}
