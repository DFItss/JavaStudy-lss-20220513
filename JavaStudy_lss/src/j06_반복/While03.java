package j06_반복;

import java.util.Scanner;

public class While03 {
	
	public static void main(String[] args) {
		
		/*
		 * 문제> 
		 * 1부터 num까지 1씩 증가 출력
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int i = 0;
		System.out.println("반복 횟수를 입력하세요.");
		num = scanner.nextInt();
		
		if(num>0 && num!=0) {
			while(i<num) {
				i++;
				System.out.println(i);
			}
		}else {
			System.out.println("0이 아닌 양의 정수를 입력하세요.");
		}
//		내가 쓴 코드(if문은 내맘대로 넣은것)
		
		while(i<num) {
			System.out.println(i+1);
			i++;
		}
//		강사님 코드
		
//		문제2> num부터 1까지 1씩 감소 출력(i까지 활용)
		System.out.println("\n--문제2--");
		while(num>0) {
			System.out.println(num);
			num--;//가능하면 --를 쓰지말라고 하시는데
		}
//		내가 쓴 코드
		i = 0;
		while(i<num) {
			System.out.println(num-i);
			i++;
		}
//		강사님 코드
	}
	
}
