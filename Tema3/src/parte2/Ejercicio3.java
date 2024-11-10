package parte2;

import java.util.Arrays;
// Importamos el Random
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;

		// Creamos una tabla de longitud 30
		int tabla[] = new int[30];

		// Creamos el Random
		Random rand = new Random();

		// Creamos un for que guarde 30 números random en la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Generamos un número random del 0-9
			numRandom = rand.nextInt(0, 10);

			// Guardamos en la tabla
			tabla[i] = numRandom;
		}

		// Ordenamos la tabla con el método sort
		Arrays.sort(tabla);

		// Imprimimos la tabla con el método toString
		System.out.println(Arrays.toString(tabla));
	}
}
