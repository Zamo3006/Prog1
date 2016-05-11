package exercise04;

import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zeit eingeben:");
		int zeit = scanner.nextInt();
		final double G = 9.80665;
		boolean a = false;

		// a)
		if (a) {
			for (int i = 1; i <= zeit; i++) {
				double strecke = 1.0 / 2.0 * G * Math.pow(i, 2);
				System.out.println("Zeit: " + i + " Sekunden: Zurückgelegte Strecke: " + strecke + " m");
			}
		}
		// b)
		if (!a) {
			for (int i = 1; i <= zeit; i += 5) {
				double strecke = 1.0 / 2.0 * G * Math.pow(i, 2);
				System.out.println("Zeit: " + i + " Sekunden: Zurückgelegte Strecke: " + strecke + " m");
			}
			double strecke = 1.0 / 2.0 * G * Math.pow(zeit, 2);
			System.out.println("Zeit: " + zeit + " Sekunden: Zurückgelegte Strecke: " + strecke + " m");

		}
		scanner.close();
	}
}
