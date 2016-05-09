package exercise04;

import java.util.Scanner;

public class Aufgabe4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int zahl;
		boolean prim = true;
		
		System.out.println("Bitte zu untersuchende Zahl eingeben:");
		zahl = s.nextInt();
		
		for (int i = 2; i < zahl; i++) {
			if (zahl % i == 0) {
				prim = false;
				System.out.println("Untersuchte Zahl ist keine Primzahl!");
				break;
			}
		}
		
		if (prim) {
			System.out.println("Untersuche Zahl ist eine Primzahl!");
		}
		
		s.close();
	}
}
