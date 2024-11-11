package english;

import java.util.Arrays;
// Import the Scanner
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		// Variable declaration
		// Variable that stores the value of user
		int value = 0;
		// Variable that stores the increase of user
		int increase = 0;
		// Variable that stores the lenght of table
		int lenght = 0;
		// Variable that indicates an error
		boolean error = false;

		// Create an array
		int table[];

		// Create the Scanner
		Scanner reader = new Scanner(System.in);

		// Create a do-while if there isn't an error, exit the loop
		do {
			try {
				// Ask the user for a value
				System.out.println("Introduce a value: ");
				value = reader.nextInt();
				error = false;
			} catch (Exception e) {
				// Show an error mesage
				System.err.println("Introduce a correct value");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Create a do-while if there isn't an error, exit the loop
		do {
			try {
				// Ask the user for a increase
				System.out.println("Introduce a increase: ");
				increase = reader.nextInt();
				error = false;
			} catch (Exception e) {
				// Show an error mesage
				System.err.println("Introduce a correct value");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Create a do-while if there isn't an error, exit the loop
		do {
			try {
				// Ask the user for a lenght
				System.out.println("Introduce a lenght: ");
				lenght = reader.nextInt();
				error = false;
			} catch (Exception e) {
				// Show an error mesage
				System.err.println("Introduce a correct value");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		table = new int[lenght];

		for (int i = 0; i < table.length; i++) {
			table[i] = value;
			value += increase;
		}

		System.out.println(Arrays.toString(table));

		reader.close();
	}
}
