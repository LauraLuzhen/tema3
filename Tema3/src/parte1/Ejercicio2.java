package parte1;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número del usuario
		double numUsuario = 0;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla de longitud 5
		double numeros[] = new double[5];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que guarde el número del usuario en la tabla numeros[]
		for (int i = 0; i < numeros.length; i++) {
			do {
				try {
					System.out.println("Introduce un número decimal: ");
					numUsuario = reader.nextDouble();
					error = false;
				} catch (Exception e) {
					System.err.println("Introduce un valor válido");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error == true);

			numeros[i] = numUsuario;
		}

		// Creamos un for que imprima cada elemento de la tabla numeros[]
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
