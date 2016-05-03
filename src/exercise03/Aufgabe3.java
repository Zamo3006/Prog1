package exercise03;

import java.util.Scanner;

public class Aufgabe3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char x;

		System.out.println("Zeichen eingeben:");
		x = scanner.next().charAt(0);
		
		// Gro�buchstabe
		if (x >= 'A' && x <= 'Z') {
			System.out.println("Gro�buchstabe");
			// < G
			if (x < 'G')
				System.out.println("und Hexadezimale Ziffer");
		} 
		
		// Kleinbuchstabe a-f
		else if (x >= 'a' && x <= 'f') {
			System.out.println("Hexadezimale Ziffer");
		} 
		
		// 0-9
		else if (x >= '0' && x <= '9') {
			System.out.println("Hexadezimale Ziffer");

			// < 8
			if (x < '8') {
				System.out.println("und Oktale Ziffer");
				
				// < 2
				if (x < '2') {
					System.out.println("und Bin�re Ziffer");
				}
				
			}
			
		} else {
			System.out.println("Unbekannt");
		}

		scanner.close();
	}
}
