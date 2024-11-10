package parte2;

import java.util.Arrays;
// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int numUsuario = 0;
		// Variable que guarda el índice
		int indice = 7;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla de longitud 8
		int puntuaciones[] = new int[8];
		// Creamos una tabla de longitud 8 que será la tabla ordenada
		int puntuacionesOrdenadas[] = new int[8];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que le pida 8 puntuaciones al usuario y los guarde en la tabla
		// puntuaciones[]
		for (int i = 1; i <= puntuaciones.length; i++) {
			// Creamos un do-while que se salga del bucle cuando no haya errores
			do {
				try {
					// Le pedimos un número al usuario
					System.out.println("Introduce la puntuación del jugador " + i + ": ");
					numUsuario = reader.nextInt();
					assert (numUsuario >= 1000 && numUsuario <= 2800);
					error = false;
				} catch (Exception e) {
					// Imprimimos el error si ocurre
					System.err.println("Introduce un valor válido");
					error = true;
				} catch (AssertionError e) {
					// Imprimimos los valores válidos
					System.out.println("Introduce un valor entre 1000-2800");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error == true);

			// Guardamos el número del usuario en la tabla puntuaciones []
			puntuaciones[i-1] = numUsuario;
		}

		// Ordenamos la tabla de forma ascendente usando el método sort
		Arrays.sort(puntuaciones);

		// Creamos un for-each que ordene de forma descendente la tabla
		for (int puntuacion : puntuaciones) {
			puntuacionesOrdenadas[indice] = puntuacion;
			indice--;
		}

		// Imprimimos la tabla ya ordenada
		System.out.println(Arrays.toString(puntuacionesOrdenadas));

		// Cerramos el Scanner
		reader.close();
	}
}
