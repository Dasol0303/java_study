package study.cls.cls04;

public class Singleton {
	//싱글톤 : 전체~ 에서 1개만 존재
	
	private static Singleton singleton = new Singleton();
	
	//외부에서 생성 방지
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return singleton;
	}//전체에서 하나만 적용하려면 public필요......?
}
