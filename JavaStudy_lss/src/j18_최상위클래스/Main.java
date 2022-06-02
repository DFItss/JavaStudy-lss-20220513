package j18_최상위클래스;

public class Main {

	public static void main(String[] args) {

		Teacher t01 = new Teacher("aaa", "웹개발");
		Teacher t02 = new Teacher("aaa", "웹개발");
		
		System.out.println(t01.toString());	
		System.out.println(t02);	//toString은 생략이 가능하다.
		System.out.println(t01 == t02);
		System.out.println(t01.equals(t02));
		System.out.println(t01.hashCode() == t02.hashCode());
		
	}

}