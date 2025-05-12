package study.inherit.abst01;

//abstract class 추상클래스 -> 상속까지만 기능하게 해줌:
public abstract class Beverage { //음료
	String name;
	int ml;

	public void intro() {
		System.out.println("저는 음료입니다.");
	}
	
	//추상메소드 선언부분만
	//코드 실행부분 구현X
	public abstract void checkSafety();
	//안전검사
	
	//마시기위해서 뚜껑을 열어야 한다!
	public abstract void open();
	
	
}
