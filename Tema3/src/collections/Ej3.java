package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ej3 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda un número aleatorio
		int num;
		
		// Constante que va a ser el número a generar
		final int GENERAR = 30;
		
		// Creamos la colección
		List<Integer> lista = new ArrayList<Integer>();
		
		// Creamos el Random
		Random rand = new Random();
		
		// Do-while que sale del bucle cuando se hayan generado 30 números
		do {
			// Generamos un número random
			num = rand.nextInt(1, 11);
			
			// Lo añadimos a la lista
			lista.add(num);
		} while (lista.size() < GENERAR);
		
		// Imprimimos la lista
		Collections.sort(lista);
		System.out.println(lista);
	}
}
