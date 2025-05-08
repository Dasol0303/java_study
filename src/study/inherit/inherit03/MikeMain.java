package study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
		
		Mike m1 = new Mike();
		m1.volumeUp();// m1에서 해당 메소드 부르기 가능!
		m1.check();
		
		WierlessMike wm1 = new WierlessMike();
		wm1.volumeUp();
		
		BluetoothMike bm1 = new BluetoothMike();
		bm1.volumeUp();
		bm1.volumeUp(5);
		
		Mike m2 = new WierlessMike();
		Mike m3 = new BluetoothMike();// 힙 영역에는 존재하나 영역에는 없기 때문에 사용은 불가!
		
		m2.volumeUp();
		m3.volumeUp();
		m3.check(); // 자식 개체의 메소드 불림
		
		bm1.check();
		
		
		
		//BluetoothMike bm2 = new WirelessMike(); -> 불가!
		//BluetoothMike bm2 = new Mike(); -> 불가!
	// 위의 자식 개체가 부모 타입이나 또 다른 자식 타입을 담는 것은 불가!
		
		
		
		
	}

}
