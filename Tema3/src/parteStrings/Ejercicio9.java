package parteStrings;

import java.util.Scanner;

public class Ejercicio9 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase del usuario
		String frase;
		// Variable que guarda el saludo de una persona de Javalín
		String saludo = "Javalín, javalón     ";
		// Variable que guarda la despedida de una persona de Javalín en su dialecto
		String despedida = "     javalén, len, len";
		// Variable que indica si es de Javalandia por su saludo
		int val1;
		// Variable que indica si es de Javalandia por su despedida
		int val2;
		// Variable que guarda la frase original si es de Javalandi sin el saludo ni la
		// despedida
		String fraseNormal;

		// Le pedimos una frase al usuario
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine();

		// Creamos un if-else que si la frase que introduce el usuario es más corta que
		// el propio saludo o despedida directamente no es de Javalandi
		if (frase.length() >= despedida.length()) {
			// Si puede ser que sea de Javalandia entonces comparamos la frase
			// Si la frase inicia como el saludo entonces val1 será > 0
			val1 = frase.indexOf(saludo, 0, saludo.length());
			// Si la frase inicia como la despedida enconces val2 será > 0
			val2 = frase.indexOf(despedida, frase.length() - despedida.length(), frase.length());

			// Creamos un if-else que si uno de los dos valores es cierto entonces
			// eliminaremos la parte del saludo o la despedida para guardar la frase
			// original
			if (val1 >= 0 || val2 >= 0) {
				if (val1 >= 0) {
					// En caso del saludo lo eliminamos y nos quedamos con la frase original
					fraseNormal = frase.replace(saludo, "");
				} else {
					// En el caso de la despedida la eliminamos y nos quedamos con la frase original
					fraseNormal = frase.replace(despedida, "");
				}
			} else {
				// Si ambos valores son negativos entonces no está el saludo ni la despedida
				fraseNormal = frase + " (No es de Javalandia)";
			}
		} else {
			// Guardamos en la frase la frase original
			fraseNormal = frase + " (No es de Javalandia)";
		}

		// Imprimimos la frase original
		System.out.println(fraseNormal);

		// Cerramso el Scanner
		reader.close();
	}
}
