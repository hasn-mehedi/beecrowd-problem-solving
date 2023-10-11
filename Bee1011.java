package beginner;

import java.util.Scanner;

public class Bee1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double PI = 3.14159;
		double radius = scanner.nextDouble();
		
		double volume = (4 / 3.00) * PI * Math.pow(radius, 3);
		
		System.out.printf("VOLUME = %.3f\n", volume);

	}

}
