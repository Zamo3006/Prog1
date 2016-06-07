package exercise07;

import java.util.Scanner;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int count;
		
		System.out.println("Anzahl eingeben: ");
		count = s.nextInt();
		
		if (count < 1) {
			System.out.println("Anzahl größer 0 eingeben!");
			System.exit(1);
		}
		
		float[] values = new float[count];
		
		for (int i = 0; i < count; i++) {
			System.out.println(i + 1 + ". Wert:");
			values[i] = s.nextFloat();
		}
		
		System.out.println("Kleinster Wert: " + minimum(values));
		System.out.println("Größter Wert: " + maximum(values));
		System.out.println("Arithmentischer Mittelwert: " + String.format("%.2f", average(values)));
		System.out.println("Standardabweicheung: "+ String.format("%.2f", deviation(values)));
		
		s.close();
	}

	public static float minimum(float[] values) {
		float min = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] < min)
				min = values[i];
		}
		return min;
	}

	public static float maximum(float[] values) {
		float max = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] > max)
				max = values[i];
		}
		return max;
	}

	public static float average(float[] values) {
		float average = 0.0f;
		for (float value : values) {
			average += value;
		}
		average /= values.length;
		return average;
	}

	public static double deviation(float[] values) {
		float average = average(values);
		double deviation = 0.0;
		for (float value : values) {
			deviation += Math.pow((value - average), 2);
		}
		deviation /= values.length;
		deviation = Math.sqrt(deviation);
		return deviation;
	}
}
