package parte1;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int numUsuario = 0;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla de longitud 8
		int tabla[] = new int[8];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que le pida al usuario 8 veces un número y los almacene en la
		// tabla
		for (int i = 0; i < tabla.length; i++) {
			// Creamos un do-while que salga del bucle cuando no haya errores
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

			// Guardamos el número del usuario en la tabla
			tabla[i] = numUsuario;
		}

		// Creamos un for-each que imprima cada elemento y diga si es par o impar
		for (int valor : tabla) {
			// Creamos un if-else que si se cumple la condición imprima que es par y sino
			// impar
			if (valor % 2 == 0) {
				System.out.println("El " + valor + " es par");
			} else {
				System.out.println("El " + valor + " es impar");
			}
		}

		// Cerramos el Scanner
		reader.close();
	}
}
