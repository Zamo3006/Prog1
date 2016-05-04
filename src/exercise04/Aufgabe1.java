package exercise04;

import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zeit eingeben:");
		int zeit = scanner.nextInt();
		double g = 9.80665;
		boolean a = true;
		if (a) {
			for (int i = 1; i <= zeit; i++) {
				double strecke = 1.0 / 2.0 * g * Math.pow(i, 2);
				System.out.println("Zeit: " + i + " Sekunden: Zurückgelegte Strecke: " + strecke + "m");
			}
		}
		if (!a) {
			int i = 1;
			while (i <= zeit) {
				double strecke = 1.0 / 2.0 * g * Math.pow(i, 2);
				System.out.println("Zeit: " + i + " Sekunden: Zurückgelegte Strecke: " + strecke + "m");
				i += 5;
			}
			double strecke = 1.0 / 2.0 * g * Math.pow(zeit, 2);
			System.out.println("Zeit: " + zeit + " Sekunden: Zurückgelegte Strecke: " + strecke + "m");

		}
		scanner.close();
	}
}
