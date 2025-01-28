package collections2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación que cuente la frecuencia de aparición de cada letra
		 * (solo los caracteres alfabéticos) en la siguiente cadena de texto y luego
		 * muestre el conteo por pantalla. Usa la implementación más apropiada:
		 * 
		 * "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio,
		 * repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero,
		 * seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un
		 * agujero-hobbit, y eso significa comodidad" . Pista: se puede utilizar el
		 * método estático isLetter de la clase Character.
		 * 
		 */
		
		// Declaración de variables
		// Variable que guarda la frase
		String frase;
		// Variable que guarda la longitud de la frase
		int longitud;
		
		char letra;
		
		// Creamos la colección TreeMap
		Map<Character, Integer> letras = new TreeMap<>();
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos una frase al usuario y guardamos la frase en la variable
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine();
		
		// Guardamos la longitud de la frase
		longitud = frase.length();
		
		for (int i = 0; i < longitud; i++) {
			letra = frase.charAt(i);
			
		}
	}
}
