package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Ej6 {

	public static void main(String[] args) {
		/*
		 * Repite la actividad anterior de forma que se inserten los nombres manteniendo
		 * el orden alfabético.
		 * 
		 */
		
		String nombre;
		
		Scanner reader = new Scanner (System.in);
		
		TreeSet<String> palabras = new TreeSet<>();
		
		System.out.println("Introduce un nombre: ");
		nombre = reader.nextLine().toLowerCase();
		
		while (!nombre.equals("fin")) {
			palabras.add(nombre);
			
			System.out.println("Introduce un nombre: ");
			nombre = reader.nextLine().toLowerCase();
		}
		
		System.out.println(palabras);
		
		reader.close();
	}
}
