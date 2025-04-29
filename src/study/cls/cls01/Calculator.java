package study.cls.cls01;

public class Calculator {
	//계산기
	
	
	//필드
	String brand;
	//생성자
	
	//메소드 (동작/기능)
	
	/*
	 4가지로 분류 -
	  	리턴		매개변수
	  	O		O
	  	O		X
	  	X		O
	  	X		X
	
	 리턴X : void
	 리턴O : 리턴할 타입
	 */
	
	//리턴X 매개변수X
	//계산기 전원켜는 메소드
	void powerOn() {
		//brand = "agsdg"; 
		//-> 이것처럼 필드 생성어는 같은 클래스 파일 내부에서 불러오기가 가능하나 
		//main클래스 파일에서는 'brand.(클래스명)' 으로 불러와야함
		System.out.println("Power On!!");
		//return; //-> 메소드 종료 의미. 
		//단, 정해진 타입이 없기 때문에 return;까지만 적기 가능
	}
	
	//리턴X 매개변수O
	//원하는 밝기 수치를 받아서 밝기 조절기능 메소드
	//밝기 : 1 ~ 10 가정
	void setBrightness(int bright) {
		System.out.println("밝기수치 " + bright + "로 조정합니다.");
	}
	
	//리턴O 매개변수X -> 리턴이 있어서 void가 아닌 타입을 씀(ex - int, boolean, String....)
	String getInfo() {
		
		//메소드 실행후 반환(return)할 값을 작성
		
		//return "전자계산기";
		String s = "전자계산기";
		return s;
		//String s = "전자계산기";
	}
	
	//리턴O 매개변수O
	//숫자 2개를 받아서 두 숫자의 합을 반환
	int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
	String sum22(int x, int y) {
		int result = x + y;
		return result + "";
	}
	
	int sum(double x, double y) {
		return (int)(x + y);
	}//-> 리턴할 때 int 변환해야 오류X 단, 소수점 날아가는 거 인지 필요
	
	int sumArr(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	
	
}
