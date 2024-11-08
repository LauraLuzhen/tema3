package parte2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int num;
		
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		boolean comparacion;
		
		Scanner reader = new Scanner (System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Introduce un número ");
			num = reader.nextInt();
			
			tabla1[i] = num;
		}
		
		for (int i=0; i<10; i++) {
			System.out.println("Introduce un número ");
			num = reader.nextInt();
			
			tabla2[i] = num;
		}
		
		comparacion = Arrays.equals(tabla1, tabla2);
		
		System.out.println("Son iguales: " + comparacion);
		
		reader.close();
	}
}
