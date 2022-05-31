package j17_스태틱;

public class StaticTest {
//public static class StaticTest 는 쓸 수 없다.

	public static int count;	//cnt라고 하기도함.
	
	public static void staticMethod() {
		System.out.println("스태틱 메소드 [ " + count + " ]");
	}
	
}
