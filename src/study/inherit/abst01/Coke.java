package study.inherit.abst01;

//콜라
public class Coke extends Beverage{
//	String name;
//	int ml;
	
	public void checkSafety() {
		System.out.println("탄산 당 정상범위 체크");
	}
	public void open() {
		System.out.println("뚜껑 딸깍");
	}
}
