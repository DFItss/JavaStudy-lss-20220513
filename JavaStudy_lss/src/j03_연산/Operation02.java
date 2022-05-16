package j03_연산;

/*

	<논리 연산자>

	AND	: &&	- 모든 조건이 참일때 T의 결과를 가짐.
				  하나라도 거짓이면 F의 결과를 가짐.
	OR	: ||	- 하나라도 참이면 T의 값을 가짐.
				  모든 조건이 거짓일때 F의 값을 가짐.
	NOT	: !		- 부정(반전)

	0(false) : 0이면 false
	!0(true) : 0이 아니면 true

*/

public class Operation02 {

	public static void main(String[] args) {

		int num = 10;
		boolean result1 = num > 5;
		boolean result2 = num == 10;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);

		System.out.println("result1 AND result2 : " + (result1 && result2));
		System.out.println("result1 OR result2 : " + (result1 || result2));
		System.out.println("result1 OR result2 : " + !(result1 || result2));
		
	}

}
