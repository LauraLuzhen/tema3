package parte1;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por le usuario
		double numUsuario = 0;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla de longitud 5
		double tabla[] = new double[5];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que le pida 5 veces al usuario un número y que lo guarde en la
		// tabla
		for (int i = 0; i < tabla.length; i++) {
			// Creamos un do-while que compruebe si hay o no errores
			do {
				try {
					// Le pedimos un número al usuario
					System.out.println("Introduce un número: ");
					numUsuario = reader.nextDouble();
					error = false;
				} catch (Exception e) {
					// Imprimimos el error en caso de que ocurra
					System.err.println("El valor introducido no es válido");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error == true);

			// Guardamos el número del usuario en la tabla
			tabla[i] = numUsuario;
		}

		// Creamos un for-each que imprima los elementos de la tabla en el mismo orden
		// que han sido introducidos por el usuario
		for (double valor : tabla) {
			System.out.println(valor);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
