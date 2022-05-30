package j14_추상;

public class LGFactory extends Factory{

	@Override
	public void start() {
		System.out.println("LG만의 방식으로 공장을 가동합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("LG만의 방식으로 공장을 가동합니다.");
	}
}
