package j06_반복;

public class While01 {

	public static void main(String[] args) {

		int i = 0;
		int result = 0;
		
		while(i<100) {

			result = result + (i+1);
//			복합대입연산자 +=, -+, *=, /= 는 5씩 증가하거나 곱 차 나누기가 적용가능
//			++, --는 1씩 증가 감소만 가능.
			i++; //조건 변화 수식
			
			System.out.println(result);
		}
		
	}

}
