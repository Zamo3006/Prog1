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
		
		System.out.println("Preis für Pizza1 eingeben.");
		preis1 = scanner.nextDouble();
		System.out.println("Druchmesser für Pizza1 eingeben.");
		durchmesser1 = scanner.nextDouble();
		System.out.println("Preis für Pizza2 eingeben.");
		preis2 = scanner.nextDouble();
		System.out.println("Druchmesser für Pizza2 eingeben.");
		durchmesser2 = scanner.nextDouble();

		double flaeche1 = (pi * Math.pow(durchmesser1, 2)) / 4.0;
		double flaeche2 = (pi * Math.pow(durchmesser2, 2)) / 4.0;
		double verhaeltnis1 = flaeche1 / preis1;
		double verhaeltnis2 = flaeche2 / preis2;

		if (verhaeltnis1 == verhaeltnis2) {
			System.out.println("Gleiches Größen-/Preisverhältnis");
		}
		if (verhaeltnis1 > verhaeltnis2) {
			System.out.println("Besseres Größen-/Preisverhältnis für Pizza1");
		}
		if (verhaeltnis2 > verhaeltnis1) {
			System.out.println("Besseres Größen-/Preisverhältnis für Pizza2");
		}

		scanner.close();
	}
}
