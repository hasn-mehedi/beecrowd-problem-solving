package beginner;

import java.util.Scanner;

public class Bee1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		
		double average = (float) (((a * 2) + (b * 3) + (c * 5)) / 10.0);
		
		System.out.printf("MEDIA = %.1f\n", average);

	}

}
