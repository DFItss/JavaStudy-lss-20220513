package j07_메소드;

public class Method02 {

	
	public static void test01() {
		System.out.println("test01 메소드 실행");
	}
//	test01은 매개변수가 없으면서 반환도 없는 메소드
	
	public static void test02(int name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
//	test02는 매개변수는 있고 반환이 없는 메소드
	
	public static String test03() {
		return "a";
	}
	
	public static String test05(String name, int num) {
		
		return name + num;
	}
//	test05는 매개변수도 있고 반환도 있는 매소드
	
	public static void test06() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==6) {
				System.out.println("test06 메소드 탈출");
				return;
//	return 자료형이 void일때 메소드를 탈출하는 방법.
			}
		}
	}

	
	public static void main(String[] args) {

		System.out.println("메인함수 시작");
		
		test01();
		
		test02(1, 2);
		
		test03();
		
		String c = test03();
		System.out.println(c);
		
		System.out.println(test03());
		
		System.out.println(test05("a", 1));
		
		test06();
		
		System.out.println("메인함수 끝");
		
	}

}
