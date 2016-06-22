package exercise09;

public class Aufgabe4 {
	public static void main(String[] args) {
		double result = Double.valueOf(args[0]);
		if (args[args.length-1].equals("+")) {
			for (int i = 1; i < args.length - 1; i++) {
				result += Double.valueOf(args[i]);
			}
		}
		if (args[args.length - 1].equals("-")) {
			for (int i = 1; i < args.length - 1; i++) {
				result -= Double.valueOf(args[i]);
			}
		}
		System.out.println(result);
	}
}
