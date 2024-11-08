package parte1;

import java.util.Arrays;

public class Binaria {

	public static void main(String[] args) {
		
		int tabla [] = {5, 10, 18, 26, 32, 48, 53, 60};
		
		//Queremos saber si está el valor 26
		int posicion = Arrays.binarySearch(tabla, 1);
		
		System.out.println(posicion);
		//Si posición contiene un número negativo el valor que queremos no se encuentra en la tabla
		if (posicion >= 0) {
			System.out.println("El valor está en la posición " + posicion);
		} else {
			System.out.println("El valor no esta");
		}
		
		
	}
}
