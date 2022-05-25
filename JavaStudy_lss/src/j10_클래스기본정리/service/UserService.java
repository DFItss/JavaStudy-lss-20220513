package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserService {
	
	private Scanner scanner;
	
	public UserService() {
		scanner = new Scanner(System.in);
	}

	public User insertUser() {
		
		showInsertView();
		
		String userCode = null;
		String email = null;
		String name = null;
		String userName = null;
		String password = null;
		
		System.out.print("사용자 번호 입력 : ");
		userCode = scanner.nextLine();
		
		System.out.println("이메일");
		email = scanner.nextLine();
		
		System.out.println("이름");
		name = scanner.nextLine();
		
		System.out.println("사용자이름");
		userName = scanner.nextLine();
		
		System.out.println("비밀번호");
		password = scanner.nextLine();
		
		User user = new User(userCode, email, name, userName, password);
		return user;
		
	}
	private void showInsertView() {
		
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
		
	}
}
