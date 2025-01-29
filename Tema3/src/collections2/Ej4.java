package collections2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ej4 {

	// Variable que guarda la opción elegida por el usuario
	static int opcion;
	// Variable que guara el nombre que dice el usuario
	static String nombre;

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	// Creamos la colección HashSet
	static Set<String> nombresPersonas = new HashSet<>();

	public static void main(String[] args) {

		// Llamamos a la función menu y guardamos la respuesta
		opcion = menu();

		// While que sale del bucle cuando la opción es Salir
		while (opcion != 5) {

			// Switch que según la variable opción hace una u otra
			switch (opcion) {
			case 1 -> {
				añadir();
			}
			case 2 -> {
				eliminar();
			}
			case 3 -> {
				ordenar();
			}
			case 4 -> {
				buscar();
			}
			}

			// Volvemos a llamar a la fucnión menú
			opcion = menu();
		}

		// Mensaje de fin
		System.out.println("Fin del programa");

		// Cerramos el Scanner
		reader.close();
	}

	// Función op1
	static void añadir() {
		// Le pedimos un nombre al usuario para añadir en la lista
		do {
			System.out.println("Introduce un nuevo nombre a la lista: ");
			nombre = reader.nextLine();
		} while (!nombresPersonas.add(nombre));
		System.out.println("Nombre añadido correctamente");
	}

	// Función op2
	static void eliminar() {
		// Le pedimos un nombre al usuario para eliminarlo de la lista
		do {
			System.out.println("Introduce el nombre a eliminar de la lista: ");
			nombre = reader.nextLine();
		} while (!nombresPersonas.remove(nombre));
		System.out.println("Nombre eliminado correctamente");
	}

	// Función op3
	static void ordenar() {
		// Odenamos los nombres alfabéticamente
		Set<String> nombresOrdenados = new TreeSet<>(nombresPersonas);
		System.out.println("Colección ordenada alfabéticamente:\n" + nombresOrdenados);
	}

	// Función op4
	static void buscar() {
		// Le pedimos al usuario el nombre que quiera buscar
		System.out.println("Introduce el nombre que quieras buscar en la lista: ");
		nombre = reader.nextLine();

		// If-else que imprime si se ha encontrado el nombre en la colección o no
		if (nombresPersonas.contains(nombre)) {
			System.out.println(nombre + " se encuentra en la lista");
		} else {
			System.out.println(nombre + " no se encuentra en la lista");
		}
	}

	// Función que muestra el menu
	static int menu() {

		// Variable que guarda la opción del menú elegida por el usuario
		int opcion = 0;
		// Variable que indica que hay un error
		boolean error = false;

		do {
			try {
				System.out.println(
						"1. Añadir nuevo nombre a la lista.\n2. Elimina un nombre específico.\n3. Ordena la lista alfabéticamente.\4. Busca si un nombre específico está en la lista.\n5. Salir.");
				opcion = reader.nextInt();
				assert (opcion >= 1 && opcion <= 5);
				error = false;
			} catch (Exception e) {
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				System.err.println("Introduce un valor dentro del rango (1-5)");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Devolvemos la opción elegida por el usuario
		return opcion;
	}
}
