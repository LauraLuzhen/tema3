package parte1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		double numUsuario;
		// Variable que guarda la suma de todos los números introducidos por el usuario
		double suma = 0;
		// Variable que guarda el número de máximo valor
		double max;
		// Variable que guarda el número de mínimo valor
		double min;
		// Variable que guarda el número anterior introducido
		double numAnterior;
		// Variable que indica si hay o no error
		boolean error = false;

		// Creamos una tabla llamada numeros[]
		double numeros[] = new double[10];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que le vaya pidiendo al usuario un número 10 veces y lo vaya
		// guardando en la lista numerosInverso[]
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un valor: ");
			numUsuario = reader.nextDouble();

			numeros[i] = numUsuario;
		}

		max = numeros[0];
		min = numeros[0];
		
		for (double numero : numeros) {
			suma += numero;
			
			if (numero > max) {
				max = numero;
			} else if (numero < min) {
				min = numero;
			}
		}

		System.out.println(suma);
		System.out.println(max);
		System.out.println(min);
		
		//Cerramos el Scanner
		reader.close();
	}
}
