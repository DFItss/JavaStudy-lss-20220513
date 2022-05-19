package j06_반복;

public class While02 {

	public static void main(String[] args) {
		
		/* 문제>
		 * 구구단 2단 출력 
		 * 2 x 1 = 2 
		 * 2 x 2 = 4 
		 * .... 
		 * 2 x 9 =18
		 */
		
		int dan = 2;
		int num = 0;
		
		while(num<9) {
//			num = num + 1;
//			num += 1;
			num++;
			System.out.println(dan + " x " + num + " = " + (dan*num));
		}
//		내가 쓴 코드

		System.out.println("\n--강사님 코드--");
		
		num = 0;
		while(num<9) {
			System.out.println(dan + " x " + (num+1) + " = " + dan*(num+1));
			num++;
		}
//		강사님 코드
	}

}
