package beginner;

import java.util.Scanner;

public class Bee1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//String name = scanner.next();
		double fixedSalary = scanner.nextFloat();
		double totalSell = scanner.nextFloat();
		
		double bonous = (15 * totalSell) / 100 ;
		System.out.println(bonous);
		double finalSalary = fixedSalary + bonous;
		
		System.out.printf("TOTAL = R$ %.2f\n", finalSalary);
		
		
		

	}

}
