package exercise05;

import java.util.Scanner;

public class Querprodukt {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean gueltig = false;
		int eingabe;
		int iterator;
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
		
		iterator = eingabe;
		
		do {
			querprodukt *= iterator % 10;
			iterator = iterator / 10;
		} while (iterator > 0);
		
		System.out.println("Das Querprodukt von " + eingabe + " beträgt " + querprodukt);
		
		s.close();
	}
}
