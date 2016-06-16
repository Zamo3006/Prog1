package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe4 {

	// TODO: add words
	private static String[] words = { "PROGRAMMIERSPRACHE", "FACHHOCHSCHULE", "WUERZBURG" };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = selectWord();
		boolean success = playGame(s, word);
		if (success) {
			System.out.println("Hurra, Wort erraten: " + word);
		} else {
			System.out.println("Oh leider verloren, richtiges Wort: " + word);
		}
		s.close();
	}

	private static String selectWord() {
		String word = words[(int) (Math.random() * words.length)];
		return word;
	}

	private static boolean playGame(Scanner s, String word) {

		char[] wordArray = word.toCharArray();
		char[] scoreArray = new char[wordArray.length];
		Arrays.fill(scoreArray, '_');
		boolean endOfGame = false;
		int turnCounter = 1;

		while (!endOfGame) {
			endOfGame = takeTurn(s, turnCounter, scoreArray, wordArray);
			turnCounter++;
		}
		return (String.valueOf(wordArray).equals(String.valueOf(scoreArray)));
	}

	private static boolean takeTurn(Scanner s, int turnCounter, char[] scoreArray, char[] wordArray) {
		boolean endOfGame = false;
		System.out.println(turnCounter + ". Versuch: " + String.valueOf(scoreArray));
		char guess = s.nextLine().charAt(0);
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i] == Character.toUpperCase(guess)) {
				scoreArray[i] = Character.toUpperCase(guess);
			}
		}
		if (String.valueOf(wordArray).equals(String.valueOf(scoreArray)) || turnCounter > 14) {
			endOfGame = true;
		}
		return endOfGame;
	}

}
