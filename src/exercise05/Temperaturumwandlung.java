package exercise05;

public class Temperaturumwandlung {

	public static void main(String[] args) {

		System.out.println("Fahrenheit\tCelsius");

		for (int i = 0; i <= 300; i++) {
			float celsius = (5.0f / 9.0f) * (i - 32);
			String celsiusFormat = String.format("%.2f", celsius);
			System.out.println(i + "\t" + celsiusFormat);
		}
	}
}
