package j07_메소드;

import java.util.Scanner;

public class Method01 {

	public static int clacFormula01(int a, int b, int c, int d, int e) {
		
		int result = a + (b * c) - (d * e);
		
		return result;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, e;
		int r1, r2, r3, r4;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		
		r1 = clacFormula01(a, b, c, d, e);
		r2 = clacFormula01(10, 20, 5, 30, 2);
		r3 = a + (b * c) - (d * e);
		r4 = a + (b * c) - (d * e);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

}
