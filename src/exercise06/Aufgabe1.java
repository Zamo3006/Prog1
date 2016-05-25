package exercise06;

import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int amountOfRectangles;
		
		System.out.println("Anzahl der Rechtecke eingeben:");
		amountOfRectangles = s.nextInt();
		
		double pi = new Aufgabe1().piApproximation(amountOfRectangles);
		System.out.println(pi);
		
		s.close();
	}

	public double calculateHeight(double base) {
		double height = Math.sqrt(1 - Math.pow(base, 2));
		return height;
	}

	public double calculateArea(double length, double height) {
		double area = length * height;
		return area;
	}

	public double piApproximation(int amountOfRectangles) {
		double piApproximation = 0.0;
		for (int i = 0; i < amountOfRectangles; i++) {
			double length = 1.0 / amountOfRectangles;
			double height = calculateHeight(length * i);
			piApproximation += calculateArea(length, height);
		}
		piApproximation *= 4;
		return piApproximation;
	}

}
