package english;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		// Variables declaration
		// Variable that stores a random number
		int randomNum;
		// Variable that indicates if there are errors
		boolean error = false;
		// Variable that stores the place of the fly by user
		int place = 0;

		// Create a table with length 10
		int table[] = new int[10];

		// Create the Random
		Random rand = new Random();
		// Create the Scanner
		Scanner reader = new Scanner(System.in);

		// Generate a random number
		randomNum = rand.nextInt(0, 10);
		// Put a 1 in this random position
		table[randomNum] = 1;

		// Create a do-while that exits the loop when there are not errors
		do {
			try {
				// Ask to user for the place's fly
				System.out.println("Where is the fly? ");
				place = reader.nextInt();
				assert (place >= 0 && place < 10);
				error = false;
			} catch (Exception e) {
				// Print an error message
				System.err.println("Introduce a correct value");
				error = true;
			} catch (AssertionError e) {
				// Print the range of correct values
				System.out.println("The value can be 0-" + table.length);
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Create a while that exits of loop when the user catches the fly
		while (table[randomNum] != table[place]) {
			// Create an if-else when the fly is near and isn't it.
			if (place == randomNum - 1 || place == randomNum + 1) {
				System.out.println("The fly has flown to other place");
				randomNum = rand.nextInt(0, 10);
			} else {
				System.out.println("The fly is in the same place");
			}
			// Store in the table all elements to 0
			Arrays.fill(table, 0);
			// The value of position of the fly is 1
			table[randomNum] = 1;

			// Create a do-while that ask to user again
			do {
				try {
					System.out.println("Where is the fly? ");
					place = reader.nextInt();
					assert (place >= 0 && place < 10);
					error = false;
				} catch (Exception e) {
					System.err.println("Introduce a correct value");
					error = true;
				} catch (AssertionError e) {
					System.out.println("The value can be 0-" + table.length);
				} finally {
					reader.nextLine();
				}
			} while (error);
		}

		// Print the end of the program
		System.out.println("You have catched the fly");

		// Close the Scanner
		reader.close();
	}
}
