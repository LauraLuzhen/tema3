package parte1;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		double numUsuario = 0;
		// Variable que guarda la suma total
		double suma = 0;
		// Variable que guarda el máximo
		double max = 0;
		// Variable que guarda el mínimo
		double min = 0;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla de longitud 10
		double tabla[] = new double[10];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que le pida al usuario 10 veces un número y los vaya guardando
		// en la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Creamos un do-while que se sale del bucle cuando no hay error
			do {
				try {
					// Le pedimos un número al usuario
					System.out.println("Introduce un número: ");
					numUsuario = reader.nextDouble();
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

		// Creamos un for-each que calcule la suma, el máximo y el mínimo
		for (double valor : tabla) {
			suma += valor;

			// Creamos un if para cambiar el max
			if (valor > max) {
				max = valor;
			}

			// Creamos un if para cambiar el min
			if (valor < min) {
				min = valor;
			}
		}

		// Imprimimos la suma, el máximo y el mínimo por pantalla
		System.out.println("La suma total es: " + suma);
		System.out.println("El máximo es " + max + " y el mínimo es " + min);

		// Cerramos el Scanner
		reader.close();
	}
}
