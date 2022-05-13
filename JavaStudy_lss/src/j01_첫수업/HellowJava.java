package j01_첫수업;

public class HellowJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class명명시 첫글자는 꼭 '대문자'로 할것.
		System.out.print("Hello, Java");
		System.out.print("10+5");
		System.out.println("Hello. Java"); //'println'은 출력후 줄바꿈
		System.out.println(10+5);
		
		int age = 100;
		
		System.out.print("이름 : ");
		System.out.println("이승수");
		System.out.print("직업 : ");
		System.out.println("수강생");
		System.out.print("나이 : ");
		System.out.println(age);
		
		age = 130;
		
		System.out.print("이름 : ");
		System.out.println("이승수");
		System.out.print("직업 : ");
		System.out.println("수강생");
		System.out.print("나이 : ");
		System.out.println(age);
		
		age = age + 1;
		
		System.out.println(age);
	}

}
