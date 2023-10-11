package beginner;

import java.util.Scanner;

public class Bee1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int iteration = 2;
		int id, unit;
		float perUnitPrice;
		float totalPrice = 0;
		
		for(int i = 0; i < iteration; i++) {
			
			id = scanner.nextInt();
			unit = scanner.nextInt();
			perUnitPrice = scanner.nextFloat();
			
			totalPrice += (unit * perUnitPrice);
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPrice);

	}

}
