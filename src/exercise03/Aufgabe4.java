package exercise03;

public class Aufgabe4 {
	public static void main(String[] args) {

		int wurf = (int) (Math.random() * 6) + 1;
		
		switch (wurf) {
		case 1:
			System.out.println("Eins gew�rfelt");
			break;
		case 2:
			System.out.println("Zwei gew�rfelt");
			break;
		case 3:
			System.out.println("Drei gew�rfelt");
			break;
		case 4:
			System.out.println("Vier gew�rfelt");
			break;
		case 5:
			System.out.println("F�nf gew�rfelt");
			break;
		case 6:
			System.out.println("Sechs gew�rfelt");
			break;
		default:
			break;
		}

	}
}
