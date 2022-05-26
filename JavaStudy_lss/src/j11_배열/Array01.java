package j11_배열;

public class Array01 {

	public static void main(String[] args) {

		int number1 = 1;
		int number2 = 2;
		int number3 = 3;
		int number4 = 4;
		int number5 = 5;
		int number6 = 6;
		
		
//		1. 배열의 공간(크기)을 정해서 생성.
		int[] numbers01 = new int[10];
		
//		2. 배열에 들어갈 값을 미리 정해서 생성.
		
		int[] numbers02 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, false, false};
		
		String[] strArray = new String[5];

		System.out.println("numbers01.length : " + numbers01.length);
		System.out.println("numbers02.length : " + numbers02.length);
		System.out.println("strArray.length : " + strArray.length);
		
		for(int i=0; i<numbers01.length; i++) {
			System.out.println("numbers01 : " + numbers01[i]);
			System.out.println("numbers02 : " + numbers02[i]);
		}
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println("strArray : " + strArray[i]);
		}
		
	}

}
