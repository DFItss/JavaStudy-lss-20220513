package j05_조건;

public class If01 {

	public static void main(String[] args) {

		int num = 10;
		
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		}else {
			
			if(num < 5) {
				System.out.println("5보다 작습니다.");
			}else {
				System.out.println("5입니다.");
		
			}
		}		
//		else다음의 중괄호를 삭제하고 아래의 if문을 else 옆으로 이동시킨 뒤 정리하면 else if가 됨.
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		}else if(num < 5) {
			System.out.println("5보다 작습니다.");
		}else {
			System.out.println("5입니다.");
	
		}
		
	}

}
