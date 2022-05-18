package j05_조건;

public class If05 {

	public static void main(String[] args) {

		int num = 1;
		char c = 'a';
		String str = "가가가";
		
		switch(num) {
			case 1:
				System.out.println("case 1");
			case 2:
				System.out.println("case 2");
			case 3:
				System.out.println("case 3");
		}
		switch(c) {
			case 'a':
				System.out.println("case a");
			case 'b':
				System.out.println("case b");
			case 'c':
				System.out.println("case c");
		}
		switch(str) {
			case "가가가":
				System.out.println("case 가가가");
			case "나나나":
				System.out.println("case 나나나");
			case "다다다":
				System.out.println("case 다다다");
		}
		
		System.out.println("\n--break, default 사용--");//줄바꿈
		
		
		switch(num) {
//		연산도 가능 ex) num 대신 num/2 를 조건으로 넣었을때 결과가 2라면 case2를 찾아간다.
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
//		마지막엔 break가 필요없음.
		}
		
		switch(c) {
			
			case 'a':
				System.out.println("case a");
				break;
			case 'b':
				System.out.println("case b");
				break;
			case 'c':
				System.out.println("case c");
//			마지막엔 break가 필요없음.			
		}
		
		switch(str) {
			
			case "가가가":
				System.out.println("case 가가가");
				break;
			case "나나나":
				System.out.println("case 나나나");
				break;
			case "다다다":
				System.out.println("case 다다다");
				break;
//			default를 사용하기위해 break가 필요.
			default:
			System.out.println("찾을 수 없음");
//			마지막이기 대문에 이또한 break가 필요없다.
		}
	}

}
