package parte1;

public class Copy {

	public static void main(String[] args) {
		
		int tablaOrigen[] = {1, 2, 3, 4, 5};
		int tablaDestino[] = {11, 22, 33, 44, 55};
		
		System.arraycopy(tablaOrigen, 2, tablaDestino, 3, 3);

		
		for (int valor : tablaDestino) {
			System.out.println(valor);
		}
	}
}
