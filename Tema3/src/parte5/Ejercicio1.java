package parte5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	// Creamos el Scanner
	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que indica si hay o no un error
		boolean error;
		// Varibale que guarda un número random
		int numRandom;
		// Variable que guarda el valor que el usuairo quiere saber
		int valor = 0;
		
		// Creamos una tabla que guarde las dimensiones de la tabla
		int dimensiones[] = longitud();
		// Creamos una tabla con las dimensiones dadas
		int tabla[][] = new int[dimensiones[0]][dimensiones[1]];
		
		// Creamos el Random
		Random rand = new Random();
		
		// Creamos dos for que rellene la tabla entera
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				// Generamos un número random y lo guardamos en la tabla
				numRandom = rand.nextInt(0, 10);
				tabla[i][j] = numRandom;
			}
		}
		
		// Creamos un do-while que le pregunte al usuario por el valor que quiere saber
		do {
			try {
				// Le pedimos el valor al usuario
				System.out.println("Introduce un valor: ");
				valor = reader.nextInt();
				assert (valor >= 0 && valor < 101);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos el rango válido de valores
				System.err.println("El valor está entre 0-100");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);
		
		// Imprimimos y llamamos a la función
		System.out.println("¿El valor " + valor + " está en la tabla? " + esta(tabla, valor));
		
		// Cerramos el Scanner
		reader.close();
	}
	
	// Función que le pide al usuario la longitud de la tabla
	static int[] longitud() {
		
		// Declaración de varibales
		// Variable que indica si hay o no  un error
		boolean error;
		
		// Creamos una tabla de longitud 2
		int t[] = new int [2];
		// Creamos una tabla que dice lo que hay en cada posicion de t[]
		String valores[] = {"filas", "columnas"};
		
		// Creamos un for que le pregunten al usuario por las filas y columnas
		for (int i = 0; i < t.length; i++) {
			// Creamos un do-while que salga del bucle cuando no haya errores
			do {
				try {
					// Le pedimos la longitud al usuario
					System.out.println("Introduce el número de " + valores[i] + ": ");
					t[i] = reader.nextInt();
					assert (t[i] > 0);
					error = false;
				} catch (Exception e) {
					// Imprimimos un mensaje de error
					System.err.println("Introduce un valor válido");
					error = true;
				} catch (AssertionError e) {
					// Imprimimos el rango de valores válidos
					System.err.println("El número de " + valores[i] + " debe ser mayor que 0");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}
		// Devolvemos la tabla con las longitudes
		return t;
	}
	
	// Función que indica si el elemnto se encuentra en la tabla o no
	static boolean esta(int t[][], int valor) {
		
		// Declaración de variables
		// Variable que indica si está o no el valor en la tabla
		boolean esta = false;
		int i = 0;
		int j = 0;
		
		// Creamos dos while que recorran la tabla uno las filas y el otro las columnas
		// Sale del bucle cuando no haya más elementos o cuando se haya encontrado el valor
		while (!esta && i < t.length) {
			while (!esta && j < t[i].length) {
				// Comparamos valores
				esta = t[i][j] == valor;
				j++;
			}
			i++;
		}
		
		// Devolvemos el valor
		return esta;
	}
}
