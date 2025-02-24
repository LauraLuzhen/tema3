package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la opción del usuario
		int opc;
		// Variable que guarda el nombre del producto
		String producto;
		// Variable que guarda el precio del producto
		double precio;

		// Creamos el diccionario
		Map<String, Double> productos = new HashMap<String, Double>();

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Do-while que sale del bucle cuando lo indica el usuario
		do {
			// Le pedimos una opción
			System.out.println("Introduce una opción: ");
			menu();
			opc = reader.nextInt();
			reader.nextLine();

			// Switch según la opción elegida
			switch (opc) {
			case 1 -> {
				// Le pedimos el nombre
				System.out.println("Introduce el nombre del producto: ");
				producto = reader.nextLine();
				// If-else si está lo indicamos, en caso contrario le pedimos el precio y lo
				// añadimos
				if (productos.containsKey(producto)) {
					System.out.println("Producto ya existente");
				} else {
					System.out.println("Introduce el precio: ");
					precio = reader.nextDouble();
					reader.nextLine();
					productos.put(producto, precio);
				}
			}
			case 2 -> {
				// Le pedimos el nombre
				System.out.println("Introduce el nombre del producto: ");
				producto = reader.nextLine();
				// If-else si lo contiene se elimina, en caso contrario lo indicamos
				if (productos.containsKey(producto)) {
					System.out.println("Producto eliminado");
					productos.remove(producto);
				} else {
					System.out.println("El producto no se encuentra en la lista");
				}
			}
			case 3 -> {
				// Imprimimos la lista de productos
				System.out.println(productos);
			}
			case 4 -> System.out.println("Saliendo del programa...");
			case 5 -> System.out.println("Opción no válida");
			}
		} while (opc != 4);

		// Cerramos el Scanner
		reader.close();
	}

	// Función que imprime el menú
	public static void menu() {
		System.out.println("1. Alta producto");
		System.out.println("2. Baja producto");
		System.out.println("3. Listar productos");
		System.out.println("4. Salir");
	}
}
