package parteStrings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda una frase
		String frase1;
		// Variable que guarda otra frase
		String frase2;
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Introduce una frase: ");
		frase1 = reader.nextLine();
		
		System.out.println("Introduce otra frase: ");
		frase2 = reader.nextLine();
		
		if (frase1.length() > frase2.length()) {
			System.out.println("La primera frase es más larga");
		} else if (frase1.length() < frase2.length()) {
			System.out.println("La segunda frase es más larga");
		} else {
			System.out.println("Ambas frases son iguales");
		}
		
		reader.close();
	}
}
