package j12_상속;

public class Test01 extends Test{

	public Test01() {
		super();	//부모 클래스 생성.
		System.out.println("Test01 생성자 호출");
		System.out.println("Test01에서 확인 : "+super.toString());

	}

}
