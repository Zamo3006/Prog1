package exercise06;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int number;

		System.out.println("Zahl eingeben:");
		number = s.nextInt();

		long factorial = factorial(number);

		System.out.println(factorial);

		s.close();
	}

	public static long factorial(int number) {
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
