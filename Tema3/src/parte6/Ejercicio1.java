package parte6;

import java.util.Scanner;

public class Ejercicio1 {

	// Creamos el Scanner
	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que indica si un jugador ha ganado la partida
		boolean ganar = false;
		// Variable que indica si la tabla está entera
		boolean entera = false;
		// Variable que distingue los jugadores
		int jugador = 1;
		
		// Creamos el tablero que será de 3x3
		char t[][] = new char[3][3];
		
		// Rellenamos la tabla con '-'. Usamos dos for para recorrer la tabla entera
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = '-';
			}
		}
		
		// Creamos un while que se salga del bucle cuando gane un jugador o cuando el tablero esté lleno
		while (!ganar && !entera) {
			
			// Cambiamos de jugador desde el inicio. Utilizamos un if 
			if (jugador == 3) {
				jugador = 1;
			}
			
			// Llamamos a la función colocacion para colocar las piezas según el jugador quiera
			colocacion(t, jugador);
			
			// Creamos dos for-each que imprima la tabla para ver como va el juego
			for (char fila[]: t) {
				for (char elemento: fila) {
					System.out.print(elemento + " ");
				}
				System.out.println();
			}
			
			// Comprobamos si ha ganado algún jugador si no ha ganado ningún jugador comprobamos si la tabla está rellena
			if (filas(t) || columnas(t) || diagonales(t)) {
				ganar = true;
				System.out.println("Felicidades ha ganado el jugador " + jugador);
			} else {
				entera = recorre(t);
			}
			
			// Cambiamos al siguiente jugador
			jugador++;
		}
		
		System.out.println("Fin del juego");
		
		// Cerramos el Scanner
		reader.close();
	}
	
	// Función que coloque la pieza del juagador en el tablero donde él quiera
	static void colocacion (char t[][], int j) {
		
		// Declaración de variables
		// Variable que indica si hay o no un error
		boolean error;
		// Variable que guarda la fila
		int fila = 0;
		// Variable que guarda la columna
		int columna = 0;
		// Vairable que indica la pieza que se va a jugar
		char pieza;
		
		// Distinguimos la pieza según el jugador que vaya a jugar 
		if (j == 1) {
			pieza = 'X';
		} else {
			pieza = 'O';
		}
		
		// Creamos un do-while que salga del bucle cuando no haya errores
		System.out.println("Turno del jugador " + j + ", coloca la pieza " + pieza);
		do {
			try {
				// Le pedimos la fila y columna al jugador
				System.out.println("Introduce la fila (0-2): ");
				fila = reader.nextInt();
				assert (fila >= 0 && fila < 3);
				System.out.println("Introduce la columna (0-2): ");
				columna = reader.nextInt();
				assert (columna >= 0 && columna < 3);
				if (t[fila][columna] != '-') {
					System.err.println("Ya hay una pieza colocada en ese lugar");
					error = true;
				} else {
					t[fila][columna] = pieza;
					error = false;
				}
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos los valores válidos
				System.err.println("La fila y la columna deben ser entre 0-2");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);
	}
	
	// Función que recorre las filas para ver si ha ganado algún jugador
	static boolean filas (char t[][]) {
		
		// Declaración de variables
		boolean ganar = false;
		boolean vacio = false;
		int i = 0;
		
		while (!ganar && i < t.length) {
			vacio = t[i][0] == '-';
			if (!vacio) {
				ganar = true;
				for (int j = 1; j < t[i].length; j++) {
					ganar = ganar && (t[i][0] == t[i][j]);
				}
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
		
		while (!ganar && j < 3) {
			vacio = t[0][j] == '-';
			if (!vacio) {
				ganar = true;
				for (int i = 1; i < t.length; i++) {
					ganar = ganar && (t[0][j] == t[i][j]); 
				}
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
		boolean ganar1 = true;
		boolean ganar2 = true;
		boolean vacio1 = t[0][0] == '-';
		boolean vacio2 = t[t.length - 1][0] == '-';
		int i = 1;
		int k = 0, j = t.length - 1;
		boolean ganar;

		if (!vacio1) {
			while (ganar1 && i < t.length) {
				ganar1 = ganar1 && (t[0][0] == t[i][i]);
				i++;
			}
		} else {
			ganar1 = false;
		}

		if (!vacio2) {
			while (ganar2 && k < t.length) {
				ganar2 = ganar2 && (t[j][k] == t[t.length - 1][0]);
				k++;
				j--;
			}
		} else {
			ganar2 = false;
		}

		ganar = ganar1 || ganar2;

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
