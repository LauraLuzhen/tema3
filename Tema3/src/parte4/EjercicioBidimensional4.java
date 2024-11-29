package parte4;

import java.util.Scanner;

public class EjercicioBidimensional4 {

	// Creamos el Scanner
	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que indica si hay o no un error
		boolean error = false;
		
		// Creamos una tabla que guarde las dimensiones de la tabla
		int dimensiones[] = longitud();
		// Creamos una tabla dimensional a la que vamos a dar la logitud de las dimensiones
		int tabla[][] = new int[dimensiones[0]][dimensiones[1]];
		
		// Creamos dos for que recorra la tabla entera
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				// Creamos un do-while que salga del bucle cuando no haya errores
				do {
					try {
						// Le pedimos los valores de la tabla al usuario
						System.out.println("Introduce un valor: ");
						tabla[i][j] = reader.nextInt();
						error = false;
					} catch (Exception e) {
						// Imprimimos un mensaje de error
						System.err.println("Introduce un valor válido");
						error = true;
					} finally {
						reader.nextLine();
					}
				} while (error);
			}
		}
		
		// Llamamos a la función e imprimimos si es mágica o no
		System.out.println("¿La tabla es mágica? " + esMagica(tabla));
		
		// Cerramos el Scanner
		reader.close();
	}
	
	// Creamos una función que devuelve una tabla unidimensional que contenga la longitud de la tabla según los datos introducidos por el usuario
	static int[] longitud() {
		
		// Declaración de variables
		// Variable que indica si hay o no errores
		boolean error = false;
		
		// Creamos una tabla de longitud 2 para guardar las dimensiones
		int tabla[] = new int[2];
		// Creamos una tabla que guarde el contenido de esos valores
		String longitud[] = {"filas", "columnas"};
		
		// Creamos un for con 2 iteraciones
		for (int i = 0; i < tabla.length; i++) {
			// Creamos un do-while que salga del bucle cuando no haya errores
			do {
				try {
					// Le pedimos las longitudes
					System.out.println("Introduce el número de " + longitud[i] + ": ");
					if (i == 0) {
						tabla[i] = reader.nextInt();
						assert (tabla[i] > 0);
					} else {
						tabla[i] = reader.nextInt();
						assert (tabla[i] > 0);
					}
					error = false;
				} catch (Exception e) {
					// Imprimimos un mensaje de error
					System.err.println("Introduce un valor válido");
					error = true;
				} catch (AssertionError e) {
					// Imprimimos los valores válidos que permite
					System.err.println("Las " + longitud[i] + " deben ser mayores que 0");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}
		
		// Devolvemos la tabla
		return tabla;
	}
	
	static boolean esMagica(int t[][]) {
		
		// Declaración de variables
		// Variable que indica si es mágica o no
		boolean magica = true;
		// Variable que guarda la primera suma realizada
		int sumaPrimera = 0;
		// Variable que guarda la suma de cada fila y columnas
		int suma;
		// Variable que indica las filas
		int i;
		// Variable que indica las columnas
		int j;
		
		// Creamos un if que compara el número de filas y columnas
		if (t.length != t[0].length) {
			magica = false;
		}
		
		// Creamos un for que recorra cada columnas de la primera fila y calculamos su suma
		for (int k = 0; k < t[0].length; k++) {
			sumaPrimera += t[0][k];
		}
		
		// Inicializamos las filas a 0
		i = 0;
		
		// Creamos un while que va a recorrer las filas
		while (magica && i < t.length) {
			suma = 0;
			// Creamos un for que recorre las columnas de cada fila y suma sus valores
			for (j = 0; j < t[i].length; j++) {
				suma += t[i][j];
			}
			// Compara la suma con la primera suma
			if (sumaPrimera != suma) {
				magica = false;
			}
			// Aumnetamos el número de filas
			i++;
		}
		
		// Inicializamos las columnas a 0
		j = 0;
		
		// Creamos un while que va a recorrer las columnas
		while (magica && j < t[0].length) {
			suma = 0;
			// Creamos un for que recorra las columnas y vaya sumandos las filas sus elementos
			for (i = 0; i < t.length; i++) {
				suma += t[i][j];
			}
			// Creamos un if que compare la suma con la primera suma
			if (sumaPrimera != suma) {
				magica = false;
			}
			// Cambiamos de columna
			j++;
		}
		
		// Devolvemos si es mágica o no
		return magica;
	}
}
