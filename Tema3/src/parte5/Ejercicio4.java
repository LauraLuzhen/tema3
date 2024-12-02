package parte5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la posición de la fila
		int posFila = 0;
		// Variable que guarda la posción de la columna
		int posCol = 0;
		// Variable que guarda el tipo de pieza que se va a mostrar
		char pieza = ' ';
		// Variable que indica si hay o no un error
		boolean error = true;

		// Creamos una tabla que contenga fila y columna
		String valores[] = { "fila", "columna" };
		// Creamos una tabla que guarda la tabla con los movimientos de la pieza
		// correspondiente
		char tablero[][] = new char[8][8];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que tenga dos iteraciones una que pida la fila y otra la
		// columna
		for (int i = 0; i < 2; i++) {
			// Creamos un do-while que salga del bucle cuando no haya errores
			do {
				try {
					// Le pedimos la posición al usuario
					System.out.println("Introduce la posición  de la " + valores[i] + ": ");
					if (i == 0) {
						posFila = reader.nextInt();
						assert (posFila >= 0 && posFila < 8);
					} else {
						posCol = reader.nextInt();
						assert (posCol >= 0 && posCol < 8);
					}
					error = false;
				} catch (Exception e) {
					// Imprimimos un mensaje de error
					System.err.println("Introduce un valor válido");
					error = true;
				} catch (AssertionError e) {
					// Imprimimos el rango de valores válidos
					System.err.println("La " + valores[i] + " debe ser entre 0-8");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}

		// Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimos el tipo de pieza al usuario
				System.out.println("Introduce la pieza (T, A, D, C): ");
				pieza = reader.next().charAt(0);
				assert (pieza == 'T' || pieza == 'A' || pieza == 'D' || pieza == 'C');
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos los valores válidos
				System.err.println("Introduce T, A, D o C");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Creamos un switch que dependiendo del tipo de pieza mostrará una cosa u otra
		switch (pieza) {
		case 'T' -> {
			tablero = movTorre(posFila, posCol, pieza);
		}
		case 'A' -> {
			tablero = movAlfil(posFila, posCol, pieza);
		}
		case 'D' -> {
			tablero = movDama(posFila, posCol, pieza);
		}
		case 'C' -> {
			tablero = movCaballo(posFila, posCol, pieza);
		}
		}

		// Creamos dos for-each que recorra la tabla entera y la imprima
		for (char fila[] : tablero) {
			for (char valor : fila) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}

		// Cerramos el Scanner
		reader.close();
	}

	// Función para el movimiento de la torre
	static char[][] movTorre(int posFila, int posCol, char pieza) {

		// Creamos una tabla que será el tablero
		char t[][] = new char[8][8];

		// Creamos dos for que recorra el tablero
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = '*';
				t[posFila][j] = 'X';
				t[i][posCol] = 'X';
			}
		}

		// Ponemos la posición de la torre
		t[posFila][posCol] = 'T';

		// Devolvemos la tabla
		return t;
	}

	// Función para el movimiento del alfil
	static char[][] movAlfil(int posFila, int posCol, char pieza) {

		// Declaración de variables
		// Variables que guardan las posiciones de la fila y columna
		int filas, columnas;

		// Creamos una tabla que será el tablero
		char t[][] = new char[8][8];

		// Creamos dos for que recorra todo el tablero para rellenarlo con *
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = '*';
			}
		}

		// Creamos un for que tenga 4 iteraciones para cada movimiento del alfil
		for (int i = 0; i < 4; i++) {
			// Le damos el valor de la posición de la fila y columna para guardarlas
			filas = posFila;
			columnas = posCol;
			// Creamos un if por cada iteración para imprimir cada caso por separado
			if (i == 0) {
				// Uno para la línea diagonal superior izquierda
				while (filas >= 0 && columnas >= 0) {
					t[filas--][columnas--] = 'X';
				}
			}
			if (i == 1) {
				// Uno para la línea diagonal inferior derecha
				while (filas < 8 && columnas < 8) {
					t[filas++][columnas++] = 'X';
				}
			}
			if (i == 2) {
				// Uno para la línea diagonal superior derecha
				while (filas >= 0 && columnas < 8) {
					t[filas--][columnas++] = 'X';
				}
			}
			if (i == 3) {
				// Uno para la línea diagonal inferior izquierda
				while (filas < 8 && columnas >= 0) {
					t[filas++][columnas--] = 'X';
				}
			}

		}

		// Ponemos la posición del alfil
		t[posFila][posCol] = 'A';

		// Devolvemos la tabla
		return t;
	}

	// Función para el movimiento de la torre
	static char[][] movDama(int posFila, int posCol, char pieza) {

		// Declaración de variables
		// Variables que guardan las posiciones de la fila y columna
		int filas, columnas;

		// Creamos una tabla que será el tablero
		char t[][] = new char[8][8];

		// Creamos dos for que recorra el tablero y ponga los movimientos de la fila y
		// columna
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = '*';
				t[posFila][j] = 'X';
				t[i][posCol] = 'X';
			}
		}

		// Creamos un for que tenga 4 iteraciones para cada movimiento del alfil
		for (int i = 0; i < 4; i++) {
			// Le damos el valor de la posición de la fila y columna para guardarlas
			filas = posFila;
			columnas = posCol;
			// Creamos un if por cada iteración para imprimir cada caso por separado
			if (i == 0) {
				// Uno para la línea diagonal superior izquierda
				while (filas >= 0 && columnas >= 0) {
					t[filas--][columnas--] = 'X';
				}
			}
			if (i == 1) {
				// Uno para la línea diagonal inferior derecha
				while (filas < 8 && columnas < 8) {
					t[filas++][columnas++] = 'X';
				}
			}
			if (i == 2) {
				// Uno para la línea diagonal superior derecha
				while (filas >= 0 && columnas < 8) {
					t[filas--][columnas++] = 'X';
				}
			}
			if (i == 3) {
				// Uno para la línea diagonal inferior izquierda
				while (filas < 8 && columnas >= 0) {
					t[filas++][columnas--] = 'X';
				}
			}
		}

		// Ponemos la posición de la dama
		t[posFila][posCol] = 'D';

		// Devolvemos la tabla
		return t;
	}

	// Función para el movimiento de la torre
	static char[][] movCaballo(int posFila, int posCol, char pieza) {

		// Declaración de variables
		// Variables que guardan las posiciones de la fila y columna
		int filas = posFila;
		int columnas = posCol;

		// Creamos una tabla que será el tablero
		char t[][] = new char[8][8];
		// Creamos dos tabla que tenga los valores de la posición de filas y columnas
		// Los 4 primeros elementos son para los movimiento verticales y los otros 4
		// para los horizontales
		int val1[] = { filas, filas, filas, filas, columnas, columnas, columnas, columnas };
		int val2[] = { columnas, columnas, columnas, columnas, filas, filas, filas, filas };

		// Creamos dos for que recorra todo el tablero para rellenarlo con *
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = '*';
			}
		}

		// Creamos un for con 8 iteraciones una por cada posible movimiento con el
		// caballo
		for (int i = 0; i < t.length; i++) {
			// En el caso de los dos primeros de la primera y segunda mitad
			// Aumenta o disminuye 2 las filas o las columnas según el caso
			if (i == 0 || i == 1 || i == 4 || i == 5) {
				val1[i] -= 2;
			} else {
				val1[i] += 2;
			}

			// Comprobamos que el valor de filas o columnas calculado no se salga del
			// tablero en caso de que no se salga calculamos el segundo valor de la posición
			if (val1[i] >= 0 && val1[i] < 8) {
				// Uno de cada dos casos aumenta uno o disminuye el número de filas o columnas
				// según el caso
				if (i == 0 || i == 2 || i == 4 || i == 6) {
					val2[i]++;
				} else {
					val2[i]--;
				}
				// Comprobamos que el valor de las filas o columnas no se salga del tablero en
				// caso de que no ya tendríamos las posiciones
				if (val2[i] >= 0 && val2[i] < 8) {
					// Para las 4 primeras iteraciones colocamos fila y columna según los valores de
					// la tabla valores[]
					if (i == 0 || i == 1 || i == 2 || i == 3) {
						t[val1[i]][val2[i]] = 'X';
					} else {
						// Para las 4 últimas iteraciones colocamos fila y columna según los valores de
						// la tabla valores[]
						t[val2[i]][val1[i]] = 'X';
					}
				}
			}
		}

		// Ponemos la posición del caballo
		t[posFila][posCol] = 'C';

		// Devolvemos la tabla
		return t;
	}
}
