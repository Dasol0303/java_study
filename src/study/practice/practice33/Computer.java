package study.practice.practice33;

public class Computer {
	/*
		//4.
		다음을 만족하는 클래스 Computer를 작성하시오.
		· 다음을 상수 필드로 선언
		public … String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
		· 다음과 같은 클래스 Computer의 객체의 사용 결과에 적합하도록 생성
		자와 메소드 구현
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();
		운영체제: 윈도우10, 메인메모리: 16
		운영체제: 애플 OS X, 메인메모리: 32
		운영체제: 안드로이드, 메인메모리: 16
	 */

	public static void main(String[] args) {
		
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();

	}
	//--------------------------속성---------------------
	//static final이 붙으면 변수명을 모두 대문자로 바꾸어야함(추가 확장 내용!! static을 안붙이고 소문자로도 가능!!)
	//	  상수필드 선언 = final (바뀌면 안되는 값)
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};
	int inch;
	int i;

	//--------------------------생성---------------------
	Computer(int i, int inch) {
		this.i = i;
		this.inch = inch;
	}

	//--------------------------메소드---------------------
	public void print() {
		System.out.println("운영체제: " + OS_TYPE[i] + ", 메인메모리: " + inch);
	}
	
}
