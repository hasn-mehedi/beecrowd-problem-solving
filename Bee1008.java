package beginner;

import java.util.Scanner;

public class Bee1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int totalHour = scanner.nextInt();
		float perHourPrice = scanner.nextFloat();
		
		float salary = (totalHour * perHourPrice);
		
		System.out.printf("NUMBER = %d\n", number);
		System.out.printf("SALARY = U$ %.2f\n", salary);

	}

}
