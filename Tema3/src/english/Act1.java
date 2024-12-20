package english;

import java.util.Scanner;

public class Act1 {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// variable to store the user's phrase
		String phrase;
		// variable to store the modified phrase
		String finalPhrase = "";
		// variable to store each character
		char letter;

		// we ask the user for a phrase
		System.out.println("Introduce a phrase: ");

		// we store the answer in the variable
		phrase = reader.nextLine().toUpperCase();

		// we create a loop to separate each character from the string and modify it
		for (int i = 0; i < phrase.length(); i++) {
			// the variable will store what it is in the position i
			letter = phrase.charAt(i);

			// if the character is Z then it will turn into an a
			if (letter == 'Z') {
				letter = 'A';
				// if the character is a 9 it will turn into a 0
			} else if (letter == '9') {
				letter = '0';
				// if the character is between a and w and between 0 and 8 it increments the
				// variable
			} else if ((letter >= 'A' && letter < 'Z') || (letter >= 0 && letter < 9)) {
				letter++;
			} // if not it doesnt do anything

			// we store each character in the variable one by one
			finalPhrase += letter;
		}

		// we show the final phrase
		System.out.println(finalPhrase);

		// we close the scanner
		reader.close();
	}
}
