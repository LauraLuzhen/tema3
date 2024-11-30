package english;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		// Variable declaration
		// Variable that stores initial value
		int value = 0;
		// Variable that stores increase
		int increase = 0;
		// Variable that stores the length of table
		int length = 0;
		// Variable that indicates when there are errors or not
		boolean error = false;
		
		// Create a table
		int table[];
		// Create a table with values
		String values[] = {"initial value", "increase"};
		
		// Create the Scanner
		Scanner reader = new Scanner (System.in);
		
		// Create a do-while that exits when there are not errors
		do {
			try {
				// Ask to user the length of table
				System.out.println("Introduce the length of table: ");
				length = reader.nextInt();
				assert (length > 0);
			} catch (Exception e) {
				// Print an error message
				System.err.println("Introduce a correct value");
				error = true;
			} catch (AssertionError e) {
				// Print rage of correct values
				System.err.println("The length of table is grater than 0");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);
		
		// Introduce the length in table
		table = new int[length];
		
		// Create a for with two iterations, one for initial value and the other one for increase
		for (int i = 0; i < values.length; i++) {
			// Create a do-while that exits the loop when there are not errors
			do {
				try {
					// Ask for a value and increase to the user
					System.out.println("Introduce the " + values[i] + ": ");
					if (i == 0) {
						value = reader.nextInt();
					} else {
						increase = reader.nextInt();
					}
					error = false;
				} catch (Exception e) {
					// Print an error message
					System.err.println("Introduce a correct value");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}
		
		// The first position of the table is initial value
		table[0] = value;
		
		// Create a for to store the value and increase
		for (int i = 1; i < table.length; i++) {
			table[i] += table[i-1] + increase;
		}
		
		// Print the table
		System.out.println(Arrays.toString(table));
		
		// Close the Scanner
		reader.close();
	}
}
