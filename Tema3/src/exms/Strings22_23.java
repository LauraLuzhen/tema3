package exms;

import java.util.Random;
import java.util.Scanner;

public class Strings22_23 {

	static Scanner src = new Scanner (System.in);
	
	static Random rand = new Random();
	
	static String[] palabras = {"humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza", "brazo", "familia"};
	
	static final int NUMINTENTOS = 7;
	
	static String palabraSecreta;
	
	static String palabraPista = "";
	
	static String noAcertadas = "";
	
	public static void main(String[] args) {
		
		int intentos = 0;
		int eleccion;
		char letra;
		String palabra;
		String letraCorregida;
		
		generarPalabra();
		
		for (int i = 0; i < palabraSecreta.length(); i++) {
			palabraPista += '_';
		}
		
		System.out.println(palabraPista);
		
		do {
			
			do {
				eleccion = menu();
			} while (eleccion != 1 && eleccion != 2);
			
			if (eleccion == 1) {
				
				do {
					System.out.println("Introduce una letra: ");
					letra = src.next().charAt(0);
					letraCorregida = String.valueOf(letra).toLowerCase();
				} while (palabraPista.contains(letraCorregida));
				
				compruebaLetra(letra);
				intentos++;
				
			} else {
				System.out.println("Introduce la palabra a acertar: ");
				palabra = src.next();
				src.nextLine();
				
				compruebaPalabra(palabra);
			}
			
			pintaPista();
			
			System.out.println("Número de intentos restantes " + intentos + "/7");
		} while (!palabraPista.equals(palabraSecreta) && intentos < NUMINTENTOS);
		
		if (intentos == NUMINTENTOS) {
			System.out.println("GAME OVER");
		} else {
			System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");
		}
		
		src.close();
	}
	
	static void generarPalabra () {
		
		int numAleatorio = rand.nextInt(0, palabras.length);
		
		palabraSecreta = palabras[numAleatorio];
	}
	
	static int menu () {
		
		int respuesta;
		
		System.out.println("Seleccione una de las siguientes opciones: \n  1. Introducir letra.\n  2. Introducir palabra.");
		respuesta = src.nextInt();
		
		return respuesta;
	}
	
	static void compruebaLetra (char letra) {
		
		char letraCorregida = Character.toLowerCase(letra);
		String letraCadena = String.valueOf(letraCorregida);
		
		if (palabraSecreta.contains(letraCadena)) {
			for (int i = 0; i < palabraSecreta.length(); i++) {
				if (palabraSecreta.charAt(i) == letraCorregida) {
					palabraPista = palabraPista.substring(0, i) + letraCorregida + palabraPista.substring(i+1);
				}
			}
		} else {
			noAcertadas += letraCorregida + "  ";
		}
		
	}
	
	static void compruebaPalabra (String palabra) {
		
		String palabraCorregida = palabra.toLowerCase();
		
		if (palabraSecreta.equals(palabraCorregida)) {
			palabraPista = palabraCorregida;
		}
	}
	
	static void pintaPista () {
		
		System.out.println("Letras no acertadas: " + noAcertadas);
		
		System.out.println(palabraPista);
	}
}