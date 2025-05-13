package study.inter.interface02;

public interface Callable { //전화받기 관련 인터페이스?
	
	public int CALL_ON = 1;// -> 통화중이 아니면 1
	public int CALL_OFF = 2;// -> 통화중이면 2
	
	public void call();
	//abstract
}
