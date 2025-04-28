package study.cls.cls01;

public class Car {
	
	
	//필드 (속성)
	String model;
	String color;
	int price;

	
	//기본 생성자
	//생성자를 작성하지 않아도, 자동으로 만들어지는 생성자
	//-> 클래스 이름하고 같아야함!!
//	Car() {
//		
//	}
	Car() {//매개변수가 없는 생성자
		System.out.println("Car() 생성자 호출됨");
		color = "회색";
	}
	
	//매개변수가 존재하는 생성자
	Car(String c) {//매개변수가 String color인 생성자
		System.out.println("Car(String c) 생성자 호출됨");
		color = c;
	}
	
	Car(String c, int p) {
		System.out.println("Car(String c, int p) 생성자 호출됨");
		color = c;
		price = p;
	}
	
	/*
	Car(int p, String m) {//매개변수가 구분이 될 수 있도록 작성하는 것 = 오버로딩
	//위의 String , int 와 똑같이 순서, 예약어가 같으면 오류가 남. 하나만 읽을 수가 없자나!!!!
		System.out.println("Car(int p, String m) 생성자 호출됨");
		color = m;
		price = p;
	}
	*/
	
	

	Car(String model, String color, int price) {
			System.out.println("Car(String model, String color, int price) 생성자 호출됨");
		/*
		 같은 이름이면 가장 가까운 것을 먼저 인식함
			model = model;
			color = color;
			price = price;
		*/
			this.model = model;
			this.color = color;
			this.price = price;
		}

	/*
	//아래 식처럼 언더바로도 변수명 구분 가능!! (위랑 같음)
	Car(String _model, String _color, int _price) {
		System.out.println("Car(String model, String color, int price) 생성자 호출됨");
		model = _model;
		color = _color;
		price = _price;

	}
	*/
	
	//메소드

}
