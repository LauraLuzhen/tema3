package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Ej7 {

	public static void main(String[] args) {
		/*
		 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
		 * (con su correspondiente traducción). Utiliza un objeto de la clase TreeMap
		 * para almacenar las parejas de palabras. El programa mostrará un menú con dos
		 * opciones: Inserta palabra. Debe solicitar una palabra en español y su
		 * traducción al inglés. Busca palabra. Pregunta por una palabra en español y
		 * devuelve su traducción en inglés. Salir. Termina el programa.
		 * 
		 */
		int respuesta;
		String español;
		String ingles;
		
		final int MIN_PALABRAS = 20;
		
		Scanner reader = new Scanner (System.in);
		
		TreeMap<String, String> diccionario = new TreeMap<>();
		
		System.out.println("1. Insertar palabra\n2. Busca palabra\n0. Salir");
		respuesta = reader.nextInt();
		
		while (respuesta == 0) {
			if (respuesta == 1) {
				System.out.println("Introduce una palabra: ");
				español = reader.nextLine();
				System.out.println("Introduce su traduccion: ");
				ingles = reader.nextLine();
				
				diccionario.put(español, ingles);
			} else {
				
			}
			
			System.out.println("1. Insertar palabra\n2. Busca palabra\n0. Salir");
			respuesta = reader.nextInt();
		}
	}
}
