package exercise06;

public class Aufgabe4 {
	public static void main(String[] args) {
		new Aufgabe4().printTriangle2(5);
	}

	public void printTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			String s = "";
			if (i % 2 != 0) {
				s += " ";
			}
			for (int k = 0; k <= ((rows - i + 1) / 2); k++) {
				s += "  ";
			}
			for (int j = 1; j <= i; j++) {
				s += "* ";
			}
			System.out.println(s);
		}
	}
	
	public void printTriangle2(int rows) {
		for (int i = 1; i <= rows; i++) {
			String s = "";
			int amount = ((rows-i));
			if(amount > 0){
			String format = "%1$"+amount+"s";
			s = String.format(format, s);
			}
			if(i%2!=0 ){
				s+="  ";
			}
			s +="a";
			System.out.println(s);
		}
	}
}
