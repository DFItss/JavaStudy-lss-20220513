package j13_다형성;

public class FactoryMain02 {

	public static void main(String[] args) {

		Factory[] factorys = new Factory[100];
		
//		factorys[0] = new SmartPhoneFactory();
//		factorys[1] = new ComputerFactory();
				
		for(int i=0; i<factorys.length; i++) {
			factorys[i] = i%2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		
		for(Factory factory : factorys) {
			factory.start();
		}

		for(Factory factory : factorys) {	//다운 캐스팅 ex) double ii; ,int i = (int) ii;
			
			if(factory instanceof SmartPhoneFactory) {
				
			}else if(factory instanceof ComputerFactory) {
				
			}else {
				System.out.println("다운 캐스팅 할 수 없습니다.");
			}
			
			SmartPhoneFactory spf = (SmartPhoneFactory) factory;
		}
		
	}

}
