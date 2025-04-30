package study.cls.cls02;

public class FinalMain {

	public static void main(String[] args) {
		
		int n = 10;
		
		n = 20;
		n = 30;
		
		//상수화 = 고정된 값
		final int a = 30;
		//a = 50; -> 앞의 final로 인해 불가!!
		//Math.PI
		
		System.out.println(ConstantNumber.TIMEOUT_LIMIT_SECODS);
		
		int myState = 3; //1~3
		
		if(myState == 3) {
			System.out.println("건강하다");
		}

		myState = ConstantNumber.HEALTH_STATE_GOOD;
		
		if(myState == ConstantNumber.HEALTH_STATE_GOOD) {
			//System.out.println("건강하다");
		}
		if(myState == ConstantNumber.HEALTH_STATE_BAD) {
			
		}
		
	}

}
