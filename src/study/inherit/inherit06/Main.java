package study.inherit.inherit06;

public class Main {

	public static void main(String[] args) {
		
		
		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(b);
		d.drive(t);
		
		Bus b2 = takeBus();
		Taxi t2 = takeTaxi();
		
		//Bus b3 = takeTaxi(); -> 불가!!
		//int b3 = "abc"; -> 위 코드는 이거랑 같은 의미!!
		
		Vehicle v = takeTaxi(); //-> 가능! Vehicle을 부모로 두고 있기 때문에!!
		Vehicle v2 = new Taxi();
		Vehicle v3 = takeBus(); //-> 가능!
		Bus b3 = takeBus();
		
		//Bus b4 = takeVehicle();-> 불가!!
		// Bus = Vehicle
		Vehicle v4 = takeVehicle(); //-> 가능!
		//(명시된 걸 따라가야하기 때문에 위 코드보단 여기로!!)
		
		
	}
	
	
	public static Bus takeBus() {
		//Bus b = new Bus();
		return new Bus();
	}
	
	public static Taxi takeTaxi() {
		//Taxi t = new Taxi();
		return new Taxi();
	}
	
	public static Vehicle takeVehicle() {
		//Vehicle v = new Taxi();//-> 가능!
		
		
		//return new Vehicle();//-> 가능!
		return new Bus();
		//return new Taxi();//-> 가능!
	}
	

}
