package beginner;

import java.util.Scanner;

public class Bee1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c;
		double PI = 3.14159;
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		double areaTriangle = (1 / 2.00) * a * c;
		double areaCircle = PI * Math.pow(c, 2);
		double areaTrapezeum = (1 / 2.00) * (a + b) * c;
		double areaSquare = Math.pow(b, 2);
		double areaRectangle = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", areaTriangle);
		System.out.printf("CIRCULO: %.3f\n", areaCircle);
		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezeum);
		System.out.printf("QUADRADO: %.3f\n", areaSquare);
		System.out.printf("RETANGULO: %.3f\n", areaRectangle);

	}

}
