package j06_반복;

public class Star {

	public static void main(String[] args) {

		/*
		 * 문제
		 * *
		 * **
		 * ...
		 * *****
		 */
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
