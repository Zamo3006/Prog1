package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe4 {

	private static String[] words = { "PROGRAMMIERSPRACHE" };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean end = false;
		// todo select
		char guess;
		String word = words[0];
		char[] wordArray = word.toCharArray();
		char[] scoreArray = new char[wordArray.length];
		Arrays.fill(scoreArray, '_');
		int tryCounter = 1;
		while (!end) {
			System.out.println(tryCounter + ". Versuch: " + String.valueOf(scoreArray));
			guess = s.nextLine().charAt(0);
			for (int i = 0; i < wordArray.length; i++) {
				if (wordArray[i] == Character.toUpperCase(guess)) {
					scoreArray[i] = Character.toUpperCase(guess);
				}
			}
			tryCounter++;
			if (String.valueOf(wordArray).equals(String.valueOf(scoreArray))) {
				end = true;
				System.out.println("Richtige Lösung: " + String.valueOf(scoreArray));
			} else if (tryCounter > 15) {
				end = true;
				System.out.println("Maximale Versuche überschritten, richgtie Lösung: " + String.valueOf(scoreArray));
			}
		}
		s.close();
	}
}
