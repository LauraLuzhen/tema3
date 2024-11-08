package parte2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int numRandom;
		
		//Declaración de tablas
		int tabla[] = new int[30];
		
		//Creamos el Random
		Random rand = new Random();
		
		for (int i=0; i<tabla.length; i++) {
			numRandom = rand.nextInt(0, 10);
			tabla[i] = numRandom;
		}
		
		Arrays.sort(tabla);
		
		System.out.println(Arrays.toString(tabla));
		
	}
}
