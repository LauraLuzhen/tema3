package parte1;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos una tabla de longitud 12 que se llame num
		int num[] = new int[12];

		// Le asignamos los siguientes valores para las posiciones indicadas
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 15;
		num[9] = 120;

		// Creamos un for-each para imprimir los elementos de la tabla num[]
		for (int valor : num) {
			System.out.println(valor);
		}

		// Los valores que no se les ha asignado ningún valor se inicializan a 0
	}
}
