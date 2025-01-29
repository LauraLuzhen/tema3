package collections2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ej6 {

	// Variable que guarda la opción del usuario
	static int opcion;
	// Variable que guarda el nombre de la persona
	static String nomPersona;
	// Variable que guarda el teléfono de la persona
	static int telefono;

	// Creamos el mapa donde van a estar las personas y sus teléfonos
	static Map<String, Set<Integer>> libreta = new HashMap<>();

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Llamamos a la función menu
		opcion = menu();

		// While que sale del bucle cuando el usuario lo indique
		while (opcion != 5) {
			// Swhitch que elige opción según el valor de opción
			switch (opcion) {
			case 1 -> {
				añadirPersona();
			}
			case 2 -> {
				añadirTelefono();
			}
			case 3 -> {
				mostrar();
			}
			case 4 -> {
				eliminarTelefono();
			}
			}

			// Volvemos a llamar a la función menu
			opcion = menu();
		}

		// Mensaje de fin
		System.out.println("Fin del programa");

		// Cerramos el Scanner
		reader.close();
	}

	// Función op1
	static void añadirPersona() {
		// Le pedimos el nombre de la persona
		System.out.println("Introduce el nombre de la persona: ");
		nomPersona = reader.nextLine();

		// If-else si contiene ya el nombre lo indicamos, en caso contrario añadimos el
		// nombre al mapa
		if (libreta.containsKey(nomPersona)) {
			System.out.println("La persona ya se encuentra en la lista");
		} else {
			libreta.put(nomPersona, new HashSet<Integer>());
			System.out.println("Persona añadida correctamente");
		}
	}

	// Función op2
	static void añadirTelefono() {
		// Le pedimos el nombre de la persona que queremos añadir un teléfono
		System.out.println("Introduce el la persona que quieras añadir un teléfono: ");
		nomPersona = reader.nextLine();

		// If-else si el nombre está en la lista le pedimos el teléfono, en caso
		// contrario lo indicamos
		if (libreta.containsKey(nomPersona)) {
			// Le pedimos al usuario el teléfono
			System.out.println("Introduce el nuevo teléfono: ");
			telefono = reader.nextInt();
			reader.nextLine();

			// Ternario que añade el teléfono si no está en la lista de teléfonos
			System.out.println(libreta.get(nomPersona).add(telefono) ? "Teléfono añadido correctamente."
					: "El número ya está en la lista.");
		} else {
			System.out.println("El nombre de la persona introducido no se encuentra en la lista");
		}
	}

	// Función op3
	static void mostrar() {
		// Le pedimos el nombre de la persona que queremos saber sus teléfonos
		System.out.println("Introduce el nombre de la persona que quieras mirar sus teléfonos: ");
		nomPersona = reader.nextLine();

		// If-else que si contiene a la persona imprimimos sus teléfonos, en caso
		// contrario lo indicamos
		if (libreta.containsKey(nomPersona)) {
			System.out.println(libreta.get(nomPersona));
		} else {
			System.out.println("El nombre de la persona introducido no se encuentra en la lista");
		}
	}

	// Función op4
	static void eliminarTelefono() {
		// Le pedimos el nombre de la persona que queremos saber sus teléfonos
		System.out.println("Introduce el nombre de la persona que quieras eliminar un teléfono: ");
		nomPersona = reader.nextLine();

		// If-else que si contiene a la persona imprimimos sus teléfonos, en caso
		// contrario lo indicamos
		if (libreta.containsKey(nomPersona)) {
			System.out.println(libreta.get(nomPersona));
		} else {
			System.out.println("El nombre de la persona introducido no se encuentra en la lista");
		}
	}

	// Función que imprime el menu y devuelve la opción elegida por el usuario
	static int menu() {

		// Variable que guarda la opción elegida por el usuario
		int opcion = 0;
		// Variable que indica si hay un error
		boolean error = false;

		// Le pedimos una opción del menú al usuario
		do {
			try {
				System.out.println(
						"1. Añadir persona.\n2. Añadir teléfono a una persona dada.\n3. Mostrar los teléfonos de una persona dada.\n4. Eliminar teléfono de una persona.\n5. Salir");
				opcion = reader.nextInt();
				assert (opcion >= 1 && opcion <= 5);
				error = false;
			} catch (Exception e) {
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				System.out.println("Introduce un valor dentro del rango (1-5)");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Devolvemos el resultado
		return opcion;
	}
}
