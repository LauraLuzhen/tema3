package parte6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	// Creamos el Scanner
	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que indica el jugador que está jugando
		int jugador = 1;
		// Variable que indica que ha ganado alguien
		boolean ganar = false;
		// Variable que indica que el tablero está lleno
		boolean entera = false;
		// Variable que distingue ambas piezas X y O
		char pieza;
		
		// Creamos el tablero que será de 4x4
		char tablero[][] = new char[4][4];
		
		// Llamamos a la función para rellenar la tabla
		rellenoTablero(tablero);
		
		while (!ganar && !entera) {
			
			if (jugador == 3) {
				jugador = 1;
			}
			
			if (jugador == 1) {
				pieza = 'X';
			} else {
				pieza = 'O';
			}
			
			colocar(tablero, jugador, pieza);
			mostrar(tablero);
			
			
			// Comprobamos si ha ganado algún jugador si no ha ganado ningún jugador comprobamos si la tabla está rellena
			if (filas(tablero) || columnas(tablero) || diagonales(tablero)) {
				ganar = true;
				System.out.println("Felicidades ha ganado el jugador " + jugador);
			} else {
				entera = recorre(tablero);
			}
			
			jugador++;
		}
		
	}
	
	// Función que rellena el tablero de -
	static void rellenoTablero(char t[][]) {
		
		// Creamos un for que rellene el tablero entero con -
		for (int i = 0; i < t.length; i++) {
			Arrays.fill(t[i], '-');
		}
	}
	
	// Función que le pregunta la jugada al jugador
	static void colocar(char t[][], int j, char p) {
		
		// Declaración de variables
		// Variables que guardan la columna
		int col;
		boolean fondo = true;
		int i = 0;
		
		// Le pedimos que coloque la pieza al jugador
		System.out.println("Turno del jugador " + j);
		System.out.println("Coloca la pieza " + p);
		System.out.println("Columna: ");
		col = reader.nextInt();
		
		while (fondo && i < 4) {
			fondo = t[i][col] == '-';
			i++;
		}
		
		if (fondo) {
			i--;
		} else {
			i -= 2;
		}
		t[i][col] = p;
	}
	
	// Función que muestra el tablero
	static void mostrar(char t[][]) {
		
		for (char fila[]: t) {
			for (char valor: fila) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
	}
	
	// Función que recorre las filas para ver si ha ganado algún jugador
		static boolean filas (char t[][]) {
			
			// Declaración de variables
			boolean ganar = false;
			boolean vacio = false;
			int i = 0;
			
			while (!ganar && i < 4) {
				vacio = t[i][0] == '-';
				if (!vacio) {
					ganar = t[i][0] == t[i][1] && t[i][0] == t[i][2] && t[i][0] == t[i][3];
				} else {
					ganar = false;
				}
				i++;
			}
			
			// Devolvemos la variable
			return ganar;
		}
		
		// Función que recorre las columnas para ver si ha ganado algún jugador
		static boolean columnas (char t[][]) {
			
			// Declaración de variables
			boolean ganar = false;
			boolean vacio = false;
			int j = 0;
			
			while (!ganar && j < 4) {
				vacio = t[0][j] == '-';
				if (!vacio) {
					ganar = t[0][j] == t[1][j] && t[0][j] == t[2][j] && t[0][j] == t[3][j];
				} else {
					ganar = false;
				}
				j++;
			}
			
			// Devolvemos la variable
			return ganar;
		}
		
		// Función que recorre las diagonales para ver si ha ganado algún jugador
		static boolean diagonales (char t[][]) {
			
			// Declaración de variables
			// Variable que indica si ha ganado algún jugador
			boolean ganar = true;
			boolean vacio1 = t[1][1] == '-';
			boolean vacio2 = t[2][1] == '-';
			
			if (!vacio1) {
				if (t[0][0] == t[1][1] && t[1][1] == t[2][2] && t[2][2] == t[3][3]) {
					ganar = true;
				} else {
					ganar = false;
				}
			} if (!vacio2) {
				if (t[3][0] == t[2][1] && t[2][1] == t[1][2] && t[1][2] == t[0][3]) {
					ganar = true;
				} else {
					ganar = false;
				}
			}else {
				ganar = false;
			}
			
			// Devolvemos la variable
			return ganar;
		}
		
		// Función que recorre la tabla para ver si está rellena
		static boolean recorre (char t[][]) {
			
			// Declaración de variables
			// Variable que indica si está llena o no
			boolean llena = true;
			// Variable que indica las filas 
			int i = 0;
			// Variable que indica las columnas
			int j;
			
			// Creamos dos while que recorran la tabla entera y compruebe si está llena o no
			while (llena && i < t.length) {
				j = 0;
				while (llena && j < t[i].length) {
					llena = t[i][j] != '-';
					j++;
				}
				i++;
			}
			
			// Devolvemos la variable llena
			return llena;
		}
}
