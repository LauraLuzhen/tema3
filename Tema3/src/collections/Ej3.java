package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ej3 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que genere 30 números enteros aleatorios, con valores
		 * comprendidos entre 1 y 10. Se deben almacenar en una colección de forma
		 * ordenada. Pinta la colección por consola una vez rellena.
		 */
		
		int numRandom;
		final int VECES = 30;
		
		Random rand = new Random();
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for (int i = 0; i < VECES; i++) {
			numRandom = rand.nextInt(1, 11);
			
			numeros.add(numRandom);
		}
		
		Collections.sort(numeros);
		
		System.out.println(numeros);
	}
}
