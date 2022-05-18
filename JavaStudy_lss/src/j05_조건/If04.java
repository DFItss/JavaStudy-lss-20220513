package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {

//		https://www.acmicpc.net/problem/14681 문제
//		x=0 || y=0 고려하고 x=0 && y=0 일때 원점이라고 출력
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.print("x = ");
		x = scanner.nextInt();
		System.out.print("y = ");
		y = scanner.nextInt();
		
		if((x>1000 || x<-1000) || (y>1000 || y<-1000)) {
			System.out.println("계산이 불가능한 값입니다.");
		}else {
			if(x==0 && y==0) {
				System.out.println("원점 입니다.");
			}else if(x==0) {
				System.out.println("y축 위에 위치하고 있습니다.");
			}else if(y==0) {
				System.out.println("x축 위에 위치하고 있습니다.");
			}else if(x>0 && y>0) {
				System.out.println("("+x+" ,"+y+")는 1사분면에 위치하고 있습니다.");
			}else if(x<0 && y>0) {
				System.out.println("("+x+" ,"+y+")는 2사분면에 위치하고 있습니다.");
			}else if(x<0 && y<0) {
				System.out.println("("+x+" ,"+y+")는 3사분면에 위치하고 있습니다.");
			}else if(x>0 && y<0) {
				System.out.println("("+x+" ,"+y+")는 4사분면에 위치하고 있습니다.");
			}
		}

		System.out.println();
		System.out.println();
		System.out.println();
		
//		내가 작성한 코드, 축위의 점은 계산불가로 해야하는데 축위에 있다고 작성해봄.
//		조건을 세분화 시켜 if를 여러번쓰면 편하긴한데 실행속도가 떨어진다.
		
		if((x>1000 || y>1000 || x<-1000 || y<-1000 || x==0 || y==0) && (x!=0 || y!=0)) {
			System.out.println("계산불가");
		}else {
			if(x>0 && y>0) {
				System.out.println("1사분면");
			}else if(x<0 && y>0) {
				System.out.println("2사분면");
			}else if(x<0 && y<0) {
				System.out.println("3사분면");
			}else if(x<0 && y<0) {
				System.out.println("4사분면");
			}else {
				System.out.println("원점");
			}
		}
//		강사님이 작성한 코드. 
		
		String result = (x>1000 || y>1000 || x<-1000 || y<-1000 || x==0 || y==0)
				&& (x!=0 || y!=0) ? "계산불가" 
						: x>0 && y>0 ? "1사분면" 
								: x<0 && y>0 ? "2사분면" 
										: x<0 && y<0 ? "3사분면" 
												: x<0 && y<0 ? "4사분면" : "원점";
		System.out.println(result);
//		위의 강사님 코드를 3항 연산자로 작성하면 이렇다.
	}

}
