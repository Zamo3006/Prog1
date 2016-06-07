package exercise06;

public class Aufgabe4 {
	public static void main(String[] args) {
		printTriangle(20);
	}
	
	public static void printTriangle(int rows) {
		String stars = "*";
		for (int i = 0; i < rows; i++) {
			String ausgabe = String.format("%1$"+(rows+i)+"s",stars);
			System.out.println(ausgabe);
			stars += " *";
		}
	}
}
