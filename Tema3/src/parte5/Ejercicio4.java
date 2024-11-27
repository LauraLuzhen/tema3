package parte5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que indica el tipo de pieza
		char pieza;
		// Variable que indica la posición de la fila
		int posFila;
		// Variable que indica la posición de la columna
		int posColu;
		
		// Creamos una tabla que será el tablero
		char tablero[][] = new char[8][8];
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		// Pedimos el tipo de pieza
		System.out.println("Tipo de pieza: ");
		pieza = reader.next().charAt(0);
		
		// Pedimos la posición de la fila
		System.out.println("Fila: ");
		posFila = reader.nextInt();
		
		// Pedimos la posición de la columna
		System.out.println("Columna: ");
		posColu = reader.nextInt();
		
		tablero = switch (pieza) {
		case 'T'-> {
			yield movTorre(posFila, posColu, pieza);
		}
		
		
		default -> throw new IllegalArgumentException("Unexpected value: " + pieza);
		};
		
		// Imprimimos la tabla
		for (char fila[]: tablero) {
			for (char elemento: fila) {
				System.out.print(elemento);
			}
			System.out.println();
		}
		
		// Cerramos el Scanner
		reader.close();
	}
	
	static char[][] movTorre(int posFila, int posColu, char pieza){
		
		// Creamos una tabla de 8x8
		char tablero[][] = new char[8][8];
		
		// Creamos un for para rellenar la fila y la columna
		for (int i = 0; i < tablero.length; i++) {
			tablero[posFila-1][i] = 'X';
			tablero[i][posColu-1] = 'X';
		}
		
		tablero[posFila-1][posColu-1] = pieza;
		
		// Devolvemos el tablero
		return tablero;
	}
	
	static char[][] movAlfil(int posFila, int posColu, char pieza){
		
		// Creamos una tabla de 8x8
		char tablero[][] = new char[8][8];
		
		
		
		return tablero;
	}
}
