package parte3;

// Importamos el Random
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;
		// Variable que guarda la suma de cada fila
		int sumFila = 0;
		// Variable que guarda el total
		int total = 0;
		//Variable que guarda la suma de cada columna
		int sumColumna = 0;
		
		// Creamos una tabla de x=4 y=5
		int tabla[][] = new int[4][5];

		// Creamos el Random
		Random rand = new Random();

		// Creamos dos for, uno que recorra las filas y otro las columnas
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[0].length; j++) {
				// Generamos un número random del 100-999
				numRandom = rand.nextInt(100, 1000);

				// Lo guardamos e imprimios en la celda
				tabla[i][j] = numRandom;
				System.out.print(tabla[i][j] + "\t");

				// Vamos calculando la suma total de cada fila
				sumFila += numRandom;
			}

			total += sumFila;
			System.out.print(sumFila);
			System.out.println();
			sumFila = 0;
		}
		
		for (int i=0; i<tabla[0].length; i++) {
			for (int j=0; j<tabla.length; j++) {
				sumColumna += tabla[j][i];
			}
			System.out.print(sumColumna + "\t");
			total += sumColumna;
			
			sumColumna = 0;
		}
		
		System.out.println(total);
		
	}
}
