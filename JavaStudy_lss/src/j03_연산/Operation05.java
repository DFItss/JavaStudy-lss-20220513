package j03_연산;

public class Operation05 {

	public static void main(String[] args) {

		int num = 10;
		
		num = num + 2;
		num += 2;
//		둘이 같은 결과 +, -, *, / 다 가능
		
		System.out.println(num);

		num%=3;
		System.out.println("num %= 3 결과 : " + num);
//		나머지가 'num'에 더해지는것이 아닌 나머지가 'num'이 되는것!
	}

}
