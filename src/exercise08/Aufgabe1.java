package exercise08;

public class Aufgabe1 {
	public static void main(String[] args) {
		int[] lottozahlen = new int[6];
		for (int i = 0; i < 6; i++) {
			lottozahlen[i] = Lottozahl(lottozahlen);
		}
		sort(lottozahlen);
		for (int zahl : lottozahlen) {
			System.out.println(zahl);
		}
	}

	public static int Lottozahl(int[] used) {
		int gezogeneZahl = Lottozahl();
		for (int zahl : used) {
			if (zahl == gezogeneZahl) {
				gezogeneZahl = Lottozahl(used);
				break;
			}
		}
		return gezogeneZahl;
	}

	public static int Lottozahl() {
		int lottozahl = (int) (Math.random() * 49) + 1;
		return lottozahl;
	}

	public static void sort(int[] zahlen) {
		for (int i = 0; i < zahlen.length - 1; i++) {
			int min = zahlen[i];
			int indexOfMin = i;
			for (int j = i + 1; j < zahlen.length; j++) {
				if (zahlen[j] < min) {
					min = zahlen[j];
					indexOfMin = j;
				}
			}
			zahlen[indexOfMin] = zahlen[i];
			zahlen[i] = min;
		}
	}

}
