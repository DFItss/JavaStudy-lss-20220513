package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {

		
		/*
		 * 문제>
		 * https://movie.naver.com/movie/bi/mi/basic.naver?code=182016# 내용을 참고 해서
		 * 출연자를 제외한 부분을 직접! 입력하고 출력하는 코드 작성.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String info = null;
		String director = null;
		String grade = null;
		int audience = 0;
		String story = null;
		
		
		System.out.print("장르 입력 : ");
		info = scanner.nextLine();
		
		System.out.print("감독 입력 : ");
		director = scanner.nextLine();
		
		System.out.print("등급 입력 : ");
		grade = scanner.nextLine();
		
		System.out.print("누적 관객 입력 : ");
		audience = scanner.nextInt();
		
		System.out.print("줄거리 입력 : ");
		story = scanner.nextLine();
		
		System.out.println();						//한줄 띄우기용.
		System.out.println("[닥터 스트레인지 : 대혼돈의 멀티버스]");
		System.out.println("개요 : " + info);
		System.out.println("감독 : " + director);
		System.out.println("등급 : [국내] " + grade);
		System.out.println("흥행 : 누적관객 " + audience + "명");
		System.out.println("줄거리 : " + story);
		
	}

}
