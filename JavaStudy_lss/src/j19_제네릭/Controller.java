package j19_제네릭;

import j10_클래스기본정리.repository.User;
import j12_상속.동물.Animal;
import j12_상속.동물.Human;
import j12_상속.동물.Tiger;

public class Controller {

	public Object createUser() {
	
		return new CMRespDto<String>(1, "회원추가 성공", "aaa, 1234");
		
	}
	
	public Object updateUser() {
		
		return new CMRespDto<Integer>(1, "회원정보(나이)수정 성공", 100);
				
	}
	
	public CMRespDto<?> getUser() {
//	<?> : 제네릭의 와일드 카드	-> 어떤 자료형이 리턴될지 모르는 상태?
		User user = new User();
		user.setUserCode("2");
		user.setUserName("aaa");
		user.setPassword("1234");
		user.setName("bbb");
		user.setEmail("aaa@aaa.aaa");
		if(user.getUserCode().equals("1")) {
			return new CMRespDto<>(1,"회원정보 가져오기 성공", user);
		}else {
			return new CMRespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		}
	}
	
	public CMRespDto<? extends Animal> getAnimal(){
	
		Animal animal = new Human();

		if(animal instanceof Human) {
			return new CMRespDto<Human>(1, "사람입니다.", (Human) animal);			
		}else if(animal instanceof Tiger) {
			return new CMRespDto<Tiger>(1, "호랑이 입니다", (Tiger) animal);
			
		}else {
			return new CMRespDto<>(-1, "찾을 수 없는 동물", null);
		}
	}
}
