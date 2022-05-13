package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {

		/*
		 * 1.문제
		 * name1, name2, name3
		 * 이름 한글자씩 선언
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * <결과>
		 * 이름 : 김준일
		 * 나이 : 29
		 * 연락처 : 010-9988-1916
		 * 주소 : 부산 동래구 사직동
		 */
		
		char name1 = '이';
		char name2 = '승';
		char name3 = '수';
		//char는 ''로 선언하고 string은 ""사용
		int age = 34;
		String phone = "010-6889-2685";
		String address = "부산광역시 남구 우암동";
		
		System.out.print("이름	: ");
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);
//		System.out.print(name1+name2+name3); >> 유니코드로 되어진 값의 합으로 나타남.
//		ex)AC01는 만단위의 10진수로 나타나기때문에 name1+name2+name3는 만단위 십진수 3개의 합으로 표현됨
//		System.out.print(""+name1+name2+name3); >> 이렇게 수정하면 <""(문자)+아스키코드=문자>로 출력된다.
//		System.out.println("세 수의 합 : " + 10 + 20 + 30); >> 이또한 "세 수의 합 : 102030;으로 출력되므로
//		System.out.println("세 수의 합 : " + (10 + 20 + 30)); >> 이렇게하면 60이라는 값을 얻을 수 있다.
		
		System.out.println();
		
		System.out.print("나이	: ");
		System.out.println(age);
		
		System.out.print("연락처	: ");
		System.out.println(phone);
		
		System.out.print("주소	: ");
		System.out.println(address);
	}

}
