package study.inter.interface02;

public class ApplePhone implements Callable, Connectable{

	@Override
	public void call() {
		System.out.println("애플폰 전화통화");
	}

	@Override
	public void connect() {
		System.out.println("애플폰 블루투스 연결");
	}

	@Override
	public void disconnect() {
		System.out.println("애플폰 블루투스 연결종료");
	}

	
}
