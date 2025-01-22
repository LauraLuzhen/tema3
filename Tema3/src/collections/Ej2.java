package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
		 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
		 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
		 * entre 5 y 10 elementos ambos inclusive.
		 */
		
		int numRandom;
		int tamaño;
		int suma = 0;
		double media = 0;
		int max;
		int min;
		
		Random rand = new Random();
		
		ArrayList<Integer> numerosAleatorios = new ArrayList<>();
		
		tamaño = rand.nextInt(5, 11);
		
		for (int i = 0; i < tamaño; i++) {
			numRandom = rand.nextInt(0, 101);
			numerosAleatorios.add(numRandom);
			
			suma += numRandom;
			media = suma / tamaño;
		}
		
		max = Collections.max(numerosAleatorios);
		min = Collections.min(numerosAleatorios);
		
		System.out.println("Suma: " + suma + "\nMedia: " + media + "\nMáximo: " + max + "\nMínimo: " + min);
	}
}
