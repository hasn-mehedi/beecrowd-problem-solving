package beginner;

import java.io.InputStream;
import java.util.Scanner;

public class Bee1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		
		Scanner scanner = new Scanner(is);
		
		int tripTime = scanner.nextInt();
		int averageSpeed = scanner.nextInt();
		
		float totalFuel = (float) ((tripTime * averageSpeed) / 12.00);
		
		System.out.printf("%.3f\n", totalFuel);

	}

}
