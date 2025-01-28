package collections2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Ej2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;
		// Variable que guarda la cantidad de números que han sido insertados en el
		// conjunto
		int numInsertados = 0;

		// Constante que indica la cantidad de números se vab a guardar en el conjunto
		final int CANTIDAD = 10;

		// Creamos el conjunto LinkedHashSet
		Set<Integer> numerosUnicos = new LinkedHashSet<>();

		// Creamos el Random
		Random rand = new Random();

		// While que sale del bucle cuando se han insertado la CANTIDAD indicada en el
		// conjunto
		while (numInsertados < CANTIDAD) {

			// Generamos un número random del 1 al 20
			numRandom = rand.nextInt(1, 21);

			// Añadimos el numRandom al conjunto
			numerosUnicos.add(numRandom);

			// If que en caso de que no contenga el número generado en el conjunto aumenta
			// el numInsertados
			if (!numerosUnicos.contains(numRandom)) {
				numInsertados++;
			}
		}

		// Imprimimos el conjunto
		System.out.println(numerosUnicos);
	}
}
