package parte4;

import java.util.Scanner;

public class EjercicioBidimensional3 {

	public static void main(String[] args) {
		
		//Declaración de variables
		//Variable que guarda el elemento de la tabla
		int elemento = 0;
		
		//Creamos una tabla de 4 filas y 4 columnas
		int tabla[][] = new int[4][4];
		
		//Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		//Creamos dos for que le pida los elementos al usuario y los guarda en la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.println("Introduce un elemento: ");
				elemento = reader.nextInt();
				tabla[i][j] = elemento;
			}
		}
		
		//Llamamos e imprimimos la función
		System.out.println(simetrica(tabla));
	}
	
	static boolean simetrica(int t[][]) {
		
		//Declaración de variables
		//Variable que indica si es simétrica o no
		boolean simetrica = false;
		boolean nosimetrica = false;
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				simetrica = t[i][j] == t[j][i];
				if (simetrica == false) {
					nosimetrica = true;
				}
			}
		}
		
		return !nosimetrica;
	}
}
