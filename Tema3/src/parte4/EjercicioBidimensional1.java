package parte4;

import java.util.Arrays;
// Importamos el Random
import java.util.Random;

public class EjercicioBidimensional1 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;

		// Creamos una tabla de 6 filas y 10 columnas
		int tabla[][] = new int[6][10];

		// Creamos el Random
		Random rand = new Random();

		// Creamos dos for que rellene la tabla[] con números randoms, uno para las
		// filas y otro para las columnas
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				numRandom = rand.nextInt(0, 1001);
				tabla[i][j] = numRandom;
			}
		}

		// Llamamos e imprimimos la función
		System.out.println(Arrays.toString(minmax(tabla)));
	}

	static int[] minmax(int t[][]) {

		// Creamos una tabla de dos posiciones
		int tablaMinMax[] = new int[2];

		// Con el método fill rellenamos la tablaMinMax con el primer elemento de la t[]
		Arrays.fill(tablaMinMax, t[0][0]);

		// Creamos dos for que recorra cada elemento de la t[]
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				// Creamos dos ifs que si el elemento de t[] es menor o mayor al mínimo y máximo
				// guardados se cambia el valor
				if (t[i][j] < tablaMinMax[0]) {
					tablaMinMax[0] = t[i][j];
				}
				if (t[i][j] > tablaMinMax[1]) {
					tablaMinMax[1] = t[i][j];
				}
			}
		}

		// Devolvemos la tablaMinMax[]
		return tablaMinMax;
	}
}
