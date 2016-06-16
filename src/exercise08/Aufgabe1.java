package exercise08;

import java.util.Random;

public class Aufgabe1 {

	public static void main(String[] args) {

		int[] lottozahlen = randomZahlen(6, 1, 49);

		int[] lottozahlen2 = new int[6];
		for (int i = 0; i < lottozahlen2.length; i++) {
			lottozahlen2[i] = Lottozahl(lottozahlen2);
		}

		sort(lottozahlen);
		for (int zahl : lottozahlen) {
			System.out.println(zahl);
		}
	}

	// easy Java 8 solution
	public static int[] Lottozahlen(int length) {
		int[] lottozahlen = new Random().ints(1, 50).distinct().limit(length).toArray();
		return lottozahlen;
	}

	public static int[] randomZahlen(int length, int min, int max) {
		int[] numbers = new int[max - min + 1];
		int[] random = new int[length];
		int numbersLength = numbers.length - 1;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = min + i;
		}
		
		for (int i = 0; i < random.length; i++) {
			int index = randomZahl(numbersLength);
			random[i] = numbers[index];
			numbers[index] = numbers[numbersLength];
			numbersLength--;
		}
		return random;
	}

	public static int Lottozahl(int[] used) {
		int gezogeneZahl = randomZahl(49) + 1;
		for (int zahl : used) {
			if (zahl == gezogeneZahl) {
				gezogeneZahl = Lottozahl(used);
				break;
			}
		}
		return gezogeneZahl;
	}

	public static int randomZahl(int n) {
		int lottozahl = (int) (Math.random() * n);
		return lottozahl;
	}

	public static void sort(int[] zahlen) {
		for (int i = 0; i < zahlen.length - 1; i++) {
			int min = zahlen[i];
			int indexOfMin = i;
			for (int j = i + 1; j < zahlen.length; j++) {
				if (zahlen[j] < min) {
					min = zahlen[j];
					indexOfMin = j;
				}
			}
			if (indexOfMin != i) {
				zahlen[indexOfMin] = zahlen[i];
				zahlen[i] = min;
			}
		}
	}

}
