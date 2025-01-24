package collections;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Implementa el control de acceso al área restringida de un programa. Los
		 * nombres de usuario con sus correspondientes contraseñas deben estar
		 * almacenados en una estructura de la clase HashMap. El programa mostrará un
		 * menú con dos opciones: Registro. Debe pedir un nombre de usuario y una
		 * contraseña. A continuación, se almacenarán en el mapa. Login. Debe pedir un
		 * nombre de usuario y una contraseña. Si el usuario introduce los datos
		 * correctamente, el programa dirá “Ha accedido al área restringida”. El usuario
		 * tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el
		 * programa dirá “Lo siento, no tiene acceso al área restringida”. Salir.
		 * Termina el programa.
		 * 
		 */
		
		// Declaración de variables
		int respuesta;
		String usuarioAñadido;
		String contraseñaAñadida;
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Elige una opción: ");
		respuesta = reader.nextInt();
		
		while (respuesta != 3) {
			if (respuesta == 1) {
				
			} else {
				
			}
			
			System.out.println("Elige una opción: ");
			respuesta = reader.nextInt();
		}
		
		System.out.println("Has cerrado sesión");
		// Cerramos el Scanner
		reader.close();
	}
}
