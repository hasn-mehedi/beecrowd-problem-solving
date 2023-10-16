package beginner;

import java.util.Scanner;

public class Bee1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int totalDays = scanner.nextInt();
		
		int year = totalDays / 365;
		int month = (totalDays % 365) / 30;
		int days = ((totalDays % 365) % 30);
		
		System.out.printf("%d ano(s)\n", year);
		System.out.printf("%d mes(es)\n", month);
		System.out.printf("%d dia(s)\n", days);

	}

}
