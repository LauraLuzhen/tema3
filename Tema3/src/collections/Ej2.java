package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
		 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
		 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
		 * entre 5 y 10 elementos ambos inclusive.
		 */
		
		// Declaración de variables
		// Variable que guarda un número aleatorio
		int numAleatorio;
		// Variable que guarda la suma, media, máx y mín de esos números
		int suma = 0;
		int max, min;
		double media;
		// Variable que guarda la longitud de la lista
		int longitud;
		
		// Creamos el arraylist
		List<Integer> numRandoms = new ArrayList<Integer>();
		
		// Creamos el Random
		Random rand = new Random();
		
		// Generamos la longitud aleatoria de la lista
		longitud = rand.nextInt(5, 11);
		
		System.out.println("Longitud de la lista: " + longitud);
		
		// Do-while que sale del bucle cuando la lista tenga la longitud deseada
		do {
			// Generamos un número aleatorio
			numAleatorio = rand.nextInt(0, 101);
			
			System.out.println("Número aleatorio generado: " + numAleatorio);
			
			suma += numAleatorio;
			
			// Añadimos el número a la lista
			numRandoms.add(numAleatorio);
		} while (numRandoms.size() < longitud);
		
		// Calculamos el min y max, y la media
		min = Collections.min(numRandoms);
		max = Collections.max(numRandoms);
		media = suma / longitud;
		
		// Imprimimos los resultados
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Máximo: " + max);
		System.out.println("Mínimo: " + min);
	}
}
