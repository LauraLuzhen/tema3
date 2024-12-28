package parteStrings;

import java.util.Scanner;

public class Ejercicio19 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variables que guarda el nombre de la variable que introduce el usuario
		String varUsuario;
		// Variable que guarda el nombre de la variable en Camel
		String varCamel;

		// Creamos una tabla que contiene cada una de las palabras
		String palabras[];

		// Le pedimos el nombre al usuario
		System.out.println("Introduce le nombre para una variable: ");
		varUsuario = reader.nextLine().toLowerCase();

		// Guardamos cada palabra en la tabla
		palabras = varUsuario.split(" ");

		// Llamamos a la función para convertirlo en Camel y la guardamos
		varCamel = conversionCamel(palabras);

		// Imprimimos el resultado
		System.out.println("Nombre de la variable: " + varCamel);

		// Cerramos el Scanner
		reader.close();
	}

	// Función que convierte el nombre de la variable en Camel
	static String conversionCamel(String[] palabras) {

		// Declaración de variables
		// Variable que guarda la variable Camel
		String cadenaCamel = "";
		// Variable que guarda la palabra con la primera letra en mayúsucla
		String palabra;

		// Creamos un for que recorra toda la tabla entera
		for (int i = 0; i < palabras.length; i++) {
			// Para el primer caso guardamos la palabra tal como está (en minúsculas) y nos
			// saltamos el resto de la iteración
			if (i == 0) {
				cadenaCamel += palabras[i];
				continue;
			}

			// Guardamos la siguiente palabra que tiene que ser con la primera letra en
			// mayúscula y el resto en minúscula
			palabra = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);

			// Añadimos la palabra a la cadena
			cadenaCamel += palabra;
		}

		// Devolvemos el resultado
		return cadenaCamel;
	}
}