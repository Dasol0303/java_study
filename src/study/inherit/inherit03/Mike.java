package study.inherit.inherit03;

//모든 자바 클래스(객체)는 Object 클래스를 상속 받는다
public class Mike {
			// extends Object-> 숨겨져 있음!!!
	// 그렇다고 extends Object를 명시하면 X -> 상속은 하나만 받을 수 있어서
	
	String model;
	int price;
	String type; // 마이크 유형
	
	public void volumeUp() {
		System.out.println("Mike volumeUp");
	}
	public void check() {
		System.out.println("Mike 기능 check 기능 확인");
	}
	
}
