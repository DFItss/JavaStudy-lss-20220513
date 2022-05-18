package j05_조건;

public class If02 {

	public static void main(String[] args) {

		int num = 5;
		
		if(num > 5) System.out.println("5보다 큽니다.");
		else System.out.println("5보다 크지 않습니다.");
//		실행명령문이 하나면 중괄호({})를 생략할 수 있다.
		
		
		int score = 85;
		
		if(score == 100) {
			System.out.println("만점 입니다.");
		}else {
			if(score > 89) {
				System.out.println("90점 이상입니다.");
			}else {
				if(score > 79) {
					System.out.println("80점 이상입니다.");
				}else {
					System.out.println("....");
				}
			}
		}
//		실행 명령문 하나일때 {}생략을 이용해서
//		위 코드의 else앞의 중괄호 쌍을 삭제 후 붙혀 아래와 같이 변경 가능.
		
		if(score == 100) {
			System.out.println("만점 입니다.");
		}else if(score > 89) {
			System.out.println("90점 이상입니다.");
		}else if(score > 79) {
			System.out.println("80점 이상입니다.");
		}else {
			System.out.println("....");
		}
		
	}

}
