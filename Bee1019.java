package beginner;

import java.util.Scanner;

public class Bee1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int totalSec = scanner.nextInt();
		
		int hour = totalSec / 3600;
		int minute = (totalSec % 3600) / 60;
		int sec = ((totalSec % 3600) % 60);
		
		System.out.printf("%d:%d:%d\n", hour, minute, sec);
		
		scanner.close();

	}

}
