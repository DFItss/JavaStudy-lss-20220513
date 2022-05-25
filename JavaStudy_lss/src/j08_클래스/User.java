package j08_클래스;

public class User {

	String name;
	String age;
	String phone;
	String address;
	
	User() {	//기본 생성자
		System.out.println("생성");
	}
	
	User(String name) {	//사용자 정의 생성자
		System.out.println(name);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	User(String name, String age, String phone, String address) {
		this.name	= name;
		this.age	= age;
		this.phone	= phone;
		this.address= address;
	}
}
