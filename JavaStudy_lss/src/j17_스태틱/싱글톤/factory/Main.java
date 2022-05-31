package j17_스태틱.싱글톤.factory;

public class Main {

	public static void main(String[] args) {

		KIA kiaFactory01 = KIA.getInstance();
		KIA kiaFactory02 = KIA.getInstance();
		KIA kiaFactory03 = KIA.getInstance();
		
		Car k5_01 = kiaFactory01.createCar("k5");
		Car k5_02 = kiaFactory01.createCar("k5");
		
		kiaFactory01.carInfo(k5_01);
		kiaFactory01.carInfo(k5_02);
		
		Car k7_01 = kiaFactory02.createCar("k5");
		Car k7_02 = kiaFactory02.createCar("k5");
		
		kiaFactory01.carInfo(k7_01);
		kiaFactory01.carInfo(k7_02);
		
	}

}
