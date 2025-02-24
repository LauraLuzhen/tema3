package collections2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ej4 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la opción del usuario
		int opc;
		// Variable que guarda el nombre
		String nombre;

		// Creamos la lista
		Set<String> listaNombres = new HashSet<String>();

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Do-while que sale del bucle cuando el usuario lo elija
		do {
			// Le pedimos una opción
			System.out.println("Elige una opción: ");
			// Imprimimos el menú
			menu();
			opc = reader.nextInt();
			reader.nextLine();

			// Switch según la opción elegida
			switch (opc) {
			case 1 -> {
				// Le pedimso un nombre
				System.out.println("Ingresa un nombre: ");
				nombre = reader.nextLine();
				// If-else si lo añade bien no estaba en la lista, en caso contrario lo
				// indicamos
				if (listaNombres.add(nombre)) {
					System.out.println("Nombre añadido correctamente");
				} else {
					System.out.println("El nombre ya se encuentra en la lista");
				}
			}
			case 2 -> {
				// Le pedimos un nombre
				System.out.println("Ingrese un nombre: ");
				nombre = reader.nextLine();
				// If-else si lo elimina bien lo indicamos, en caso contrario no se encuentra en
				// la lista
				if (listaNombres.remove(nombre)) {
					System.out.println("El nombre se ha eliminado correctamente");
				} else {
					System.out.println("El nombre no existe en la lista");
				}
			}
			case 3 -> {
				// Creamos un TreeSet que ordene la lista y la imprimimos
				Set<String> listaOrdenada = new TreeSet<>(listaNombres);
				System.out.println(listaOrdenada);
			}
			case 4 -> {
				// Le pedimos un nombre
				System.out.println("Introduce un nombre: ");
				nombre = reader.nextLine();
				// If-else si lo contiene lo indicamos y en caso contrario también
				if (listaNombres.contains(nombre)) {
					System.out.println("El nombre existe en la lista");
				} else {
					System.out.println("El nombre no se ha encontrado en la lista");
				}
			}
			case 5 -> System.out.println("Saliendo del programa...");
			default -> System.out.println("Opción no válida");
			}
		} while (opc != 5);

		// Cerramos el Scanner
		reader.close();
	}

	// Función que imprime el menú
	public static void menu() {
		System.out.println("1. Añadir un nuevo elemento a la lista");
		System.out.println("2. Elimina un nombre específico");
		System.out.println("3. Ordena la lista alfabéticamente");
		System.out.println("4. Busca si un nombre específico está en la lista");
		System.out.println("5. Salir");
	}
}
