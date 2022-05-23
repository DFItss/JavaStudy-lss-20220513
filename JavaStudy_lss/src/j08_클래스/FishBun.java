package j08_클래스;

//	클래스는 변수와 매소드로 이루어져있다.

public class FishBun {

	String material;
	String dough;
	
	FishBun(){
//		생성자는 생략되어있고, 생성자는 메모리 주소를 반환하기 때문에 반환에 자료형이 필요없다.
	}
	
	void showInfo() {
		System.out.println("재료 : " + material);
		System.out.println("반죽 : " + dough);
	}
}
