package parte2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int tamaño;
		int valor;
		
		//Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Tamaño ");
		tamaño = reader.nextInt();
		
		int tabla[] = new int[tamaño];
		
		System.out.println("Introduce un valor ");
		valor = reader.nextInt();
		
		Arrays.fill(tabla, valor);
		
		System.out.println(Arrays.toString(tabla));
		
		reader.close();
	}
}
