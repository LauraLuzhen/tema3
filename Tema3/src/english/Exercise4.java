package english;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		// Variables declaration
		// Variable that stores the position
		int position = 0;
		// Variable that stores a random number
		int randomNum;
		// Variable that stores the mines near of position
		int numMines;
		// Variable that indicates if there are errors or not
		boolean error = false;

		// Create a table with length 20
		String table[] = new String[20];

		// Create the Random
		Random rand = new Random();
		// Create the Scanner
		Scanner reader = new Scanner(System.in);

		// Create a for that stores 6 times a mine
		for (int i = 0; i < 6; i++) {
			// Generate a random number
			randomNum = rand.nextInt(0, 20);
			// Create an if-else that if the position stores a * this iteration is not valid
			if (table[randomNum] == "*") {
				i--;
			} else {
				table[randomNum] = "*";
			}
		}

		// Create a for to the clues
		for (int i = 0; i < table.length; i++) {
			// The clue starts with 0
			numMines = 0;
			// Create an if when there are not mines
			if (table[i] != "*") {
				// Crate an if for the first and last position
				if (i == 0 || i == table.length - 1) {
					// Increase the number of mines if there are mines
					if (table[1] == "*") {
						numMines++;
					}
					if (table[table.length - 2] == "*") {
						numMines++;
					}
				} else {
					// Increase the number of mines if there are mines
					if (table[i - 1] == "*") {
						numMines++;
					}
					if (table[i + 1] == "*") {
						numMines++;
					}
				}
				// Put the clue in table
				table[i] = String.valueOf(numMines);
			}
		}

		// Create a do-while that exits the loop when there are not errors
		do {
			try {
				// Ask to user a position
				System.out.println("Introduce a position: ");
				position = reader.nextInt();
				assert (position >= 0 && position < table.length);
				error = false;
			} catch (Exception e) {
				// Print an error message
				System.err.println("Introduce a correct value");
				error = true;
			} catch (AssertionError e) {
				// Print the range of correct values
				System.err.println("The position is 0-" + (table.length - 1));
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Create a while that prints the clue
		while (table[position] != "*") {
			// Print the clue
			System.out.println("Clue: " + table[position]);

			// Create a do-while that asks to user again
			do {
				try {
					System.out.println("Introduce a position: ");
					position = reader.nextInt();
					assert (position >= 0 && position < table.length);
					error = false;
				} catch (Exception e) {
					System.err.println("Introduce a correct value");
					error = true;
				} catch (AssertionError e) {
					System.err.println("The position is 0-" + table.length);
					error = true;
				} finally {
					reader.nextLine();
				}
			} while (error);
		}

		// Print when the user finds a mine
		System.out.println("It is a mine!!");

		// Close the Scanner
		reader.close();
	}
}
