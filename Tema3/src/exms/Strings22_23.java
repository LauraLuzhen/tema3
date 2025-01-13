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
	static int menu () {
		
		// Declaración de variables
		// Variable que guarda la opción que seleciona el usuario
		int opcionSeleccionada = 0;
		// Variable que indica si se produce un error
		boolean error;
		
		// Do-while que sale del bucle cuando no haya errores
		do {
			try {
				// Le pedimos una acción al usuario
				System.out.println("Seleccione una de las siguientes opciones: \n\t1. Introducir letra\n\t2. Introducir palabra");
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
	
	// Función 
	static void compruebaLetra (char letra)
}
