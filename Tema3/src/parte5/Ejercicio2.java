package parte5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda la longitud de la tabla
		int longitud = 0;
		// Variable que indica si hay o no error
		boolean error = false;
		
		// Creamos una tabla unidimensional
		int tabla[];
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		// Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimos la longitud al usuario
				System.out.println("Introduce la longitud de la tabla: ");
				longitud = reader.nextInt();
				assert (longitud > 0);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Indicamos los valores válidos
				System.err.println("La longitud debe ser mayor que 0");
				error = true;
			}
		} while (error);
		
		// Le damos la longitud del usuario a la tabla
		tabla = new int[longitud];
		
		// Creamos un for que le pida al usuario los elementos de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Creamos un do-while que salga del bucle cuando no haya errores
			do {
				try {
					// Le pedimos un elemento al usuario
					System.out.println("Introduce un elemento de la tabla: ");
					tabla[i] = reader.nextInt();
					error = false;
				} catch (Exception e) {
					// Imprimimos un mensaje de error
					System.err.println("Introduce un valor válido");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}
		
		for (int elemento: tabla) {
			System.out.print(elemento + "\t");
		}
		
		reader.close();
	}
	
	static void desordenar(int t[]) {
		int pos;
		int aux;
		Random rand = new Random();
		for (int i = t.length-1; i > 0; i--) {
			pos = rand.nextInt(0, t.length);
			
			aux = t[i];
			
			t[i] = t[pos];
			
			t[pos] = aux;
		}
	}
}
