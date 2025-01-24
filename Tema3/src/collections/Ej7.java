package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Ej7 {
	
	static Scanner leer = new Scanner(System.in);
	static TreeMap<String, String> diccionario = new TreeMap<String, String>();
	
	public static void main(String[] args) {

		// palabra en español
		String palabraES = "";

		// palabra en ingles
		String palabraING = "";

		// almacena el resultado de la funcion de traducir
		String palabraTraducida = "";

		boolean salir = false;

		while (!salir) {

		// creo un switch para seleccionar la opcion
		switch (menu()) {

		case 1 -> {
		// añade la palabra y traduccion al diccionario
		insertarPalabra(palabraES, palabraING);
		}
		case 2 -> {
		palabraTraducida = buscarTraduccion();
		// busca la traduccion
		if (palabraTraducida == null) {
		System.out.println("Esa palabra no consta en el diccionario");
		} else {
		System.out.println("La traduccion de la palabra introducida es " + palabraTraducida);
		}

		}
		default -> {
		System.out.println("Saliendo ...");
		salir = true;
		}

		}
		}

		System.out.println();
		System.out.println("Has salido");

		}

		// funcion menu
		static int menu() {

		// almacenar la opcion
		int opcion;

		System.out.println();
		System.out.println();
		// opciones
		System.out.println(
		"Selecciona una opción: \n 1) Inserta palabra. Debe solicitar una palabra en español y su traducción al inglés. \n 2) Inserta palabra. Debe solicitar una palabra en español y su traducción al en inglés. \n 3) Salir. Termina el programa");

		System.out.print("Opción: ");
		// introducir la opcion
		opcion = leer.nextInt();

		return opcion;

		}

		// insertar par de palabras
		static void insertarPalabra(String palabraES, String palabraING) {

		leer.nextLine();

		System.out.print("Inserta una palabra en español: ");
		palabraES = leer.next();

		System.out.print("Inserta su traducción en inglés: ");
		palabraING = leer.next();

		// añado el par de palabras al diccionario
		diccionario.put(palabraES, palabraING);

		}

		// buscar por traduccio en el diccionario
		static String buscarTraduccion() {

		String palabraEspañol;

		String traduccion = "";

		// pregunta por la palabra
		System.out.println("Introduce una palabra en español para saber su traduccion: ");
		palabraEspañol = leer.next();

		// iguala a la variable traduccion el valor asociado a la palabra en español
		traduccion = diccionario.get(palabraEspañol);

		return traduccion;
		}
}
