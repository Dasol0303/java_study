package study.cls.cls04;

public class SingletonMain {

	public static void main(String[] args) {
		
//		Singleton st1 = new Singleton();
//		Singleton st2 = new Singleton();
//		Singleton st3 = new Singleton();
//		Singleton st4 = new Singleton();
		
		Singleton st = null;//->싱글톤이라는 객체의 타입은 저장 가능. 선언까지만 가능
		
		//Singleton ss = new Singleton();
		//ss.singleton
		//st = Singleton.singleton;
		st = Singleton.getInstance();
		
		Singleton st2 = Singleton.getInstance();
		Singleton st3 = Singleton.getInstance();
		//->여러개를 적었지만 객체는 하나
		
	}

}
