package extras;

import java.util.Scanner;

public class Ejercicio1 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String domingo;
		
		double semana[] = new double[7];
		String maxMin[] = new String[2];
		semana[6] = -1;
	
		rellenar(semana);
		
		for (double valor: semana) {
			System.out.println(valor);
		}
		
		maxMin = maxYmin(semana);
		
		
		
	}
	
	// Función que rellena la tabla de las ventas semanales con los valores del usuario
	static void rellenar(double t[]) {
		
		// Declaración de variables
		// Variable que indica si hay o no un error
		boolean error;
		
		// Creamos una tabla que contenga los días laborales
		String diasLaborales[] = {"martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
		
		// Creamos un for que le pregunte al usuario por las ventas de cada día y las guarde en la tabla
		for (int i = 0; i < t.length-1; i++) {
			do {
				try {
					// Le pedimos las ventas que ha tenido cada día
					System.out.println("Introduce las ventas totales del " + diasLaborales[i]);
					t[i] = reader.nextDouble();
					error = false;
				} catch (Exception e) {
					// Imprimimos un mensaje de error
					System.out.println("Introduce un valor válido");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}
	}
	
	// Función que calcula el max y min de las ventas 
	static String[] maxYmin(double t[]) {
		
		// Creamos una tabla donde guardará el máximo y el mínimo
		String maxYmin[] = new String[2];
		int indice[] = new int[2];
		double mm[] = new double [2];
		
		mm[0] = t[0];
		mm[1] = t[0];
		
		for (int i = 1; i < t.length-1; i++) {
			if (mm[0] < t[i]) {
				indice[0] = i;
			}
			if (mm[1] > t[i]) {
				indice[1] = i;
			}
		}
		
		for (int i = 0; i < maxYmin.length; i++) {
			maxYmin[i] = switch(indice[i]) {
			case 0 -> {
				yield "MARTES";
			}
			case 1 -> {
				yield "MIÉRCOLES";
			}
			case 2 -> {
				yield "JUEVES";
			}
			case 3 -> {
				yield "VIERNES";
			}
			case 4 -> {
				yield "SÁBADO";
			}
			default -> {
				yield "DOMINGO";
			}
			};
		}
		return maxYmin;
		
	}
}
