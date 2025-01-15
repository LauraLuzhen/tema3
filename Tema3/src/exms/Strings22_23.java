package exms;

import java.util.Random;
import java.util.Scanner;

public class Strings22_23 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	// Variable estática que va a guardar en una cadena las letras que no se
	// encuentran en la palabra dichas por el usuario
	static String noAcertadas;

	// Lista de posibles palabras a adivinar
	static String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza",
			"brazo", "familia" };

	// Variable que guarda la palabra secreta
	static String palabraSecreta;

	// Variable que guarda la pista que va a imprimir al usuario
	static String palabraPista;

	// Constante de máximo de 7 intentos
	static final int NUMINTENTOS = 7;

	public static void main(String[] args) {

		generarPalabra();

	}

	// Función que genera una palabra aleatoria de la lista y la guarda en la var.
	// palabraSecreta
	static void generarPalabra() {

		int pos;

		Random rand = new Random();

		pos = rand.nextInt(0, palabras.length);

		palabraSecreta = palabras[pos];
	}

	//
	static int menu() {

		// Declaración de variables
		// Variable que guarda la opción que seleciona el usuario
		int opcionSeleccionada = 0;
		// Variable que indica si se produce un error
		boolean error;

		// Do-while que sale del bucle cuando no haya errores
		do {
			try {
				// Le pedimos una acción al usuario
				System.out.println(
						"Seleccione una de las siguientes opciones: \n\t1. Introducir letra\n\t2. Introducir palabra");
				opcionSeleccionada = reader.nextInt();
				error = false;
				assert (opcionSeleccionada == 1 || opcionSeleccionada == 2);
			} catch (Exception e) {
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				System.err.println("Introduce 1 o 2");
				error = true;
			}
		} while (error);

		// Devolvemos la elección del usuario
		return opcionSeleccionada;
	}

	// Función que comprueba si una letra está o no en la palabra secreta, en caso
	// contrario se añade a noAcertadas
	static void compruebaLetra(char letra) {

		// Declaración de variables
		// Variable que guarda la letra en minúsculas
		char letraMin = Character.toLowerCase(letra);
		// Variable que indica si está la letra en la palabra secreta o no
		int esta = palabraSecreta.indexOf(letraMin);

		// If-else si la letra está da un nº positivo y añadimos la letra en la palabra
		// pista
		if (esta >= 0) {
			// For que recorre cada letra de la palabra secreta
			for (int i = 0; i < palabraSecreta.length(); i++) {
				// If-else si coincide la letra se le añade a la palabra pista
				if (palabraSecreta.charAt(i) == letraMin) {
					palabraPista += letraMin;
				} else {
					// En caso contrario se añade un _
					palabraPista += "_";
				}
			}
		} else {
			// En caso de dar un nº negativo se añade la letra en noAcertadas
			noAcertadas += letra;
		}
	}

	// Función que comprueba si la cadena es igual a la palabra secreta
	static void compruebaPalabra(String cad) {

		// Declaración de variables
		// Variable que guarda la cadena en minúsculas
		String cadMin = cad.toLowerCase();

		// If que compara la cadena con la palabra secreta si son iguales añade la
		// cadena a la palabra pista
		if (cadMin.equals(palabraSecreta)) {
			palabraPista += cadMin;
		}
	}

	// Función que imprime por consola las letras no acertadas del usuario y las
	// pistas
	static void pintaPista() {

		// Tabla de caracteres que son las letras no acertadas
		char[] letrasNoAcertadas = noAcertadas.toCharArray();

		// Imprimimos las letras no acertadas
		System.out.println("Letras no acertadas: " + letrasNoAcertadas.toString());

		// Imprimimos la pista
		System.out.println(palabraPista);
	}
}
