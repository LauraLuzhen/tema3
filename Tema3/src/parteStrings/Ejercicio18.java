package parteStrings;

import java.util.Scanner;

public class Ejercicio18 {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el título de la página web
		String titulo;
		// Variable que guarda el contenido de la página web
		String contenido;
		// Variable que guarda el código html
		String codigo;

		// Le pedimos al usuario que itroduzca el título
		System.out.println("Introduce el título de la página web: ");
		titulo = reader.nextLine();

		// Le pedimos el contenido
		System.out.println("Introduce el contenido de la página web: ");
		contenido = reader.nextLine();

		// Llamamos a la función para que imprima el código html
		codigo = htmlCodigo(titulo, contenido);

		// Imprimimos el resultado
		System.out.println(codigo);

		// Cerramos el Scanner
		reader.close();
	}

	// Función que imprime el código html
	static String htmlCodigo(String titulo, String contenido) {

		// Declaración de variables
		// Variable que guarda cada línea de código html
		// Comenzamos indicando el tipo de documento
		String html = "<!DOCTYPE html>\n";
		// Le añadimos la etiqueta de inicio del documento
		html += "<html>\n";
		// Le añadimso la cabecera
		html += "<head>\n\t<title>" + titulo + "</title>\n";
		// Le añadimos el cuerpo
		html += "<body>\n\t<h1>" + titulo + "</h1>\n\t<p>" + contenido + "</p>\n</body>";
		// Le añadimos el fin del documento
		html += "\n</html>";

		// Imprimimos el resultado
		return html;
	}
}
