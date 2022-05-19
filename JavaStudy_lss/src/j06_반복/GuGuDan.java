package j06_반복;

public class GuGuDan {

	public static void main(String[] args) {

//		문제> 2단부터 9단까지 출력
		
		for(int i=0; i<8; i++) {
			System.out.println((i+2) + "단");
			for(int j=0; j<9; j++) {
				System.out.println((i+2) + " x " + (j+1) + " = " + ((i+2)*(j+1)));
			}
			System.out.println();	//줄바꿈
		}

		for(int i=2; i<10; i++) {
			System.out.println(i + "단");
			for(int j=2; j<10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();	//줄바꿈
		}
//		조건부분에서 반복횟수를 직관적으로 알 수 있는 첫번째 방법을 사용할 것.
	}

}
