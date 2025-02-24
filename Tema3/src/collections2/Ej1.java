package collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda el número aleatorio
		int num;
		// Variable que guarda el número temporal a guardar
		int numTemp;
		// Variable que ayuda a desordenar la lista guardando una posición
		int pos2;
		
		// Creamos la lista
		List<Integer> lista = new ArrayList<Integer>();
		
		// Creamos el Random
		Random rand = new Random();
		
		// For que genera 10 números randoms del 1 al 10
		for(int i = 0; i < 10; i++) {
			num = rand.nextInt(1, 11);
			lista.add(num);
		}
		
		// Imprimimos la lista creada
		System.out.println("Lista original: " + lista);
		
		// For que desordena la lista
		for(int pos1 = lista.size() -1; pos1 > 0; pos1 --) {
			pos2 = rand.nextInt(pos1 + 1);
			
			numTemp = lista.get(pos1);
			
			lista.set(pos1, lista.get(pos2));
			lista.set(pos2, numTemp);
		}
		
		// Imprimimos la lista desordenada
		System.out.println("Lista desordenada: " + lista);
	}
}
