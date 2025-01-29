package collections2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ej1 {

	public static void main(String[] args) {
		
		List<Integer> lista1 = new ArrayList<>(); 	//Modificación y lectura
		List<Integer> lista2 = new LinkedList<>(); 	//Insercción y eliminación de objetos
		
		
		lista1.add(1);	//Añade un nuevo objeto al final de la lista 
						//Devuelve true
		
		System.out.println(lista1);
	}
}
