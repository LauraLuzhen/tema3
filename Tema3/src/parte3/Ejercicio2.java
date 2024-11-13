package parte3;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda un nota individual
		double nota = 0;
		// Variable que indica si hay o no error
		boolean error = false;
		// Variable que guarda la nota mínima de un alumno
		double min = Double.MAX_VALUE;
		// Variable que guarda la nota máxima de un alumno
		double max = Double.MIN_NORMAL;
		// Variable que guarda la media de un alumno
		double media = 0;

		// Creamos una tabla que tenga 4 alumnnos y 5 asignaturas
		double alumnosNotas[][] = new double[4][5];

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos dos for que uno recorra cada alumno y otro cada asignatura
		for (int i = 0; i < alumnosNotas.length; i++) {

			// Imprimimos el alumno que vamos a darle las notas
			System.out.println("Notas del alunmno " + (i + 1));

			// For para cada asigantura
			for (int j = 0; j < alumnosNotas[i].length; j++) {
				// Creamos un do-while que se salga del bucle cuando no haya errores
				do {
					try {
						// Le pedimos una nota al usuario
						System.out.println("Introduce la nota de la asigantura " + (j + 1));
						nota = reader.nextDouble();
						assert (nota >= 0 && nota <= 10);
						error = false;
					} catch (Exception e) {
						// Imprimimos un mensaje de error si lo hay
						System.err.println("Introduce un valor válido");
						error = true;
					} catch (AssertionError e) {
						// Imprimimos el rango de valores válidos
						System.out.println("Introduce un valor del 0-10");
						error = true;
					} finally {
						reader.nextLine();
					}
				} while (error == true);

				// Guardamos la nota en la celda correspondiente
				alumnosNotas[i][j] = nota;
			}
		}

		// Imprimimos la tabla con un for
		System.out.println("\t\tAsignatura 1\tAsignatura 2\tAsignatura 3\tAsignatura 4\tAsignatura 5");
		for (int i = 0; i < alumnosNotas.length; i++) {
			System.out.print("Alumno " + (i + 1) + "\t");
			for (int j = 0; j < alumnosNotas[0].length; j++) {

				System.out.print(alumnosNotas[i][j] + "\t\t");
			}
			System.out.println();
		}

		// Creamos un for que imprima por otro lado el max, min y media de cada alumno
		for (int i = 0; i < alumnosNotas.length; i++) {
			System.out.println("Alumno " + (i + 1));
			for (int j = 0; j < alumnosNotas[0].length; j++) {
				nota = alumnosNotas[i][j];
				if (nota > max) {
					max = nota;
				}
				if (nota < min) {
					min = nota;
				}
				media += alumnosNotas[i][j];
			}
			System.out.println("Nota máxima: " + max + "\nNota mínima: " + min + "\nMedia: " + media);
			max = Double.MIN_VALUE;
			min = Double.MAX_VALUE;
			media = 0;
			System.out.println();
		}
		
		// Cerramos el Scanner
		reader.close();
	}
}
