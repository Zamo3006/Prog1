package exercise06;

public class Aufgabe2 {
	public static void main(String[] args) {
		double number = 3.455;
		System.out.println(new Aufgabe2().round(number, 2));
	}

	public double round(double number) {
		number = (int) (number + 0.5);
		return number;

	}

	public double round(double number, int decimals) {
		double multiplictor = Math.pow(10, decimals);
		number *= multiplictor;
		number = (double) (int) (number + 0.5);
		number /= multiplictor;
		return number;
	}
}
