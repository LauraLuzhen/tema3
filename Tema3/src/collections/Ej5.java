package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		/*
		 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
		 * que se insertarán en una colección, de forma que se conserve el orden de
		 * inserción y que no puedan repetirse. Al final, la colección se mostrará por
		 * pantalla.
		 * 
		 */
		
		String nombre;
		
		Scanner reader = new Scanner (System.in);
		
		LinkedHashSet<String> palabras = new LinkedHashSet<>();
		
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
