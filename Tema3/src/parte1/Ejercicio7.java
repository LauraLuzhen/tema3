package parte1;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int numUsuario = 0;
		// Variabe que indica si hay o no error
		boolean error = false;

		// Creamos un tabla de longitud 12
		int temperaturas[] = new int[12];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que le pida la temperatura media de cada mes y la guarde en la
		// tabla temperaturas[]
		for (int i = 0; i < temperaturas.length; i++) {
			// Creamos un do-while que sale del bucle cuando no haya errores
			do {
				try {
					// Le pedimos un número al usuario
					System.out.println("Introduce la temperatura media del mes: ");
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

			// Guardamos el número del usuario en la tabla
			temperaturas[i] = numUsuario;
		}

		// Diagrama de barras
		System.out.println("DIAGRAMA DE BARRAS: temperatura media de cada mes");

		// Creamos un for-each que imprima un diagrama de barras visualizando las
		// temperaturas de cada mes
		for (int temperatura : temperaturas) {
			for (int i = 0; i < temperatura; i++) {
				System.out.print("*");
			}

			// Salto de línea para mostrar la siguiente barra
			System.out.println();
		}

		// Cerramos el Scanner
		reader.close();
	}
}
