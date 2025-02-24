package collections2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Ej2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número aleatorio generado
		int num;

		// Constante que guarda la cantidad de númeror a generar
		final int GENERAR = 10;

		// Creamos la lista
		Set<Integer> lista = new LinkedHashSet<Integer>();

		// Creamos el Random
		Random rand = new Random();

		// Do-while que sale del bucle cuando la lista tenga la misma longitud que las
		// que pedimos
		do {
			// Genramos un número aleatorio
			num = rand.nextInt(1, 21);
			// Lo guardamos en la lista
			lista.add(num);
		} while (lista.size() < GENERAR);

		// Imprimimos la lista
		System.out.println(lista);
	}
}
