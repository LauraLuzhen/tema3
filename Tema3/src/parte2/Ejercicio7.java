package parte2;

// Importamos el Arrays
import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el índice desde donde va a comenzar la copia
		int desde = 0;
		// Variable que guarda el índice hasta donde va a terminar la copia -1, por eso
		// lo inicializamos a 1
		int hasta = 1;
		// Variable que guarda el número que vamos a introducir en la tabla, comenzamos
		// por el 1
		int num = 1;
		// Variable que guarda la longitud de la tabla
		int longitud = 0;

		// Creamos una tabla
		int tabla[];

		// Creamos un for que calcule la longitud total de la tabla
		for (int i = 1; i <= 10; i++) {
			longitud += i;
		}

		// Le damos la longitud a la tabla[]
		tabla = new int[longitud];

		// Creamos un while que se sale del bucle cuando el número es mayor que 10
		while (num <= 10) {
			// Utilizamos el método fill para añadir un valor (num) en un rango de la
			// tabla[]
			Arrays.fill(tabla, desde, hasta, num);

			// Calculamos los valores del siguiente número que son el índice donde va a
			// comenzar (desde) y el índice donde va a acabar (hasta)
			desde += num;
			num++; // Aumentamos el valor del número
			hasta += num;
		}

		// Imprimimos con el método toString la tabla
		System.out.println(Arrays.toString(tabla));
	}
}
