package exercise06;

import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int amountOfRectangles;

		System.out.println("Anzahl der Rechtecke eingeben:");
		amountOfRectangles = s.nextInt();

		double pi = piApproximation(amountOfRectangles);

		System.out.println("Genäherter Wert für pi mit " + amountOfRectangles + " Rechtecken: " + pi);

		s.close();
	}

	/**
	 *  pi = (4/Amount of Rectangles) * (Sum of Heights)
	 *  heights = SquareRoot(1 - (i/(Amount of Rectangles))^2)
	 * @param amountOfRectangles 
	 * @return piApproximation
	*/
	public static double piApproximation(int amountOfRectangles) {
		double piApproximation = 0.0;
		double amountSquared = Math.pow(amountOfRectangles, 2);
		for (int i = 0; i < amountOfRectangles; i++) {
			double iteratorSquared = Math.pow(i, 2);
			double height = Math.sqrt((1 - iteratorSquared / amountSquared));
			piApproximation += height;
		}
		piApproximation *= (4.0 / amountOfRectangles);
		return piApproximation;
	}

}
