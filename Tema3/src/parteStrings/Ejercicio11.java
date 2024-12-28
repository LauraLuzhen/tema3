package parteStrings;

import java.util.Scanner;

public class Ejercicio11 {
	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase introducida por el usuario
		String frase;
		// Variable que guarda cada letra de la frase
		char letra;
		// Variable que guarda la frase una vez codificada
		String fraseFinal = "";

		// Creamos dos tablas para codificar el texto
		char c1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char c2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Le pedimos una frase al usuario
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine().toLowerCase();

		// Creamos un for que recorra letra por letra
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			// Llamamos a la función para codificar la letra
			letra = codifica(c1, c2, letra);
			// Guardamos la letra en la frase codificada
			fraseFinal += letra;
		}

		// Imprimimos la frase
		System.out.println(fraseFinal);

		// Cerramos el Scanner
		reader.close();
	}

	// Función que codifica carácter por carácter el mensaje
	static char codifica(char conjunto1[], char conjunto2[], char c) {

		// Declaración de variables
		// Variable que guarda el carácter que va a enviar la función
		char caracter;
		// Variable que cuenta la posición de los conjuntos
		int i = 0;
		// Variable que comprueba si el carácter no está en el conjunto 2
		boolean comprobacion = true;

		// Creamos un while que salga del bucle cuando el contador se exceda o cuando el
		// carácter esté dentro del conjunto 2
		while (i < conjunto2.length && comprobacion) {
			comprobacion = c != conjunto2[i];
			i++;
		}

		// Creamos un if-else que si el carácter está dentro del conjunto 2 lo cambia
		// por el carácter correspondiente del conjunto 1
		if (!comprobacion) {
			caracter = conjunto1[--i];
		} else {
			// Sino es el carácter normal
			caracter = c;
		}

		// Devolvemos el caracter que se va a guardar
		return caracter;
	}
}
