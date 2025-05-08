package study.inherit.inherit01;

public class Parent extends GrandParent{

	//private int money; -> 자식 클래스에도 적용X
	//public int money;
	protected int money; //protected => 같은 패키지 + 자식 접근가능한 접근제한자
	
	public Parent() {
		System.out.println("Parent() 생성자");
	}
	
	public Parent(int money) {
		this.money = money;
	}
	
	public void say() {
		System.out.println("부모님 말씀");
	}
	
	public final void donate() {
		System.out.println("한달에 100만원 기부");
	}
	
	private void nightMeal() {
		System.out.println("야식먹기");
	}
	
	
	
}
