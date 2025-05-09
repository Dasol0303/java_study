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
	
	//가지고 있는 정보를 문자열로 리턴하기-> 출력X	getter, setter의 역할과 비슷하게 정해져있는 개념
	public String toString() {//메소드를 만든게 아니고 재정의 한 거임
		
		//아래 코드 자체를 리턴해도 상관없으나 보기 힘들면 스트링으로 저장 후 리턴도 가능
//		String str = model + " 가격" + price + " 유형:" 
//					+ type + " 연결여부:" + (isConnect ? "O" : "X");
		
		String str = String.format("%s 가격:%d 유형:%s 연결여부:%s", model, price, type, (isConnect ? "O" : "X"));
		return str; 
		//String.format(); -> 위 코드는 문자열로 만들어서 리턴만 한 상태	출력X
		
//		System.out.println(model + " 가격" + price
//				+ " 유형:" + type + " 연결여부:" + (isConnect ? "O" : "X"));
		//							연결여부:false	-> 이건 확인용으로만 체크하기!
		//							연결여부:연결안됨 / O, X-> 사용자에게 보여주는 형태로!
		//System.out.printf("%s 가격:%d 유형:%s 연결여부:%s", model, price, type, (isConnect ? "O" : "X"));
	
	}
	
}
