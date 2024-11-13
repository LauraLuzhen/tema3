package parte3;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos una tabla num[] de 3 filas y 6 columnas
		int num[][] = new int[3][6];

		// Le damos los valores indicados en las posiciones asignadas
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// Creamos dos for para imprimir la tabla num[] en forma de matriz
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
