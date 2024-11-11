package english;

import java.util.Arrays;
// Import the Scanner
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		// Variable declaration
		// Variable that stores the letter of user
		String letterUser = null;
		// Variable that stores the value of user
		int value = 0;
		// Variable that stores the position of user
		int position = 0;
		// Variable that indicates an error
		boolean error = false;

		// Create an array of lenght 10
		int table[] = new int[10];

		// Create the Scanner
		Scanner reader = new Scanner(System.in);

		// Create a do-while and if there isn't error, exit the loop
		do {
			try {
				// Ask the user for a letter
				System.out.println("Introduce a letter: \na. Show values\nb. Introduce a value\nc. Exit");
				letterUser = reader.next();
				assert (letterUser.equalsIgnoreCase("a") || letterUser.equalsIgnoreCase("b")
						|| letterUser.equalsIgnoreCase("c"));
				error = false;
			} catch (Exception e) {
				// Show an error mesage
				System.err.println("Introduce a correct value");
				error = true;
			} catch (AssertionError e) {
				// Show the correct values
				System.err.println("Introduce 'a', 'b' or 'c'");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error == true);

		// Create a while that if answer is equal to c, exit the loop
		while (!letterUser.equalsIgnoreCase("c")) {
			// Create a switch with letterUser
			switch (letterUser) {
			case "a", "A" -> {
				// Print all the table
				System.out.println(Arrays.toString(table));
			}
			case "b", "B" -> {
				// Create a do-while and if there isn't an error, exit the loop
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

				// Create a do-while and if there isn't an error, exit the loop
				do {
					try {
						// Ask the user for a position
						System.out.println("Introduce a position: ");
						position = reader.nextInt();
						// Position has a range of correct values
						assert (position >= 0 && position < 10);
						error = false;
					} catch (Exception e) {
						// Show an error mesage
						System.err.println("Introduce a correct value");
						error = true;
					} catch (AssertionError e) {
						// Show the range of correct values
						System.err.println("Introduce a value (0-9)");
						error = true;
					} finally {
						reader.nextLine();
					}
				} while (error == true);

				// Give value to the position
				table[position] = value;
			}
			}
			// Create a do-while and if there isn't an error, exit the loop
			do {
				try {
					// Ask the user for a letter
					System.out.println("Introduce a letter: \na. Show values\nb. Introduce a value\nc. Exit");
					letterUser = reader.next();
					assert (letterUser.equalsIgnoreCase("a") || letterUser.equalsIgnoreCase("b")
							|| letterUser.equalsIgnoreCase("c"));
					error = false;
				} catch (Exception e) {
					// Show an error mesage
					System.err.println("Introduce a correct value");
					error = true;
				} catch (AssertionError e) {
					// Show the correct values
					System.err.println("Introduce 'a', 'b' or 'c'");
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error == true);
		}

		// Print the end of the program
		System.out.println("End of the program");

		// Close the Scanner
		reader.close();
	}
}
