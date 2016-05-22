package exercise05;

import java.util.Scanner;

public class Potenz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a;
		int b;
		double ergebnis = 1;
		System.out.println("Basis eingeben:");
		a = s.nextDouble();
		System.out.println("Exponent eingeben:");
		b = s.nextInt();

		if (b != 0) {
			int ende = b;
			if (b < 0) {
				ende = ende * -1;
			}
			for (int i = 0; i < ende; i++) {
				ergebnis *= a;
			}
			if (b < 0) {
				ergebnis = 1.0 / ergebnis;
			}
		}
		System.out.println("Das Ergebnis ist: " + ergebnis);

//		 a = (b < 0) ? (1/a) : a;
//		 b = (b<0) ? (b*-1) : b;
//		 double ergebnis = (b!=0)? a:1.0;
//
//		 while(b > 1){
//		 ergebnis = ergebnis * ergebnis;
//		 b = b/2;
//		 }
//		
//		 System.out.println(a);

		s.close();
	}
}
