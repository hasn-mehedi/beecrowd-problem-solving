package beginner;

import java.util.Scanner;

public class Bee1002 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double PI = 3.14159;
		
		double r = scanner.nextDouble();
		
		double area = PI * Math.pow(r, 2);
		
		System.out.printf("A=%.4f\n", area);

	}

}
