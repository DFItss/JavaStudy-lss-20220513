package j19_제네릭;

import j10_클래스기본정리.repository.User;

public class Main {

	public static void main(String[] args) {

		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.updateUser());
//		System.out.println(((CMRespDto<User>) controller.getUser()).getData());
		System.out.println(controller.getUser().getData());
//		와일드 카드(<?>)를 썼기때문에 다운캐스팅 할 필요가 없어짐.
		controller.getAnimal().getData().move();
	}

}
