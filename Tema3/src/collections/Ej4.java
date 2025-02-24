package collections;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Ej4 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda un número aleatorio
		int num;
		
		// Constante que determina la cantidad de números a generar
		final int GENERAR = 20;
		
		// Creamos una colección
		Set<Integer> lista = new LinkedHashSet<Integer>();
		
		// Creamos el Random 
		Random rand = new Random ();
		
		// Do-while que se saldrá del bucle cuando llegue a la longitud
		do {
			// Generamos un número aleatorio
			num = rand.nextInt(0, 100);
			
			// Lo guardamos en la lista
			lista.add(num);
		} while (lista.size() < GENERAR);
		
		// Imprimimos la lista
		System.out.println(lista);
	}
}
