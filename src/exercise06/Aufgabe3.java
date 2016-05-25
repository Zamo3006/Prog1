package exercise06;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int number;

		System.out.println("Zahl eingeben:");
		number = s.nextInt();

		int faculty = faculty(number);

		System.out.println(faculty);

		s.close();
	}

	public static int faculty(int number) {
		int faculty = 1;
		for (int i = 1; i <= number; i++) {
			faculty *= i;
		}
		return faculty;
	}
}
