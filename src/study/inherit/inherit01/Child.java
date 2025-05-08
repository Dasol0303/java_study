package study.inherit.inherit01;

public class Child extends Parent {//Parent를 상속받겠다는 의미
	int grade; //학년
	String school; //어디학교
	
	//생성자
	//기본생성자
	//public Child() {}
	
	public Child() {
		//상속받은 부모클래스 생성자
		//super(); ->부모클래스 생성자를 부르는 언어+ 괄호안에 쓰는건 초기값?
		super(0);
		
		//자식에서 해야할 일
		//this(10, "매개변수"); //자기자신의 다른 생성자
	}
	public Child(int money) {
		super(money);// -> 생성자 money에 저장할 값..?
		//this.money = money;
	}
	public Child(int grade, String school) {
		super(0);
		this.grade = grade;
		this.school = school;
	}
	
	public Child(int money, int grade, String school) {
		super(money);
		this.grade = grade;
		this.school = school;
	}
	
	public void play() { //요건 parent 클래스에 없는 메소드이기 때문에 child만 사용가능
		System.out.println("아이들 뛰어놀기");
	}
	
	public void printInfo() {
		System.out.println(grade + "학년 " + school + "다님 돈:" + money);
		System.out.println(age + "나이");//parent가 상속받은 GrandParent의 내용 사용가능 
	}
	
	public void say() { //재정의! 요걸 하게 되면 메인에서 보이던 출력값이 달라짐
		System.out.println("어린이 하는 말");
	}
	
//	public void donate() {
//		System.out.println("한달에 10만원 기부");
//	} -> 부모쪽 클래스에서 final로 바뀌지 못하게 막아두어서 사용불가!
	
}
