package exercise08;

public class Aufgabe3 {
public static void main(String[] args) {
	if(args.length != 2){
		System.out.println("Bitte genau 2 Zahlen übergeben!");
		System.exit(1);
	}
	double produkt = Double.valueOf(args[0])*Double.valueOf(args[1]);
	System.out.println("Das Produkt beträgt: " +produkt);
}
}
