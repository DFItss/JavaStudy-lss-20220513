package j08_클래스;

public class UserMain {

	public static void main(String[] args) {

		User user01 = new User();
		System.out.println("첫번째" + user01.name);
//		user01.name = "xxx";
		user01.setName("aaa");
		System.out.println("두번째" + user01.name);
		
		User user02 = new User("xxx", "100", "000-0000-0000", "어딘가");
		System.out.println(user02.name);
		System.out.println(user02.age);
		System.out.println(user02.phone);
		System.out.println(user02.address);
	}

}
