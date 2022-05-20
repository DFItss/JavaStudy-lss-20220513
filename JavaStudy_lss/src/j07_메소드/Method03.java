package j07_메소드;

//	<메소드 오버로딩>

public class Method03 {

	public static void test01() {
		System.out.println("매개변수가 없는 test01 호출");
	}
	
	public static void test01(int num1) {
		System.out.println("int자료형 매개변수가 하나인 test01 호출");
	}
	
	public static void test01(int num1, int num2) {
		System.out.println("int자료형 매개변수가 둘인 test01 호출");
	}

	public static void test01(double num1) {
		System.out.println("double자료형 매개변수가 하나인 test01 호출");
	}
//	매개변수의 수가 아닌 자료형으로 중복여부를 확인한다.
	
	public static void test01(double num1, int num2) {
		System.out.println("double자료형 다음에 int자료형 매개변수가 둘인 test01 호출");
	}
	
	public static void test01(int num1, double num2) {
		System.out.println("int자료형 다음 double자료형 매개변수가 둘인 test01 호출");
	}
//	매개변수의 순서에도 영향을 받는다. 리턴 자료형이 달라도 중복으로 인식한다.

	
	public static void main(String[] args) {
		
		test01();
		test01(10);
		test01(10, 20);
		
	}

}
