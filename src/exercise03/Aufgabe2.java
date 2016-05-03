package exercise03;

import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		final double pi = Math.PI;
		double durchmesser1;
		double durchmesser2;
		double preis1;
		double preis2;
		
		System.out.println("Preis f�r Pizza1 eingeben.");
		preis1 = scanner.nextDouble();
		System.out.println("Druchmesser f�r Pizza1 eingeben.");
		durchmesser1 = scanner.nextDouble();
		System.out.println("Preis f�r Pizza2 eingeben.");
		preis2 = scanner.nextDouble();
		System.out.println("Druchmesser f�r Pizza2 eingeben.");
		durchmesser2 = scanner.nextDouble();

		double flaeche1 = (pi * Math.pow(durchmesser1, 2)) / 4.0;
		double flaeche2 = (pi * Math.pow(durchmesser2, 2)) / 4.0;
		double verhaeltnis1 = flaeche1 / preis1;
		double verhaeltnis2 = flaeche2 / preis2;

		if (verhaeltnis1 == verhaeltnis2) {
			System.out.println("Gleiches Gr��en-/Preisverh�ltnis");
		}
		if (verhaeltnis1 > verhaeltnis2) {
			System.out.println("Besseres Gr��en-/Preisverh�ltnis f�r Pizza1");
		}
		if (verhaeltnis2 > verhaeltnis1) {
			System.out.println("Besseres Gr��en-/Preisverh�ltnis f�r Pizza2");
		}

		scanner.close();
	}
}
