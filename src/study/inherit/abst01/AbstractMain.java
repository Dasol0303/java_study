package study.inherit.abst01;

public class AbstractMain {

	public static void main(String[] args) {
		
		Coke c1 = new Coke();
		Tera t1 = new Tera();
		
		c1.name = "코카콜라";
		c1.ml = 310;
		
		t1.name = "테라";
		t1.ml = 500;
		
		c1.intro();
		t1.intro();
		
		//Beverage b1 = new Beverage();
		//추상클래스는 실체화 불가능
		//인스턴스 객체 생성이 불가능
		
		//부모타입변수 = 자식객체
		Beverage[] arr = {c1, t1};
		
		arr[0].checkSafety();
		arr[0].open();
		
		arr[1].checkSafety();
		arr[1].open();
	}

}
