package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número del usuario
		int numUsuario = 0;
		// Variable que indica si hay o no un error
		boolean error = false;

		// Creamos una tabla de longitud 10
		int numerosInverso[] = new int[10];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que guarde el número del usuario en la lista numInverso[]
		for (int i = 0; i < numerosInverso.length; i++) {
			// Creamos un do-while que sale del bucle cuando no hay errores
			do {
				try {
					// Le pedimos un número al usuario
					System.out.println("Introduce un número entero: ");
					numUsuario = reader.nextInt();
					error = false;
				} catch (Exception e) {
					System.err.println("Introduce un valor válido");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error == true);

			numerosInverso[i] = numUsuario;
		}

		// Creamos un for que imprima los elementos de la tabla numInverso[] de su orden
		// contrario
		for (int i = numerosInverso.length - 1; i >= 0; i--) {
			System.out.println(numerosInverso[i]);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
