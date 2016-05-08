package exercise04;

public class Aufgabe2 {

	public static void main(String[] args) {

		double reihe = 0;
		double k = 1;
		double reihenaenderung = 0;

		do {
			reihenaenderung = 6 * (1.0 / Math.pow(k, 2));
			reihe = reihe + reihenaenderung;
			k++;
			System.out.println("Wert der Reihe: " + reihe);
			System.out.println("Änderung der Reihe: " + reihenaenderung);
		} while (reihenaenderung > (1.0E-5));

		System.out.println("Abbruch nach " + (k - 1) + " Iterrationen");
	}
}
