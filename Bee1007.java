package beginner;

import java.util.Scanner;

public class Bee1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		int result = (a * b) - (c * d) ;
		
		System.out.printf("DIFERENCA = %d", result);

	}

}
