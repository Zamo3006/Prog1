package exercise07;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double basis;
		int exponent;
		double power;

		System.out.println("Basis eingeben:");
		basis = s.nextDouble();
		System.out.println("Exponent eingeben:");
		exponent = s.nextInt();
		
		power = power(basis, exponent);
		System.out.println(power);

		//Testzeugs
		long startTime = System.nanoTime();
		power = power(basis, exponent);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("zeit:" + duration);
		System.out.println(power);

		startTime = System.nanoTime();
		power = power2(basis, exponent);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("zeit:" + duration);
		System.out.println(power);
		

		s.close();
	}

	public static double power(double basis, int exponent) {
		if (exponent == 0) {
			return 1;
		} else if (exponent > 0) {
			return basis * power(basis, exponent - 1);
		} else {
			return (1.0 / basis) * power(basis, exponent + 1);
		}
	}

	// x^n = (x^2)^(n/2) for n % 2 == 0
	// x^n = x*((x^2)^(n/2)) for n % 2 != 0
	// runTime: O(log(exponent)) versus O(exponent)
	public static double power2(double basis, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			if (exponent < 0) {
				basis = 1.0 / basis;
				exponent = exponent * -1;
			}
			double interimResult = power2(basis * basis, exponent / 2);
			if (exponent % 2 != 0) {
				interimResult *= basis;
			}
			return interimResult;
		}
	}
}
