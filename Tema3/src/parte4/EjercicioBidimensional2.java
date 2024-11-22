package parte4;

// Importamos el Scanner
import java.util.Scanner;

public class EjercicioBidimensional2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la longitud del usuario
		int longitud = 0;

		// Creamos una tabla
		int tabla[][];
		// Creamos una tabla que sea la traspuesta
		int traspuesta[][];

		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		// Creamos dos for para rellenar la tabla con los valores
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = valor;
				valor++;
			}
		}

		// Creamos dos for para imprimir la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print("\t" + tabla[i][j]);
			}
			System.out.println();
		}

		// Llamamos a la función y la guardamos en la variable traspuesta
		traspuesta = traspuesta(tabla);

		// Creamos dos for-each para imprimir la traspuesta
		System.out.println("\t");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print("\t" + traspuesta[i][j]);
			}
			System.out.println();
		}
	}

	static int[][] traspuesta(int t[][]) {

		// Creamos una tabla que guarda la traspuesta de t[]
		int traspuesta[][] = new int[4][4];

		// Creamos dos for que recorran la t[] y lo guarde en la traspuesta[]
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				traspuesta[j][i] = t[i][j];
			}
		}

		// Devuelve la tabla traspuesta
		return traspuesta;
	}
}
