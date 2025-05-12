package study.practice.practice43.practice43_2;

public class Food {
	String name; //이름
	int menuNum;
	int price; //가격
	int stock; //재고
	
	Food() {}
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		stock = 5; //임시 재고 초기화 (초기에 5개 재고가 있다고 가정)
	}
	public Food(int menuNum, int price) {
		this.menuNum = menuNum;
		this.price = price;
		stock = 5;
		
	
	}

	public String toString() { 
		return String.format("%s 가격:%d원 재고:%d개", name, price, stock);
	}
	
	public String getFoodInfo() { //-> 메소드 이름은 내가 식별하기 좋은 이름으로 바꾸어도 무관!
		return String.format("%s 가격:%d원 재고:%d개", name, price, stock);
	}
	
	//재고 조절(설정)하는 메소드
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//재고 갯수 조정			//modifyStock(5)  modifyStock(-3)
	public void modifyStock(int count) {
		if(stock + count < 0) {
			stock = 0;
		} else {
			this.stock += count;	
		}
		
	}
	
}
