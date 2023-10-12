package beginner;

import java.util.Scanner;

public class Bee1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int[] notes = {100, 50, 20, 10, 5, 2, 1};
		
		int amount = scanner.nextInt();
		int number, restAmount = amount;
		
		System.out.println(amount);
		
		for(int i = 0; i < notes.length; i++) {
			
			number = restAmount / notes[i];
			restAmount = restAmount % notes[i];
			
			System.out.printf("%d nota(s) de R$ %d,00\n", number, notes[i]);
		}

	}

}
