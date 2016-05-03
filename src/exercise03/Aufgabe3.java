package exercise03;

import java.util.Scanner;

public class Aufgabe3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char x;

		System.out.println("Zeichen eingeben:");
		x = scanner.next().charAt(0);
		int decX = (int) x;

		// Großbuchstabe
		if (decX >= 'A' && decX <= 'Z') {
			System.out.println("Großbuchstabe");
			// < G
			if (decX < 'G')
				System.out.println("und Hexadezimale Ziffer");
		} 
		
		// Kleinbuchstabe a-f
		else if (decX >= 'a' && decX <= 'f') {
			System.out.println("Hexadezimale Ziffer");
		} 
		
		// 0-9
		else if (decX >= '0' && decX <= '9') {
			System.out.println("Hexadezimale Ziffer");

			// < 8
			if (decX < '8') {
				System.out.println("und Oktale Ziffer");
				
				// < 2
				if (decX < '2') {
					System.out.println("und Binäre Ziffer");
				}
				
			}
			
		} else {
			System.out.println("Unbekannt");
		}

		scanner.close();
	}
}
