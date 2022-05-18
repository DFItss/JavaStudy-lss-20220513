package j03_연산;

public class Operation08 {

	public static void main(String[] args) {
		
//		문제>
//		num = 10
//		num이 짝수면 짝수, 홀수면 홀수로 출력
		
		int num = 10;
		String result = (num%2==0) ? "짝수" : "홀수";
		System.out.println("num은 '" + result + "'입니다.");
//		내가 짠 코드
//		변수를 재활용 할게 아니라면 변수를 쓸필요없을것 같다.
		
		System.out.println(num%2==0?"짝수":"홀수");
//		강사님 코드
	}

}
