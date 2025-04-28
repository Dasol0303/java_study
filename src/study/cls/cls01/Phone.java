package study.cls.cls01;

public class Phone {
	//필드
	String model;	//모델명		필수!
	int price;		//금액		선택 -> 기본값 100
	int battery;	//배터리 용량	선택 -> 기본값 3000
	
	//생성자
	//기본생성자 : 선언된 생성자가 없을 때 
//	Phone() {
//		
//	}
	
	//생성자 선언
	Phone(String model) {
		this(model, 100, 3000);	//내 클래스내에 있는 다른 생성자 호출
//		this.model = model;
//		this.price = 100;
//		this.battery = 3000;
		
	}
	
	Phone(String model, int price) {
		this(model, price, 3000);
//		this.model = model;
//		this.price = price;
//		this.battery = 3000;
	}
	
	Phone(String model, int price, int battery) {
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	
	
	
	
	//메소드
}
