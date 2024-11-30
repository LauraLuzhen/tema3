package english;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		// Variables declaration
		// Variable that has a value
		int value = 0;
		// Variable that indicates a position
		int position = 0;
		// Variable that indicates if there are errors or not
		boolean error = false;
		// Variable that stores the option's user
		String option = null;
		
		// Create a table with length 10
		int table[] = new int[10];
		// Create a table with "value" and "position"
		String values[] = {"value", "position"};
		
		// Create the Scanner
		Scanner reader = new Scanner (System.in);
		
		// Create a do-while that exits of the loop when there are not errors
		do {
			// Print the menu with its options
			System.out.println("MENU:\na) Show values\nb) Introduce a value\nc) Exit");
			try {
				option = reader.next();
				assert (option.equalsIgnoreCase("a") || option.equalsIgnoreCase("b") || option.equalsIgnoreCase("c"));
				error = false;
			}  catch (Exception e) {
				// Print a error message
				System.err.println("Introduce a correct value");
				error = true;
			} catch (AssertionError e) {
				// Print the range of correct values
				System.err.println("Introduce 'a', 'b' or 'c'");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);
		
		// Create a while that exits of the loop when the value is c
		while (!option.equalsIgnoreCase("c")) {
			// Create a switch for if the option is a or b
			switch (option) {
			case "a", "A"->{
				// Print all elemnts of the table
				System.out.println(Arrays.toString(table));
			}
			case "b", "B"->{
				// Create a for with two iterations
				for (int i = 0; i < values.length; i++) {
					// Create a do-while that exits when there are not errors
					do {
						try {
							// Ask to user the value and the position
							System.out.println("Introduce a " + values[i] + ": ");
							if (i == 0) {
								value = reader.nextInt();
							} else {
								position = reader.nextInt();
								assert (position < table.length && position >= 0);
							}
							error = false;
						} catch (Exception e) {
							// Print an error message
							System.err.println("Introduce a correct value");
							error = true;
						} catch (AssertionError e) {
							// Print the range of correct values
							System.out.println("The position must be 0-" + table.toString());
							error = true;
						} finally {
							reader.nextLine();
						}
					} while (error);
				}
				// Introduce the value in the position
				table[position] = value;
			}
			}
			
			// Create a do-while that exits of the loop when there are not errors
			do {
				// Print the menu with its options
				System.out.println("MENU:\na) Show values\nb) Introduce a value\nc) Exit");
				try {
					option = reader.next();
					assert (option.equalsIgnoreCase("a") || option.equalsIgnoreCase("b") || option.equalsIgnoreCase("c"));
					error = false;
				}  catch (Exception e) {
					// Print a error message
					System.err.println("Introduce a correct value");
					error = true;
				} catch (AssertionError e) {
					// Print the range of correct values
					System.err.println("Introduce 'a', 'b' or 'c'");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}
		
		System.out.println("End of the program");
		
		// Close the Scanner
		reader.close();
	}
}
