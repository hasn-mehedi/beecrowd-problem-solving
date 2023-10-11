package beginner;

import java.util.Scanner;

public class Bee1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int distance = scanner.nextInt();
		float fuel = scanner.nextFloat();
		
		float average = (distance / fuel);
		
		System.out.printf("%.3f km/l\n", average);

	}

}
