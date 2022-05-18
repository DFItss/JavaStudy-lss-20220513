package j04_입력;

import java.util.Scanner;

public class Input05 {

	public static void main(String[] args) {
//		https://www.acmicpc.net/problem/1000 입출력 문제
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("두 수의 합은 : " + (a+b));
		
//		https://www.acmicpc.net/problem/1330 두 수 비교하기 문제
		
//		String result = (a==b) ? "==" : (a>b ? ">" : "<");
//		System.out.println(result);
		System.out.println((a==b) ? "==" : (a>b ? ">" : "<")); //길어질때 :(연산자) 기준으로 줄바꿈한다.
		
	}

}
