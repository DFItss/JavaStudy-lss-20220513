package j02_변수와_상수;

public class MaxMin {

	public static void main(String[] args) {

		final int MAX_NUMBER;
		MAX_NUMBER = 100;
		//상수는 대문자로 표기하고 헝가리안 표기(_)사용.
		final int MIN_NUMBER = 0;
	
		
		System.out.println("최대값 : " + MAX_NUMBER);
		System.out.println("최소값 : " + MIN_NUMBER);
		
		final String PATH = "C:\\junil\\junil\\workspace";
		final double PI = 3.141592;
		
		//업캐스팅(묵시적 형변환) : 문자 > 정수 > 실수
//		여기서 묵시적이란 int > double 처럼 딱히 (double)을 입력하지 않아도 자동으로 처리됨을 뜻함.
		char a = 'A';
		System.out.println(a);
		int b = a;
		System.out.println(b);
		double c = b;
		System.out.println(c);
		int d = (int)c;
		System.out.println(d);
		char e = (char) d;
		System.out.println(e);
		//다운캐스팅(명시적 형변환) : 실수 > 정수 > 문자
		
		
		
		
	}

}
