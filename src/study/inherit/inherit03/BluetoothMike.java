package study.inherit.inherit03;

public class BluetoothMike extends Mike{
	// is a ~ 사용해서 블루투스 마이크는 마이크다! 같은 형태로 연결
	boolean isConnect;
	
	public void connect() {
		System.out.println("블루투스 연결");
	}
	
	//메소드 재정의 (오버라이딩)
	public void volumeUp() {
		System.out.println("BluetoothMike volumeUp");
	}
	
	//메소드 추가로 정의 (오버로딩)-> 메소드 이름은 같으나 인식하는 매개변수가 달라서
	public void volumeUp(int num) {
		System.out.println(num + "만큼 volumeUp");
	}

	public void check() {
		System.out.println("기능 확인");
	}
	
	
}
