package study.cls.cls02;

public class Ipad {

	String owner; //주인 소유자
	static String brand = "Apple"; //어디회사 브랜드꺼냐
	// -> 첫번째처럼 작성하면 개별로 생성
	// -> 두번째처럼 작성하면 공통으로 사용(개별 생성X)
	
//	Ipad() {
//		this.brand = "Apple";
//	}
	
	void powerOn() {
		System.out.println("아이패드 전원 켜짐");
		System.out.println(owner + "의 아이패드~");
		this.owner = "주인이름";
		//System.out.println(brand + "에서 만든 아이패드");// 가능!!.
		//check();//가능!!
	}
	
	//밑에 주석처럼 static에서 static 사용 불가!!!!!
	
	static void check() {
		System.out.println(brand + "에서 만든 아이패드");
		//this.owner = "소유주"; -> static은 주체 기준이 없이 호출 -> this 특정 주체를 나타낼수 없다.
		//System.out.println(owner + "의 아이패드~"); //static -> 인스턴스 접근 X
		//System.out.println(Ipad.brand + "에서 만든 아이패드");
		//->외부에서 쓸 때!!
		//powerOn(); -> 요 경우는 말이 안되어서 못 씀.
		
	}
}


//전자기기
//어디회사
//모델명
//종류