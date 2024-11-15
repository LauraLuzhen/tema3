package parte4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int longitud = 0;
		boolean error = false;
		int tabla[];
		
		Scanner reader = new Scanner (System.in);
		
		do {
			try {
				System.out.println("Introduce la longitud de la tabla: ");
				longitud = reader.nextInt();
				assert (longitud > 0);
				error = false;
			} catch (Exception e) {
				System.out.println("Introduce un valor válido");
				error = true;
			}
		} while (error == true);
		
		tabla = new int[longitud];
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce un elemento de la tabla: ");
			
			tabla[i] = reader.nextInt();
		}
		
		System.out.println(sumaValores(tabla));
		
		reader.close();
	}
	
	static int sumaValores(int tabla[]) {
		int suma = 0;
		
		for (int elemento: tabla) {
			suma += elemento;
		}
		
		return suma;
		
	}
}
