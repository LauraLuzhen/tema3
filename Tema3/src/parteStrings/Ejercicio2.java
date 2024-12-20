package parteStrings;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda la contraseña a adivinar
		String contraseña;
		// Variable que guarda la posible contraseña
		String adivina;
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		// Iniciamos el juego
		System.out.println("ADIVINA LA CONTRASEÑA");
		
		// Le pedimos al jugador 1 que introduzca una contraseña
		System.out.println("Hola jugador 1, introduce la contraseña (una palabra): ");
		contraseña = reader.next();
		// Limpiamos el Scanner para tener una contraseña de una palabra
		reader.nextLine();
		
		// Le pedimso al jugador 2 que adivine la contraseña
		System.out.println("Hola jugador 2, adivina la contraseña: ");
		adivina = reader.nextLine();
		
		// Creamos un while que se mantiene dentro del bucle si la contraseña del jugador 2 no es la contraseña del jugador 1
		while (contraseña.compareTo(adivina) != 0) {
			// Creamos un if-else que diga si el mayor o menor alfabéticamente
			if (contraseña.compareTo(adivina) > 0) {
				System.out.println("La contraseña es mayor alfabéticamente");
			} else {
				System.out.println("La contraseña es menor alfabéticamente");
			}
			
			// Le volvemos a pedir una contraseña al jugador 2
			System.out.println("Intealo otra vez: ");
			adivina = reader.nextLine();
		}
		
		// Imprimimos la victoria
		System.out.println("Has acertado la contraseña");
		
		// Cerramos el Scanner
		reader.close();
	}
}
