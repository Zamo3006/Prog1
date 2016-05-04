package exercise04;

public class Aufgabe2 {
public static void main(String[] args) {
	double schleife=0;
	double k = 1;
	double schleifenaenderung = 0;
	do {
		schleifenaenderung = (1.0/Math.pow(k, 2));
		schleife = schleife+schleifenaenderung;
		k++;
		System.out.println(6.0*schleife);
	} while (schleifenaenderung > (1.0E-5));
	System.out.println("Abbruch nach "+(k-1)+" Iterrationen");
}
}
