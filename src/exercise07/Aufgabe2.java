package exercise07;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double x;
		double sinus;

		System.out.println("X eingeben:");
		x = s.nextDouble();

		sinus = sinus(x);

		System.out.println(sinus);
		
		s.close();
	}
/*
 * Versus Cosinus:
 * Initialize zaehler as x
 * Initialize summe as x
 * start loop at 3
 */
	public static double sinus(double x) {
		double zaehler = x;
		double nenner = 1.0;
		double summe = x;
		double summand = 1.0;
		for (int i = 3; summand > 1E-15 || summand < -1E-15; i = i + 2) {
			zaehler = zaehler * x * x * (-1);
			nenner = nenner * i * (i - 1);
			summand = zaehler / nenner;
			summe = summe + summand;
		}
		return summe;
	}

}
