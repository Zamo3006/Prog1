package exercise03;

import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {
		
		System.out.println("Zahl eingeben:");
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();

		if (test % 7 == 0) {
			System.out.println("Eingegebene Zahl ist durch 7 teilbar.");
		} else {
			System.out.println("Eingegebene Zahl ist nicht durch 7 teilbar.");
		}
		scanner.close();
	}
}
