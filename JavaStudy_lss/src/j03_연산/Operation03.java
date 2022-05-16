package j03_연산;

public class Operation03 {

	public static void main(String[] args) {

		
//		문제1> 
//		year = 1999 
//		년도가 4의 배수이면 True 아니면 False
		 
		int year = 1999;
		boolean result1 = (year % 4) == 0;
		
		System.out.println("result1 : " + result1);
	
//		문제2>
//		윤년이면 True 아니면 False
//		윤년조건 : 4의 배수이면서, 100의 배수가 아닐때 또는 400의 배수일때
		
		boolean result2 = (year % 100) != 0;
		boolean result3 = (year % 400) == 0;
		boolean result4 = result1 && result2 || result3;
		System.out.println("윤년 조건 조회 결과 : " + result4);
//		변수여럿을 선언하기보다 하나의 변수에 조건을 때려넣는게 좋다?
		boolean result = (year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0;
		System.out.println("윤년 조건 조회 결과 : " + result);
		
	}

}
