package collections2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej3 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase del usuario
		String frase;
		// Variable que guarda la longitud de la frase
		int longitud;
		// Variable que guarda una letra
		char letra;

		// Creamos el mapa
		Map<Character, Integer> lista = new TreeMap<Character, Integer>();

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos una frase
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine().toLowerCase();

		// Guardamos la longitud
		longitud = frase.length();

		// For que recorre cada letra de la frase
		for (int i = 0; i < longitud; i++) {
			// Guardamos la letra
			letra = frase.charAt(i);
			// If que si es una letra va a aumentar su contador
			if (Character.isLetter(letra)) {
				if (lista.containsKey(letra)) {
					lista.put(letra, lista.get(letra) + 1);
				} else {
					lista.put(letra, 1);
				}
			}
		}

		// For-each que imprime cada clave-valor del mapa
		for (Map.Entry<Character, Integer> filaLetra : lista.entrySet()) {
			System.out.println(filaLetra.getKey() + " = " + filaLetra.getValue());
		}

		// Cerramos el Scanner
		reader.close();
	}
}
