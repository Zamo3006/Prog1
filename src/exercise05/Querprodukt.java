package exercise05;

import java.util.Scanner;

public class Querprodukt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean gueltig = false;
		int eingabe;
		int eingabe2;
		int querprodukt = 1;
		
		do {
			System.out.println("Zahl eingeben:");
			eingabe = s.nextInt();
			if (eingabe >= 0 && eingabe <= 1.0E6) {
				gueltig = true;
			} else {
				System.out.println("FEHLER - Zahl ist ungültig.");
			}
		} while (!gueltig);
		
		eingabe2 = eingabe;
		
		do {
			querprodukt *= eingabe % 10;
			eingabe = eingabe / 10;
		} while (eingabe > 0);
		
		System.out.println("Das Querprodukt von " + eingabe2 + " beträgt " + querprodukt);
		
		s.close();
	}
}
