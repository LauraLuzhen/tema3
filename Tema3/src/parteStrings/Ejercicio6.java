package parteStrings;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase introducida por el usuario
		String frase;
		// Variable que guarda la frase sin espacios
		String fraseSinEspacios;
		// Variable que indica si la palabra es palíndroma o no
		boolean palindroma;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos una frase al usuario y convertimos todos los caracteres en
		// minúsuclas
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine().toLowerCase();

		// Le quitamos los espacios a la frase y lo guardamos en una variable
		fraseSinEspacios = frase.replace(" ", "");

		// Llamamos a la función y la guardamos en una variable
		palindroma = palindroma(fraseSinEspacios);

		// Imprimimos el resultado
		System.out.println("¿La cadena es políndroma? " + palindroma);

		// Cerramos el Scanner
		reader.close();
	}

	// Función que recibe una frase y dice si la frase es palíndroma o no
	static boolean palindroma(String f) {

		// Declaración de variables
		// Variable que indica si es o no políndroma
		boolean polindroma;
		// Variable que guarda la frase al revés
		String invertida = "";

		// Creamos un for que vaya guardando la frase invertida
		for (int i = f.length() - 1; i >= 0; i--) {
			invertida += f.charAt(i);
		}

		// Creamos un ternario que si es igual son políndromas y sino es false
		polindroma = (invertida.equals(f)) ? true : false;

		// Devolvemos el resultado
		return polindroma;
	}
}
