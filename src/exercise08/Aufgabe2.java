package exercise08;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		String s = "a e i o u A E I O U";
		String s2 = spielen(s);
		System.out.println(s2);
	}

	public static String spielen(String normal) {
		
		char[] normalAsChar = normal.toCharArray();
		int anzahlVokale = 0;
		
		for (int i = 0; i < normalAsChar.length; i++) {
			if (vokal(normalAsChar[i])) {
				anzahlVokale++;
			}
		}
		
		char[] bSpracheAsChar = new char[(normalAsChar.length + (anzahlVokale * 2))];
		int iteratorBSprache = 0;
		for (char buchstabe : normalAsChar) {
			bSpracheAsChar[iteratorBSprache] = buchstabe;
			iteratorBSprache++;
			if (vokal(buchstabe)) {
				bSpracheAsChar[iteratorBSprache] = 'b';
				bSpracheAsChar[iteratorBSprache + 1] = Character.toLowerCase(buchstabe);
				iteratorBSprache += 2;
			}
		}
		
		String bSprache = String.valueOf(bSpracheAsChar);
		return bSprache;
	}

	public static boolean vokal(char buchstabe) {
		if (buchstabe == 'a' || buchstabe == 'e' || buchstabe == 'i' || buchstabe == 'o' || buchstabe == 'u'
				|| buchstabe == 'A' || buchstabe == 'E' || buchstabe == 'I' || buchstabe == 'O' || buchstabe == 'U') {
			return true;
		}
		return false;
	}
}
