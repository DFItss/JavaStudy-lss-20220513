package j06_반복;

public class Continue {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			if(i==5) {
				continue;
//				i==5일때는 생략하고 다음반복으로 건너뛰라는 의미. 
			}
			System.out.println(i);
		}
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				continue;
//				홀수만 출력.
			}
			System.out.println(i);
		}
		
	}

}
