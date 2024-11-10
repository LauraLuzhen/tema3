package parte1;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int numUsuario = 0;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos un tabla de longitud 10
		int tabla[] = new int[10];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que guarde los números introducidos por el usuario en una
		// tabla
		for (int i = 0; i < tabla.length; i++) {
			// Creamos un do-while que salga del bucle cuando no se produzca ningún error
			do {
				try {
					// Le pedimos un número al usuario
					System.out.println("Introduce un número: ");
					numUsuario = reader.nextInt();
					error = false;
				} catch (Exception e) {
					// Imprimimos el error en caso de que ocurra
					System.err.println("Introduce un valor válido");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error == true);

			// Guardamos el número del usuario en la tabla
			tabla[i] = numUsuario;
		}

		// Creamos un for que imprima los elementos de la tabla en orden inverso
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
