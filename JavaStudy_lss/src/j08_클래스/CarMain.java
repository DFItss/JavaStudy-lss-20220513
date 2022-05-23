package j08_클래스;

public class CarMain {

	/*
	 * 1.Car 클래스를 만든다. 
	 * 2.Car 클래스의 속성(변수), 제조사(companu), 모델(medel), 색상(color)
	 * 3.Car 클래스의 기능(메소드)
	 * 
	 * showCompanyInfo() > 000회사에서 제조된 차량입니다.
	 * 
	 * showInfoAll() 
	 * 제조사 : 00
	 * 모델: 00
	 * 색상: 00
	 * 
	 * getCar() > return KIA_K5_화이트, main에서 출력
	 * 
	 * setColor() > 매개변수에 생상을 받아서 color변수의 값을 변경
	 * 
	 * 1)KIA, K7, 블랙(setColor-블루)
	 * 2)현대자동차, 소나타, 화이트(setColor-그레이)
	 * 3)테슬라, 모델3, 레드(setColor-그린)
	 */
	public static void main(String[] args) {

		Car car01 = new Car();
		Car car02 = new Car();
		Car car03 = new Car();
		
		car01.company = "KIA";
		car01.model = "K5";
		car01.color = "Black";
		
		car02.company = "Hyundai";
		car02.model = "Sonata";
		car02.color = "White";

		car03.company = "Tesla";
		car03.model = "Model3";
		car03.color = "Red";
		
		car01.showCompanyInfo();
		car02.showCompanyInfo();
		car03.showCompanyInfo();
		
		System.out.println("\n--------------------------\n");

		car01.showInfoAll();
		car02.showInfoAll();
		car03.showInfoAll();

		System.out.println("\n--------------------------\n");

		System.out.println(car01.getCar()+"\n");
		System.out.println(car02.getCar()+"\n");
		System.out.println(car03.getCar()+"\n");
		
		System.out.println("\n--------------------------\n");
		
		car01.setColor("Blue");
		car02.setColor("Gray");
		car03.setColor("Green");
	
		System.out.println("\n변경 후\n");
		
		System.out.println(car01.getCar()+"\n");
		System.out.println(car02.getCar()+"\n");
		System.out.println(car03.getCar()+"\n");
		
	}

}
