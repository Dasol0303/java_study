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
		Mike m3 = new BluetoothMike();// 힙 영역에는 존재하나 스택영역에는 없기 때문에 사용은 불가!
		
		m2.volumeUp();
		m3.volumeUp();
		m3.check(); // 자식 개체의 메소드 불림
		
		bm1.check();
		
		//변수 접근 케이스
		//bm1.model;
		//bm1.getModel();
		//bm1.printInfo();
		
		//BluetoothMike bm2 = new WirelessMike(); -> 불가!
		//BluetoothMike bm2 = new Mike(); -> 불가!
	// 위의 자식 개체가 부모 타입이나 또 다른 자식 타입을 담는 것은 불가!
		
		BluetoothMike bm2 = new BluetoothMike();
		bm2.isConnect = true;
		bm2.model = "성능굿마이크";
		bm2.price = 5000;
		bm2.type = "핀마이크";
		
		String str2 = bm2.toString(); //->정돈된 문자열이 들어옴
		//System.out.println(str2); //->그걸 출력함
		System.out.println(str2 + " 이런 정보있는 마이크 샀음");
		//->String.format에 \n를 하면 안되는 이유 : 불편함 ㅎ
		
		//Mike m3 = new BluetoothMike();
		m3.check();
		System.out.println(m3.toString());
		
		//Mike m2 = new WierlessMike();
		System.out.println(m2.toString()); //재정의 된 메소드가 없어서 X
		
		//Mike m1 = new Mike();
		m1.model = "일반마이크";
		System.out.println(m1.model);
		System.out.println(m1); // 재정의 된 메소드가 없어서 X
		//객체 자체를 출력 -> toString() 결과를 출력
		
		Object o1 = m1; // 모든 클래스의 공통된 부모이기 때문에 모든 애들을 담을 수 있음
		o1 = m2;
		o1 = m3;
		o1 = bm2;
		o1 = bm1;
		
		
	}

}
