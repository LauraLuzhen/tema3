package parte3;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos una tabla de x=10 y=10
		int tabla[][] = new int[10][10];

		// Creamos dos for, uno que recorra las filas y otro las columnas
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Tabla del " + (i + 1) + "\t");

			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = (i + 1) * (j + 1);
				System.out.print(tabla[i][j] + "\t");
			}

			System.out.println();
		}
	}
}
