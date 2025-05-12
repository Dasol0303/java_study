package study.practice.practice41;

public class Supplies extends Furniture{ //용품
	
}

class Dust extends Furniture{ //쓰레기통 
	boolean isOpen;
	double capacity; //버리려는 쓰레기의 양
	double remainTrash; //현재 쓰레기통 안의 쓰레기 용량
	
	Dust() {}
	Dust(int liter, String color) {
		this.liter = liter;
		this.color = color;
	}
	public void isOpen(boolean isOpen, double capacity) {
		this.isOpen = isOpen;
		this.capacity = capacity;
		
		if(isOpen == true) { 
			dustOpen();
		}
		System.out.println("현재 쓰레기통 안의 쓰레기:" + remainTrash + "L");
	}
	
	public void dustLast() {
		System.out.println("쓰레기를 채운다.");
		System.out.println("쓰레기통을 닫는다.");
	}
	public void dustOpen() {
		System.out.println("쓰레기통을 연다.");
		
		if(liter < capacity) {
			remainTrash += capacity;
			if(remainTrash >= liter) {
				System.out.println("쓰레기를 비운다.");
				capacity = remainTrash - liter;
				remainTrash = 0;
				remainTrash += capacity;
			}
			dustLast();
		}

	}

	public String toString() {
		String str = String.format("쓰레기통{용량:%dL  색상:%s}",liter, color);
		return str;
	}

}

class Cup extends Furniture{ //컵
	Cup () {}
	Cup(int liter, String quality, String color) {
		this.liter = liter;
		this.quality = quality;
		this.color = color;
	}

	public String toString() {
		String str = String.format("컵{용량:%dmL  재질:%s  색상:%s}",liter, quality, color);
		return str;
	}
	
}
