package study.practice.practice45;

public class ExcerciseInstanceof {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		}
		
	} // main
	
	public static void action(Robot r) { //위 클래스가 static이면 얘도 static해야함
		
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}
		
		if(r instanceof SingRobot) {
			SingRobot sb = (SingRobot)r;
			sb.sing();
		}
		
		if(r instanceof DrawRobot) {
			DrawRobot db = (DrawRobot)r;
			db.draw();
		}
		
	}
}

	/*
		메서드명 : action
		기능 주어진 객체의 메서드를 호출한다 : .
		DanceRobot ,인 경우 dance() , 인 경우 를 호출하고
		SingRobot ,인 경우 sing() , 인 경우 을 호출하고
		DrawRobot ,인 경우 draw() . 인 경우 를 호출한다
		반환타입 없음 :
		매개변수: Robot r 인스턴스 또는 Robot 의 자손 인스턴스 
	 */
	

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}


class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}


class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
