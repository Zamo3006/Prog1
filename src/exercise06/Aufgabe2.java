package exercise06;

public class Aufgabe2 {
	public static void main(String[] args) {
		double number = -0.5454;
		System.out.println(round(number,2));
	}

	public static double round(double number) {
		number = (number > 0) ? (int) (number + 0.5) : (int) (number - 0.5);
		return number;
	}

	public static double round(double number, int decimals) {
		double multiplictor = Math.pow(10, decimals);
		number *= multiplictor;
		number = (number > 0) ? (double) (int) (number + 0.5) : (double) (int) (number - 0.5);
		number /= multiplictor;
		return number;
	}
}
