package j13_다형성;

public class FactoryMain01 {

	public static void main(String[] args) {

//		SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();
//		ComputerFactory computerFactory = new ComputerFactory();
		
		Factory smartPhoneFactory = new SmartPhoneFactory();
		Factory computerFactory = new ComputerFactory();
//		업캐스팅
		
		smartPhoneFactory.start();
		computerFactory.start();
		
//		smartPhoneFactory.show();	> 업캐스팅했기 때문에 SmartPhoneFactory의 showSmartPhone 매소드를 쓸 수없다.
		smartPhoneFactory.start();
	}

}
