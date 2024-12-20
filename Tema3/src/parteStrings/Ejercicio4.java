package parteStrings;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase del usuario
		String frase;
		//
		String fraseInvertida;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine();

		// Llamamos a la función y la guardamos en una variable
		fraseInvertida = invertir(frase);
		
		// Llamamos a la función y la imprimimos
		System.out.println(fraseInvertida);

		// Cerramos el Scanner
		reader.close();
	}

	// Función que recibe una cadena y la invierte
	static String invertir(String f) {

		// Declaración de variables
		// Variable que guarda la frase invertida
		String invertida = "";

		// Creamos un for que empiece desde el final de la cadena y cada carácter lo
		// vaya guardando en la cadena invertida
		for (int i = f.length() - 1; i >= 0; i--) {
			invertida += f.charAt(i);
		}

		// Devolvemos la cadena invertida
		return invertida;
	}
}
