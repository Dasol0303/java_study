package study.practice.practice47;

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		int total = (int) (price - (price * 0.1));
		return total;
	}
}


class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		int total = (int) (price - (price * 0.2));
		return total;
	}
}



class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		int total = (int) (price - (price * 0.3));
		return total;
	}
}