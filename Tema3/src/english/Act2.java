package english;

import java.util.Scanner;

public class Act2 {

	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		// variable to store the user's phrase
		String phrase;
		// variable to store the modified phrase
		String finalPhrase = "";
		// variable to store each character
		char letter;
		// variable to store the amount to increment
		int increase;

		// we ask the user for a phrase
		System.out.println("Introduce a phrase: ");

		// we store the answer in the variable
		phrase = reader.nextLine().toUpperCase();

		// we ask the user for the number to increment
		System.out.println("Introduce the increase: ");

		// we store the number in the variable
		increase = reader.nextInt();

		// we create a loop to separate each character from the string and modify it
		for (int i = 0; i < phrase.length(); i++) {
			// the variable will store what it is in the position i
			letter = phrase.charAt(i);
			if (letter >= 'A' && letter <= 'Z') {
			for (int a = 0; a < increase; a++) {
				letter++;
				if (letter >= 'Z') {
					letter = 'A';
				}
			}
			} else if (letter >= '0' && letter <= '9') {
				letter++;
				if (letter >= '9') {
					letter = '0';
				}
			}

			// we store each character in the variable one by one
			finalPhrase += letter;
		}

		// we show the final phrase
		System.out.println(finalPhrase);

		// we close the scanner
		reader.close();
	}
}
