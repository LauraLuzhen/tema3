package parte1;

// Importamos el Random
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;

		// Creamos una tabla de longitud 10
		int numeros[] = new int[10];

		// Creamos el Random
		Random rand = new Random();

		// Creamos un for que añada el número random
		for (int i = 0; i < numeros.length; i++) {
			// Inicializamos la var. con un número random
			numRandom = rand.nextInt(1, 101);
			numeros[i] = numRandom;
		}

		// Creamos un for-each que imprima cada elemento de la tabla numeros[]
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}
