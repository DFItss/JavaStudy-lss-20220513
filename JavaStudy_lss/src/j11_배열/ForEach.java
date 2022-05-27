package j11_배열;

public class ForEach {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
//		<문제> 1, 2, 3, 4, 5, 6, 7, 8 의 형태로 출력
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.print(numbers[i]);
			
			if(i < numbers.length-1) {
				System.out.print(", ");
			}
			
//			System.out.print(numbers[i] + (numbers.length-1 != i? ", " : ""));
//			3항 연산자로 if없이 구현가능.
		}
		int i = 0;
		for(int num : numbers) {
			System.out.println(num + (numbers.length-1 != i ? ", ": ""));
			i++;
		}
		
	}

}
