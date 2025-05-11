package study.practice.practice41;

public class Furniture { //가구
	
	String brand; //브랜드
	int liter; //리터
	boolean isTurnOn; //전원유무 or 불켜기 끄기
	boolean isTemp;	//온도조절유무
	int num;//문 갯수 or 화구 갯수
	int trayNum;//트레이 몇 구?
	int price;//가격
	//불세기 조절?
	int width;//가로
	int heigth;//세로
	int depth;//깊이 사이즈
	int remainLiter;//남은 용량
	String quality;//재질
	String color;//색상
	
	
	Furniture() {}

}


class Refrigerator extends Furniture{ //냉장고
	Refrigerator(){}
	Refrigerator(String brand, int liter, boolean isTurnOn, boolean isTemp, int num){
		this.brand = brand;
		this.liter = liter;
		this.isTurnOn = isTurnOn;
		this.isTemp = isTemp;
		this.num = num;
	}
	Refrigerator(int trayNum, int price){//얼음 트레이
		this.trayNum = trayNum;
		this.price = price;
	}
	
	public void iceTray() {
		System.out.printf("얼음 트레이{%d구  가격:%d원}", trayNum, price);
	}
	public String toString() {
		String str = String.format("냉장고{브랜드:%s  용량:%dL  전원유무:%s  온도조절유무:%s  문 갯수:%d개}",
										 brand, liter, isTurnOn ? "O":"X", isTemp ? "온도Up 혹은 down가능":"X", 
										 num, trayNum, price);
		return str;
	}
	
}

class GasRange extends Furniture{ //가스레인지
	GasRange(){}
	GasRange(int num, String brand, int price, boolean isTurnOn) {
		this.num = num;
		this.brand = brand;
		this.price = price;
		this.isTurnOn = isTurnOn;
	}
	

	public void fireTest() {
		if(isTurnOn == true) {
			System.out.println("---------fire test--------");
			System.out.println("불을 켠다."); 
			System.out.println("...불세기 테스트 중...");
			System.out.println("불을 끈다.");
		}
		if(isTurnOn == false) {
			System.out.println("X");
		}
		if(isTurnOn == true && num > 0 && num <= 2) {
			System.out.println("---화력: 중 (일반 원룸 사용 추천)---");
		}
		if(isTurnOn == true && num > 2 && num <= 6) {
			System.out.println("---화력: 강 (일반 가정집 사용 추천)---");
		}
	}
	
	public String toString() {
		String str = String.format("가스레인지{화구갯수:%d구  브랜드:%s  가격:%d원  작동 테스트:%s}",
									num, brand, price, isTurnOn ? "O":"X");
		return str;
	}
	
	
}

class Sink extends Furniture{ //싱크대
	Sink(){}
	Sink(int width, int heigth, int depth, String quality, String color) {
		this.width = width;
		this.heigth = heigth;
		this.depth = depth;
		this.quality = quality;
		this.color = color;
	}
	
	public String toString() {
		String str = String.format("싱크대{가로.세로:%dcm * %dcm  깊이:%dcm  재질:%s  색상:%s}",
				width, heigth, depth, quality, color);
		return str;
	}
	
}
