package parte1;

// Importamos el Random
import java.util.Random;
// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Declaración de variables
		// Varibale que guarda un número random
		int numRandom;
		// Variable que guarda el número introducido por el usuario
		int numUsuario = 0;
		// Variable que guarda la posición de un valor
		int posicion = 0;
		// Variable que indica si el número del usuario está o no en la tabla
		boolean numEncontrado = false;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos un tabla de longitud 100
		int tabla[] = new int[100];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos el Random
		Random rand = new Random();

		// Creamos un for que rellene la tabla con números randoms
		for (int i = 0; i < tabla.length; i++) {
			// Inicializamos el número random con un número random del 1-10
			numRandom = rand.nextInt(1, 11);

			// Guardamos el número random en la tabla
			tabla[i] = numRandom;
		}

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

		// Creamos un for-each que imprima si el número del usuario está o no en la
		// tabla
		for (int valor : tabla) {
			// Creamos un if que si el valor y el número de usuario coinciden entonces el
			// numUsuario está en la tabla e indicamos la posición donde se encuentra
			if (valor == numUsuario) {
				// Si el número está en la tabla imprimimos la posición en la que está
				System.out.println("El número " + numUsuario + " se encuentra en la posición " + posicion);

				// Indicamos que hemos encontrado el número
				numEncontrado = true;
			}

			// Vamos aumentando el número de la posición
			posicion++;
		}

		// Creamos un if que si el número no ha sido encontrado en la tabla lo imprima
		// por pantalla
		if (!numEncontrado) {
			System.out.println("El número " + numUsuario + " no se encuentra en la tabla");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
