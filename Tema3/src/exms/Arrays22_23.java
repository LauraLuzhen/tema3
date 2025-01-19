package exms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays22_23 {

	// Creamos el Scanner
	static Scanner src = new Scanner (System.in);
	
	// Creamos el Random
	static Random rand = new Random ();
	
	// Tablero de 9x9
	static char[][] tablero = new char[9][9];
	
	public static void main(String[] args) {
		
		boolean vacio;
		boolean ganar;
		int jugador1;
		char ficha = ' ';
		String respuesta;
		int fila;
		int columna;
		
		do {
			ganar = false;
			vacio = true;
			System.out.println("¡¡Bienvenido al 3 en rayas!!");
			
			jugador1 = jugadorInicial();
			
			if (jugador1 == 0) {
				System.out.println("Comienza el programa (O)");
			} else {
				System.out.println("Comienza el usuario (X)");
			}
			
			limpiarTablero();
			imprimeTablero();
			
			while (!ganar && vacio) {
			
				if (jugador1 % 2 != 0) {
					System.out.println("Turno del usuario (X): ");
					ficha = 'X';
					do {
						System.out.println("Introduce una fila (0-8): ");
						fila = src.nextInt();
						System.out.println("Introduce una columna (0-8): ");
						columna = src.nextInt();
					} while (!usuarioMueveFicha(fila, columna));
					tablero[fila][columna] = ficha;	
				} else {
					System.out.println("Turno del programa (O): ");
					ficha = 'O';
					mueveFichaAleatoria();
				}
				
				imprimeTablero();
				
				ganar = esGanador(ficha);
				vacio = false;
				for (int i = 0; i < tablero.length; i++) {
					for (int j = 0; j < tablero[i].length; j++) {
						if (tablero[i][j] == '-') {
							vacio = true;
						}
					}
				}
				
				jugador1++;
			}
			
			if (!vacio) {
				System.out.println("Empate!!");
			} else if (ficha == 'X') {
				System.out.println("Ha ganado el usuario!!");
			} else {
				System.out.println("Ha ganado el programa!!");
			}
			
			System.out.println("¿Quieres jugar otra vez? ");
			respuesta = src.nextLine();
			
		} while (respuesta.equalsIgnoreCase("si"));
		
		System.out.println("¡Adiós!");
		
		// Cerramos el Scanner
		src.close();
		
	}
	
	// Función que imprime el tablero por pantalla
	static void imprimeTablero () {
		
		// Dos for-each que recorren cada elemento del tablero y lo imprime por pantalla
		for (char[] fila: tablero) {
			for (char elemento: fila) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}
	
	// Función que devuelve 0 (programa) o 1 (usuario) indicando quien inicia el juego
	static int jugadorInicial () {
		
		// Devolvemos un número aleatorio entre 0 y 1
		return rand.nextInt(0, 2);
	}
	
	// Función que mueve la ficha del programa genera una fila y col., comprueba que en esa posición no haya ficha y la coloca
	static void mueveFichaAleatoria () {
		
		// Variable que guarda la fila
		int fila;
		// Variable que guarda la columna
		int col;
		
		// Do-while que genera una posición aleatoria 
		do {
			fila = rand.nextInt(0, tablero.length);
			col = rand.nextInt(0, tablero.length);
		} while (tablero[fila][col] != '-');
		
		// Colocamos la ficha O en la posición generada por el programa
		tablero[fila][col] = 'O';
	}
	
	// Función que recibe la posición del usuario y devuelve true si la posición está vacía
	static boolean usuarioMueveFicha (int fila, int col) {
		
		// Variable que devuelve true si la posición es válida
		boolean valido;
		
		// If-else que si la posición del usuario es - es true
		if (tablero[fila][col] == '-') {
			valido = true;
		} else {
			// En caso contrario es false
			valido = false;
		}
		
		// Devolvemos el resultado
		return valido;
	}
	
	// Función que rellena el tablero de -
	static void limpiarTablero () {
		// For que recorre cada fila del tablero
		for (int i = 0; i < tablero.length; i++) {
			// Rellenamos cada elemento de la fila con -
			Arrays.fill(tablero[i], '-');
		}
	}
	
	// Función
	static boolean esGanador (char caracter) {
		
		boolean ganador = false;
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == caracter) {
					
					if (i-2 >= 0) {
						if (tablero[i-1][j] == caracter && tablero[i-2][j] == caracter) {
							ganador = true;
						}
						if ((j-2 >= 0) && tablero[i-1][j-1] == caracter && tablero[i-2][j-2] == caracter) {
							ganador = true;
						}
					}
					
					if (j-2 >= 0) {
						if (tablero[i][j-1] == caracter && tablero[i][j-2] == caracter) {
							ganador = true;
						}
						if ((i+2 < 9) && tablero[i+1][j-1] == caracter && tablero[i+2][j-2] == caracter) {
							ganador = true;
						}
					}
					
					if (i+2 < 9) {
						if (tablero[i+1][j] == caracter && tablero[i+2][j] == caracter) {
							ganador = true;
						}
						if ((j+2 < 9) && tablero[i+1][j+1] == caracter && tablero[i+2][j+2] == caracter) {
							ganador = true;
						}
					}
					
					if (j+2 < 9) {
						if (tablero[i][j+1] == caracter && tablero[i][j+2] == caracter) {
							ganador = true;
						}
						if ((i-2 >= 0) && tablero[i-1][j+1] == caracter && tablero[i-2][j+2] == caracter) {
							ganador = true;
						}
					}
				}
			}
		}
		
		return ganador;
	}
}
