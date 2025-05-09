package study.inherit.inherit06;

public class Driver { //클래스들 간의 상호관계
//	public void drive(Bus bus) { //메소드 오버로딩 -> 여러개가 선언된!
//		System.out.println("Driver 운전 시작");
//		bus.run();
//	}
//	
//	public void drive(Taxi taxi) { //메소드 오버로딩
//		System.out.println("Driver 운전 시작");
//		taxi.run();
//	}
					//Vehicle vehicle = b; new Bus(); -> 버스 클래스를 b에 담아서 부르기 가능!!
					//Vehicle vehicle = t; new Taxi();
	public void drive(Vehicle vehicle) { //매개변수의 다형성
		System.out.println("Driver 운전 시작");
		vehicle.run();
	}
}
