package study.inherit.abst01;

//테라 맥주
public class Tera extends Beverage{
//	String name;
//	int ml;
	
	public void checkSafety() {
		System.out.println("알콜 도수 정상범위 체크");
	}
	public void open() {
		System.out.println("병따개로 펑~");
	}
}
