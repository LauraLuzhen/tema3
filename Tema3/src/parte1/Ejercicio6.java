package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaración de variables
		//Variable que guarda el número del usuario
		int numUsuario;
		
		//Creamos una tabla de longitud 8
		int numeros[] = new int[8];
		
		//Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		//Creamos un for que vaya guardando en la tabla numeros[] cada número del usuario
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Introduce un número entero: ");
			numUsuario = reader.nextInt();
			
			numeros[i] = numUsuario;
		}
		
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
		}
		
		//Cerramos el Scanner
		reader.close();
	}
}
