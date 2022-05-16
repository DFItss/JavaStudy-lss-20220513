package j03_연산;

public class Operation04 {

	public static void main(String[] args) {

//		문제>
//		변수 num1, num2, num3
//		num1의 값이 3의 배수이면서
//		num2의 값이 짝수여야 하고
//		num3의 값이 5의 배수이면서
//		num3의 값에 num1을 나눈 나머지가 1이거나
//		num3의 값에 num2의 값을 나눈 나머지가 0이면 true를 출력하라.
		
			int num1 = 30;
			int num2 = 2;
			int num3 = 10;
		
			boolean result = false;
			boolean result1 = (num1 % 3) == 0;
			boolean result2 = (num2 % 2) == 0;
			boolean result3 = (num3 % 5) == 0;
		
			result = (num3 % num2 == 1) || (num3 % num2 == 0);
			
			System.out.println("내가 작성한 코드 : " + (result1 && result2 && result3 && result));
			
			
//			-------------------------------------------------------------------------
			
			result = num1 %3 == 0
					&& num2 % 2 ==0
					&& num3 % 5 ==0
					&& num3 % num1 ==1
					|| num3 % num2 == 0;
			
			System.out.println("강사님이 작성한 코드 : " + result);
	}

}
