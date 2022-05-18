package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		
//		문제>
//		문자열1 입력 : nextLint()		hi
//		문자열2 입력 : next()			안녕
//		문자 입력 	 : next().charAt()	A
//		정수 입력	 : nextInt()		10
//		실수 입력	 : nextDouble()		3.14
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열1 입력 : ");
		String a = scanner.nextLine();
		System.out.print("문자열2 입력 : ");
		String b = scanner.next();
		System.out.print("문자 입력 : ");
		char c = scanner.next().charAt(0);
		System.out.print("정수 입력 : ");
		int d = scanner.nextInt();
		System.out.print("실수 입력 : ");
		double e = scanner.nextDouble();
		
		System.out.println("<결과>");
		System.out.println("문자열1	: " + a);
		System.out.println("문자열2	: " + b);
		System.out.println("문자	: " + c);
		System.out.println("정수	: " + d);
		System.out.println("실수	: " + e);
		
//		내가 쓴 코드
		
		String a1 = null;
		String b1 = null;
		char c1 = 0; //0이나 ''로 가능. (수정)''는안됌, 0으로 가능. 이유는뭘까?
		int d1 = 0;
		double e1 = 0;
		
		System.out.print("문자열1 입력 : ");
		a1 = scanner.nextLine();
		System.out.print("문자열2 입력 : ");
		b1 = scanner.next();
		System.out.print("문자 입력 : ");
		c1 = scanner.next().charAt(0);			//.charAt(0)은 무슨의미지?
		System.out.print("정수 입력 : ");
		d1 = scanner.nextInt();
		System.out.print("실수 입력 : ");
		e1 = scanner.nextDouble();
		
		System.out.println("<결과>");
		System.out.println("문자열1	: " + a1);
		System.out.println("문자열2	: " + b1);
		System.out.println("문자	: " + c1);
		System.out.println("정수	: " + d1);
		System.out.println("실수	: " + e1);
		
//		강사님 코드(변수의 선언은 가능하면 위에다가 몰아놓는게 좋다)
	}

}
