package j11_배열;

public class Array02 {

	public static void main(String[] args) {

		
//		int size = 4;
//		int[] numbers01 = new int[size];
//		
//		System.out.println(numbers01.length);
		
		
/*
 * 		<문제>
 * 		for문으로 0~99까지 반복을 한다.
 * 		변수 i의 값이 8의 배수이면 8의 배수 갯수만큼 배열을 생성하고
 * 		8의 배수를 모두 배열에 대입하고 배열을 출력하시오.
 * 		
 */
		
		int size = 0;
		
		for(int i=0; i<100; i++) {
			
			if(i%8==0 && i!=0) {
				size++;
			}
			
		}
		
		int[] numbers02 = new int[size];
//		int j = 0; for문 안으로 넣을 수 있다.
		for(int i=0, j=0; i<100; i++) {
			
			if(i%8==0 && i!=0) {
				numbers02[j] = i;
				j++;
			}
			
		}
		
		for(int i=0; i<numbers02.length; i++) {
			System.out.println(numbers02[i]);
		}
		
	}

}
