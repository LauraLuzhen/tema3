package collections2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej5 {

	// Variable que guarda la opción del usuario
	static int opcion;
	// Variable que guarda el nombre de la serie
	static String nomSerie;
	// Variable que guarda la valoración de la serie
	static double valoracionSerie;

	// Creamos la colección
	static Map<String, Double> series = new HashMap<>();

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Llamamos a la función menu
		opcion = menu();

		// While que sale del bucle cuando el usuario quiera salir
		while (opcion != 4) {

			// Switch que elige la opción según la opción
			switch (opcion) {
			case 1 -> {
				añadir();
			}
			case 2 -> {
				buscar();
			}
			case 3 -> {
				eliminar();
			}
			}

			// Volvemos a imprimir el menu
			opcion = menu();
		}

		// Mensaje de fin
		System.out.println("Fin del programa");

		// Cerramos el Scanner
		reader.close();
	}

	// Función op1
	static void añadir() {
		// Le pedimos al usuario el nombre de la serie y su valoración
		System.out.println("Introduce el nombre de la serie: ");
		nomSerie = reader.nextLine();
		System.out.println("Introduce la valoración de la serie: ");
		valoracionSerie = reader.nextDouble();

		// La añadimos en el mapa
		series.put(nomSerie, valoracionSerie);
	}

	// Función op2
	static void buscar() {
		// Le pedimos el nombre de la serie a buscar
		System.out.println("Introduce el nombre de la serie que quieras buscar: ");
		nomSerie = reader.nextLine();

		// If-else que si encuentra la serie imprime su valoración, en caso contratio lo
		// indicamos
		if (series.containsKey(nomSerie)) {
			System.out.println("Valoración de '" + nomSerie + "': " + series.get(nomSerie));
		} else {
			System.out.println("La serie introducida no se encuentra en la lista.");
		}
	}

	// Función op3
	static void eliminar() {
		// Le pedimos al usuario la serie que quiera eliminar
		System.out.println("Introduce el nombre de la serie que quieras eliminar: ");
		nomSerie = reader.nextLine();

		// If-else que si se encuentra en la lista la eliminamos, en caso contrario lo
		// indicamos
		if (series.containsKey(nomSerie)) {
			series.remove(nomSerie);
			System.out.println("Serie eliminada");
		} else {
			System.out.println("La serie no se encuentra en la lista");
		}
	}

	// Función que imprime el menú y devuelve la opción que elija el usuario
	static int menu() {

		// Variable que guarda la opción del menú elegida por el usuario
		int opcion = 0;
		// Variable que indica que hay un error
		boolean error = false;

		do {
			try {
				System.out.println("1. Agregar serie\n2. Buscar serie\n3. Eliminar serie\n4. Salir");
				opcion = reader.nextInt();
				assert (opcion >= 1 && opcion <= 4);
				error = false;
			} catch (Exception e) {
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				System.err.println("Introduce un valor dentro del rango (1-4)");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Devolvemos la opción elegida por el usuario
		return opcion;
	}
}
