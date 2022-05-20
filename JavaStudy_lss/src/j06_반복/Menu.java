package j06_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		while(loopFlag) {
			
			char select = 0;
			
			System.out.println("[ 메뉴 선택 ]");
			System.out.println("1. Java");
			System.out.println("2. Python");
			System.out.println("3. JavaScript");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("명령을 입력하세요.");
			select = scanner.next().charAt(0);
//				charAt(0)은 입력받은 문자열의 위치를 의미한다. 0이기때문에 abcd를 입력했을때 0번째인 a가 된다.
			scanner.nextLine();
//				입력시 공백이 있을때 의도치 않은 상황을 방지 할 수 있다.
			System.out.println(select);
			
			if(select == 'q') {
				break;
				
			}else if(select == '1') {
				System.out.println("Java를 선택하셨습니다.");
				
				while(true) {
					System.out.println("[ Java 메뉴 ]");
					System.out.println("1. Java란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("명령을 입력하세요.");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == 'q'){
						loopFlag = false;
						break;
					}else if(select=='1') {
						System.out.println("자바란 ... 입니다.");
						System.out.println("계속 하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
//						반복을 멈추고 머물게 하는 역할. 없다면 바로 메뉴를 출력한다.
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
					}
				}
				
			}else if(select == '2') {
				System.out.println("Python를 선택하셨습니다.");
				
				while(true) {
					System.out.println("[ Python 메뉴 ]");
					System.out.println("1. Python이란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("명령을 입력하세요.");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == 'q'){
						loopFlag = false;
						break;
					}else if(select=='1') {
						System.out.println("Python이란 ... 입니다.");
						System.out.println("계속 하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
					}
				}
			}else if(select == '3') {
				System.out.println("JavaScript를 선택하셨습니다.");
				
				while(true) {
					System.out.println("[ JavaScript 메뉴 ]");
					System.out.println("1. JavaScript란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("명령을 입력하세요.");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == 'q'){
						loopFlag = false;
						break;
					}else if(select=='1') {
						System.out.println("JavaScript란 ... 입니다.");
						System.out.println("계속 하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
					}
				}
			}else {
				System.out.println("해당 명령은 보기에 없습니다.");
				System.out.println("다시 입력하세요.");
			}
			
			System.out.println();	//줄바꿈
		}
		
		System.out.println("프로그램 종료");
	}

}
