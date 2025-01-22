package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Crear una lista de números enteros positivos introducidos por consola hasta
		 * que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
		 * por pantalla los índices de los elementos de valor par.
		 * 
		 */
		
		int num;
		
		Scanner reader = new Scanner (System.in);

		ArrayList<Integer> numeros = new ArrayList<>();
		
		System.out.println("Introduce un número entero: ");
		num = reader.nextInt();

		while (num >= 0) {
			numeros.add(num);
			
			System.out.println("Introduce un número entero: ");
			num = reader.nextInt();
		}
		
		
		
		reader.close();
	}
}
