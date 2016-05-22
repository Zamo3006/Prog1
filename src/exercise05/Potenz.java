package exercise05;

import java.util.Scanner;

public class Potenz {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double a;
		int b;
		double ergebnis = 1.0;

		boolean alternativ = true;

		System.out.println("Basis eingeben:");
		a = s.nextDouble();
		System.out.println("Exponent eingeben:");
		b = s.nextInt();

		a = (b < 0) ? (1.0 / a) : a;
		b = (b < 0) ? (b * -1) : b;

		if (alternativ) {

			// long startTime = System.nanoTime();

			for (int i = 0; i < b; i++) {
				ergebnis *= a;
			}
			System.out.println("Das Ergebnis ist: " + ergebnis);

			// long endTime = System.nanoTime();
			// long duration = (endTime - startTime);
			// System.out.println("zeit:" + duration);

		}

		if (!alternativ) {

			// ergebnis = 1.0;
			// System.out.println("alternativ");
			// startTime = System.nanoTime();

			while (b > 0) {
				if (b % 2 != 0) {
					ergebnis *= a;
				}
				b = b / 2;
				a *= a;
			}
			System.out.println(ergebnis);

			// endTime = System.nanoTime();
			// duration = (endTime - startTime);
			// System.out.println("zeit:"+duration);

		}
		s.close();
	}
}
