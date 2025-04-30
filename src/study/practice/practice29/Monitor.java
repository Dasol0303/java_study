package study.practice.practice29;
//import java.util.Scanner;
public class Monitor {
	//Scanner scanner = new Scanner(System.in);
	
	
	// 속성
	String company;
	int inch;
	int price;
	String color;
	int maxResolutionX;
	int maxResolutionY;
	
	// 생성
	Monitor() {}
	
	Monitor(String _company, int _inch, int _price, String _color) {
		company = _company;
		inch = _inch;
		price = _price;
		color = _color;
	}
	
	Monitor(String _company, int _inch, int _price) {
		company = _company;
		inch = _inch;
		price = _price;
	}

	
	Monitor(String company, int inch, int price, String color, 
			int maxResolutionX, int maxResolutionY) {
		this.company = company;
		this.inch = inch;
		this.price = price;
		this.color = color;
		this.maxResolutionX = maxResolutionX;
		this.maxResolutionY = maxResolutionY;
	}
	
	
	
	// 메소드
	void setXY(int maxResolutionX, int maxResolutionY) {
		this.maxResolutionX = maxResolutionX;
		this.maxResolutionY = maxResolutionY;
		
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	int priceUp (int add) {
		price = add + price;
		return price;
	}
	
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	void printMonitor() {
		System.out.printf("%s %d인치 %d원 %s %d*%d", company, inch, price, color, maxResolutionX, maxResolutionY);
		System.out.println();
	}
	
	
}
