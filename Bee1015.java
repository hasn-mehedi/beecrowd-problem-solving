package beginner;

import java.util.Scanner;

public class Bee1015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		double distance = Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2)));
		
		System.out.printf("%.4f\n", distance);

	}

}
