package collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ej4 {

	public static void main(String[] args) {
		/*
		 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
		 * distintos, menores que 100, en una colección. Hay que asegurarse de que se
		 * guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
		 * mostrará la colección resultante por pantalla.
		 */
		
		int numRandom;
		final int CANTIDAD = 20;
		
		Random rand = new Random();
		
		Set<Integer> numeros = new TreeSet<>();
		
		while (numeros.size() < CANTIDAD) {
			numRandom = rand.nextInt(0, 100);
			
			numeros.add(numRandom);
		}
		
		System.out.println(numeros);
	}
}
