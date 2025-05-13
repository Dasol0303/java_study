package study.inter.interface01;

public interface Interface01 {

	//필드XX -> 변수 선언(상수)
	static final int TYPE = 500;
	/*static final*/ int CODE = 10;
	
	// -> static final이 자동으로 붙어있는 상태, 필수로 쓸 필요는 없음
	
	//붕어빵 속 토핑 종류
	int FISHBREAD_TOPPING_PPAT = 11;
	int FISHBREAD_TOPPING_SUCREAM = 12;
	int FISHBREAD_TOPPING_PIZZA = 13;
	int FISHBREAD_TOPPING_KIMCHI = 14;
	
	//생성자 -> XXX
	
	//메소드 -> 추상 메소드 (선언부분만...)
	
	public abstract void method1();	//추상메소드 -> 자동으로 abstract가 붙어있는 형태로 굳이 써줄 필요X
	public void method2();	//추상메소드
	
	
	
	
}
