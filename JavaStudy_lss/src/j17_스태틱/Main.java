package j17_스태틱;

public class Main {

	public static void main(String[] args) {

		Test t01 = new Test();
		Test t02 = new Test();
		Test t03 = new Test();
		
		t01.count = 10;
		t02.count = 20;
		t03.count = 30;
		
		t01.method();
		t02.method();
		t03.method();
		
//		StaticTest st01 = new StaticTest();
//		StaticTest st02 = new StaticTest();
//		StaticTest st03 = new StaticTest();
//		
//		st01.count = 10;
//		st02.count = 20;
//		st03.count = 30;
//		
//		st01.staticMethod();
//		st02.staticMethod();
//		st03.staticMethod();
		
		StaticTest.count = 100;
		
		StaticTest.staticMethod();
	}

}
