package beginner;

import java.util.Scanner;

public class Bee1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		
		double average = (float) (((a * 3.5) + (b * 7.5)) / 11.0);
		
		System.out.printf("MEDIA = %.5f\n", average);

	}

}
