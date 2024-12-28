package parteStrings;

import java.util.Scanner;

public class Ejercicio17 {
	
	// Creamos el Scanner
	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda el código introducido por el usuario
		String codigo;
		// Variable que guarda el código sin comentarios
		String resultado;
		
		// Le pedimos el código al usuario
		System.out.println("Introduce el código en C: ");
		codigo = reader.nextLine();
		
		// Le quitamos los comentarios al código llamando a la función
		resultado = eliminaComentarios(codigo);
		
		// Imprimimos el código sin los comentarios
		System.out.println(resultado);
		
		// Cerramos el Scanner
		reader.close();
	}
	
	// Función que elimina los comentarios
	static String eliminaComentarios (String codigo) {
		
		// Declaración de variables
		// Variable que guarda la parte anterior al comentario
		String inicioComentario;
		// Variable que guarda la parte posterior al comentario
		String finComentario;
		// Variable que guarda la posición de inicio del comentario
		int posInicio = codigo.indexOf("/*");
		// Variable que guarda la posición de fin del comentario
		int posFin = codigo.indexOf("*/");
		
		// Creamos un while que si el codigo tiene el inicio y fin de un comentario entre en el bucle para eliminarlo
		while ((posInicio > -1) && (posFin > -1)) {
			// Guardamos el inicio del código antes del comentario
			inicioComentario = codigo.substring(0, posInicio);
			// Guardamos el código restante después del comentario
			finComentario = codigo.substring(posFin + 2);
			
			// Guardamos ambas partes en el código
			codigo = inicioComentario + finComentario;
			
			// Volvemos a ver si hay otros comentaario en el código
			posInicio = codigo.indexOf("/*");
			posFin = codigo.indexOf("*/");
		}

		// Devolvemos el código sin comentarios
		return codigo;
	}
}
