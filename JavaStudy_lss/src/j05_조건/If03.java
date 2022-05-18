package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {

//		https://www.acmicpc.net/problem/9498 문제
		
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.println("점수를 입력하세요.");
		score = scanner.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("입력하신 점수는 계산할 수 없는 점수입니다.");
		}else if(score > 89) {
			System.out.println("A");
		}else if(score > 79) {
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
//		내가 쓴 코드(변수선언과 입력 까지는 강사님과 동일)
//		강사님 코드와 동일했음.
//		이상,이하(>=, <=)는 최대한 사용하지 말고 초과, 미만(>, <)를 사용할것.
		
		
		
	}

}
