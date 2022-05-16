package j03_연산;

public class Operation07 {

	public static void main(String[] args) {

		int		year	= 1999;
		String	result	= null;
		
//		4의 배수이면서 100의 배수가 아니거나 400의 배수인것
//		(4의배수 && 100의 배수가 아님 || 400의 배수(
//		참이면 윤년, 거짓이면 윤년이 아님 이라고 출력
		
		boolean result1 = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		result = result1 ? "윤년" : "윤년이 아님";
		
//		이렇게 하지말고
		
		result = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "윤년" : "윤년이 아님"; 
//		이렇게 하자.
		
		System.out.println("결과 : " + result);
		
	}

}
