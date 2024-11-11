package parte2;

import java.util.Arrays;
// Importamos el Random
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda un número random para la primitiva
		int numPrimitiva;
		// Variable que guarda un número random para la combinación ganadora
		int numCombinacionGanadora;
		// Variable que iguala dos tabla
		boolean igual;
		// Variable que cuenta cuántos aciertos hay
		int numAciertos = 0;

		// Creamos una tabla de longitud 6 que guarda los números de la primitiva
		int numerosPrimitiva[] = new int[6];
		// Creamos una tabla de longitud 6 que guarda la combinación ganadora
		int combinacionGanadora[] = new int[6];

		// Creamos el Random
		Random rand = new Random();

		// Creamos un for que genere dos número randoms y los guarde cada uno en una
		// tabla
		for (int i = 0; i < numerosPrimitiva.length; i++) {
			numCombinacionGanadora = rand.nextInt(1, 50);
			numPrimitiva = rand.nextInt(1, 50);

			combinacionGanadora[i] = numCombinacionGanadora;
			numerosPrimitiva[i] = numPrimitiva;
		}

		//Ordenamos la tabla ganadora
		Arrays.sort(combinacionGanadora);
		
		// Comparamos las dos tablas usando .equals
		igual = Arrays.equals(numerosPrimitiva, combinacionGanadora);

		// Creamos un if-else que si ambas tablas son iguales se ganará la primitiva
		if (!igual) {
			// Si son diferentes ambas tablas creamos un for que recorra cada elemento de
			// ambas tablas
			for (int i = 0; i < numerosPrimitiva.length; i++) {
				// Creamos un if que compare dichos elementos en las mismas posiciones
				if (numerosPrimitiva[i] == combinacionGanadora[i]) {
					// Aumentamos el número de aciertos
					numAciertos++;
				}
			}
			// Imprimimos el número de aciertos
			System.out.println("Has acertado " + numAciertos + " números");
		} else {
			System.out.println("HAS GANADO");
		}
	}
}
