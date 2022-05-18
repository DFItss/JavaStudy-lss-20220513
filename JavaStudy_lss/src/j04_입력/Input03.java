package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {

		/*
		 * <문제>
		 * [개인정보입력]			
		 * 이름 : XXX				문자열
		 * 나이 : XX				정수
		 * 연락처 : 000-0000-0000	문자열
		 * 주소 : 대한민국 어딘가	문자열
		 * 성별 : 남				문자
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		System.out.println("[개인정보 입력]");
		
		System.out.print("이름 입력 : ");
		name = scanner.nextLine();
		
		System.out.print("나이 입력 : ");
		age = scanner.nextInt();
		
		System.out.print("연락처 입력 : ");
		phone = scanner.nextLine();
		
		System.out.print("주소 입력 : ");
		address = scanner.nextLine();
		/*
		 * next는 개행문자를 인식하지 않고 개행문자와 함께 입력이 끝난다. 띄워쓰기를 인식하지 못해 붙어있는 문자열만 입력가능하다. 하지만
		 * nextLine은 개행문자를 읽을줄 알기때문에 여기다 nextLine()을 쓰면 이전행에서 연락처입력후 엔터에 해당하는 개행문자가 버퍼에
		 * 남아있는데 이를 인식하고 입력값으로 받아버린다. 이때문에 직접입력할수 없고 넘어가버린다.
		 */
		System.out.print("성별 입력 : ");
		gender = scanner.next().charAt(0);
			
		System.out.println();						//한줄 띄우기용.
		System.out.println("[개인정보 출력]");
		System.out.println("이름	: " + name);
		System.out.println("나이	: " + age);
		System.out.println("연락처	: " + phone);
		System.out.println("주소	: " + address);
		System.out.println("성별	: " + gender);

//		----------------------------------------------------------
		
		String address1 = null;
		String address2 = null;
		String address3 = null;
		
		System.out.print("주소입력 :");
		
		address1 = scanner.next();
		address2 = scanner.next();
		address3 = scanner.next();
		
		System.out.println("주소 : " + address1 + address2 + address3);
		
		/*
		 * '주소입력 : 부산 광역시 남구' 라고 입력하고 엔터를 친다면 
		 * address1 > 부산 
		 * address2 > 광역시 
		 * address3 > 남구 
		 * 로 입력되고 버퍼는 끝나지만 버퍼안에 엔터값이 남아있게된다.
		 * 이후 바로 nextLine()을 사용하면 엔터값을 인식하고 입력이 바로 끝나버린다.(버퍼는 엔터를 치면 끝난다)
		 * 이를 해결하기위해 scanner.nextLine()을 한줄 추가해서 버퍼에 남아있는 엔터를 날리면 해결할 수 있다.
		 * next는 개행문자인 띄워쓰기를 인식하지못하고(?) 입력이 끝난것으로 인식해 
		 * 다음 입력인 address2로 넘어가고 이후로도 같은 현상이 발생해서 3개의 변수에 입력값이 들어간다.
		 * 결과는 '주소 : 부산광역시남구' 로 출력된다.
		 */
		
	}

}
