package beginner;

import java.util.Scanner;

public class Bee1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int greater = ((a + b) + Math.abs(a - b)) / 2;
		int greatest = ((greater + c) + Math.abs(greater - c)) / 2;
		
		System.out.printf("%d eh o maior\n", greatest);

	}

}
