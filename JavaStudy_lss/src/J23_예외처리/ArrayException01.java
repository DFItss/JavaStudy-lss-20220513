package J23_예외처리;


/*
 * 	프로그램의 오류>
 * 	
 * 	1. 예외(프로그램이 실행 중)	: RuntimeException
 * 	2. 컴파일 에러 ex)드라이버	: IOException
 * 	3. 버그
 * 
 */
public class ArrayException01 {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		try {
			for(int i=0; i<numbers.length+1; i++) {
				System.out.println("inxex " + i + ": " + numbers[i]);
			}

		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
		}
	}

}
