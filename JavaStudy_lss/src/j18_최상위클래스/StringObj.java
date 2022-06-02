package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {

		String name01 = "aaa";
		String name02 = "aaa";
		
		System.out.println(name01 == name02);	//=ture
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름01 : ");
		name01 = scanner.nextLine();
		System.out.println("이름02 : ");
		name02 = scanner.nextLine();
		System.out.println(name01 == name02);
		
		name01 = new String("aaa");
		name02 = new String("bbb");
		
		System.out.println(name01 == name02);
		System.out.println(name01.equals(name02));
	}

}
