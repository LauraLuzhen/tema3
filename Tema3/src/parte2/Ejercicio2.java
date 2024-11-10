package parte2;

import java.util.Arrays;
// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int numUsuario = 0;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla de longitud 10
		int tabla1[] = new int[10];
		// Creamos una tabla de longitud 10
		int tabla2[] = new int[10];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que le pida 20 números al usuario
		for (int i = 0; i < 20; i++) {
			// Creamos un do-while que salga del bucle cuando no hay errores
			do {
				try {
					// Le pedimos un número al usuario
					System.out.println("Introduce un número: ");
					numUsuario = reader.nextInt();
					error = false;
				} catch (Exception e) {
					// Imprimimos el error si ocurre
					System.err.println("Introduce un valor válido");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error == true);

			// Creamos un if-else que guarda los números introducidos por le usuario los 10
			// primeros en la tabla1[] y los 10 últimos en la tabla2[]
			if (i >= 0 || i < 10) {
				for (int j = 0; j < tabla1.length; j++) {
					tabla1[j] = numUsuario;
				}
			} else {
				for (int k = 0; k < tabla2.length; k++) {
					tabla2[k] = numUsuario;
				}
			}
		}

		// Imprimimos el resultado utilizando .equals de la clase Arrays
		System.out.println("¿Las tablas son iguales? " + Arrays.equals(tabla1, tabla2));

		// Cerramos el Scanner
		reader.close();
	}
}
