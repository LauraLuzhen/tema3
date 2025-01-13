package english;

import java.util.Scanner;

public class Act3 {

	static Scanner reader = new Scanner (System.in)
;	
	public static void main(String[] args) {
		
		int timeUser = 0;
		String answer;
		char letter;
		String solutionUser = "";
		
		final int times = 3;
		
		String[] words = {"PYTHON", "JAVA", "JAVASCRIPT", "HTML"};
		
		do {
			System.out.println("Introduce a letter: ");
			answer = reader.nextLine().toUpperCase();
			letter = answer.charAt(0);
			
			change(solution, word, letter);
			
			solutionUser = view(solution);
			System.out.println(solutionUser);
			
			timeUser++;
		} while (!word.equals(solution) && timeUser < times);
		
		System.out.println("end");
		
		reader.close();
	}
	
	static void change (char[] sol, char[] word, char answer) {
		
		for (int i = 0; i < word.length; i++) {
			if (word[i] == answer) {
				sol[i] = word[i];
			}
		}
	}
	
	static String view (char[] solution) {
		
		String sol = "";
		for (int i = 0; i < solution.length; i++) {
			sol += solution[i];
		}
		
		return sol;
	}
}
