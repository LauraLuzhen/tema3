package parte4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int longitud = 0;
		int fin = 0;
		boolean error = false;
		
		Scanner reader = new Scanner (System.in);
		
		do {
			try {
				System.out.println("Introduce la longitud: ");
				longitud = reader.nextInt();
				assert (longitud > 0);
				error = false;
			} catch (Exception e) {
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				System.err.println("La longitud debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);
		
		do {
			try {
				System.out.println("Introduce hasta que número se puede generar: ");
				fin = reader.nextInt();
				assert (fin > 2);
				error = false;
			} catch (Exception e) {
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				System.err.println("El valor debe ser mayor que 2");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);
		
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
		
		reader.close();
	}
	
	static int[] rellenaPares(int longitud, int fin) {
		
		int numRandom;
		
		int tabla[] = new int[longitud];
		
		Random rand = new Random();
		
		for (int i=0; i<tabla.length; i++) {
			numRandom = rand.nextInt(2, fin+1);
			while (numRandom % 2 != 0) {
				numRandom = rand.nextInt(2, fin+1);
			}
			tabla[i] = numRandom;
		}
		
		return tabla;
	}
}
