package parteStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la palabra introducida por el usuario
		String palabra;
		// Variable que guarda la secuenda de división
		int secuencia;

		// Creamos una tabla que será la que vamos a imprimir
		String[] tabla;

		// Le pedimos la palabra
		System.out.println("Introduce la palabra: ");
		palabra = reader.next();

		// Le pedimso la secuencia
		System.out.println("Introduce la secuencia de división: ");
		secuencia = reader.nextInt();

		// Llamamos a la función para dividir la palabra y lo guardamos
		tabla = division(palabra, secuencia);

		// Imprimimos el resultado
		System.out.println(Arrays.toString(tabla));

		// Cerramos el Scanner
		reader.close();
	}

	// Función que devuleve una tabla con la palbra dividida en la secuencia elegida
	static String[] division(String palabra, int secuencia) {

		// Declaración de variables
		// Variable que calcula cuántas divisiones se van a hacer
		double calculo = palabra.length() / secuencia;
		// Variable que calcula la longitud total de la tabla
		int longitud = palabra.length() % secuencia == 0 ? (int) calculo : (int) calculo + 1;
		// Variable que guarda el inicio de la subcadena de la división
		int inicio = 0;
		// Variable que calcula el fin de la subcadena de la división
		int fin = secuencia;

		// Creamos la tabla con la longitud calculada
		String[] divisiones = new String[longitud];

		// Creamos un for que recorra la tabla entera para rellenarla
		for (int i = 0; i < divisiones.length; i++) {

			// Creamos un if que si es la última iteración guarde las letras sobrantes y
			// salga de la iteración
			if (i == divisiones.length - 1) {
				divisiones[i] = palabra.substring(inicio);
				continue;
			}

			// Guardamos el rango de letras que se van a guardar
			divisiones[i] = palabra.substring(inicio, fin);
			// Modificamos el inicio y fin para la siguiente división
			inicio = fin;
			fin += secuencia;
		}

		// Devolvemos la tabla
		return divisiones;
	}
}
