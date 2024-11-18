package parte4;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaración de variables
		//Variable que guarda la longitud de la tabla que dice el usuario
		int longitud = 0;
		//Variable que indica si hay o no error
		boolean error = false;
		
		//Creamos una tabla
		int tabla[];
		
		//Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		//Creamos un do-while que salga del bucle cuando no haya errores
		do {
			try {
				//Le pedimos una longitud al usuario
				System.out.println("Introduce la longitud de la tabla: ");
				longitud = reader.nextInt();
				assert (longitud > 0);
				error = false;
			} catch (Exception e) {
				//Imprimimos un mensaje de error si se produce
				System.err.println("Introduce un valor válido");
				error = true;
			} catch (AssertionError e) {
				//Imprimimos los valores válidos
				System.err.println("La longitud debe ser mayor que 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);
		
		//Le damos la longitud del ususario a la tabla
		tabla = new int[longitud];
		
		//Creamos un for que le pida los elementos de la tabla al usuario
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce un elemento de la tabla: ");
			
			//Guardamos en la posición los datos del usuario
			tabla[i] = reader.nextInt();
		}
		
		//Llamamos a la función sumaValores
		System.out.println(sumaValores(tabla));
		
		//Cerramos el Scanner
		reader.close();
	}
	
	//Creamos la función sumaValores que sumará todos los elementos de una tabla
	static int sumaValores(int tabla[]) {
		
		//Declaración de variables
		//Variable que guarda la suma totoal de los elementos
		int suma = 0;
		
		//Creamos un for que sume cada elemento de la tabla a suma
		for (int elemento: tabla) {
			suma += elemento;
		}
		
		//Devuelve suma
		return suma;
	}
}
