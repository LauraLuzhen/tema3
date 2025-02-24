package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda el valor introducido por el usuario
		int numUser;
		
		// Creamos la lista donde van a guardarse números positivos
		List<Integer> numPositivos = new ArrayList<Integer>();
				
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		// Le pedimos un número al usuario
		System.out.println("Introduce un número entero: ");
		numUser = reader.nextInt();
		
		// While que sale del bucle cuando el usuario introduce un núemro negativo
		while (numUser >= 0) {
			// Limpiamos el Scanner
			reader.nextLine();
			
			// Añadimos el número a la lista
			numPositivos.add(numUser);
			
			// Le pedimos un número al usuario
			System.out.println("Introduce un número entero: ");
			numUser = reader.nextInt();
		}
		
		// Imprimimos los índices de los valores pares
		System.out.println("Índice de los valroes pares: ");
		for (Integer num: numPositivos) {
			if (num % 2 == 0) {
				System.out.print(numPositivos.indexOf(num) + "   ");
			}
		}
		
		// Cerramos el Scanner
		reader.close();
	}
}
