package parte1;

public class Secuencial {

	public static void main(String[] args) {
		
		int indice = 0;
		int tabla[] = {2,17,3,9};
		int valor = 3;
		
		//Buscamos el indice del valor
		while (indice<tabla.length && valor != tabla[indice]) {
			indice++;
		}
		
		//Si el indice es menor que la longitud de la tabla el valor está dentro de la tabla 
		if (indice < tabla.length) {
			System.out.println("El valor " + valor + " tiene la posición " + indice);
		} else {
			System.out.println("El valor " + valor + " no se encuentra en la tabla");
		}
	}
}
