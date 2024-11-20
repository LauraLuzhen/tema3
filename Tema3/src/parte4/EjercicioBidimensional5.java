package parte4;

import java.util.Scanner;

public class EjercicioBidimensional5 {

	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda la longitud de la tabla
		int longitud = 0;
		// Variable que indica si hay o no error
		boolean error = false;
		
		// Creamos una tabla
		int tabla[][];
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		// Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				// Le pedimos la longitud de la tabla al usuario
				System.out.println("Introduce la longitud de la tabla bidimensional: ");
				longitud = reader.nextInt();
				assert (longitud > 0);
				error = false;
			} catch (Exception e) {
				// Imprimimos un mensaje de error
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				// Imprimimos los valores permitidos
				System.err.println("La longitud debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);
		
		//Le damos la longitud a la tabla[][]
		tabla = new int[longitud][longitud];
		
		
	}
	
	static int[][] rellenarTabla(int t[][]) {
		
		//Creamos 
	}
}
