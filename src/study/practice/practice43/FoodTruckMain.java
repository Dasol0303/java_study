package study.practice.practice43;

import java.util.Scanner;

public class FoodTruckMain {

	public static void main(String[] args) {
		
		FoodTruck ft1 = new FoodTruck("오늘분식", "나오뉼");
		
		//메뉴 추가 방식
		Food food = new Food("김밥", 3000);
		//1)
		ft1.addMenu(food);
		//2)
		ft1.addMenu(new Food("떡볶이", 5000));
		//3)
		ft1.addMenu("핫도그", 2000);
		
		ft1.doSales();
		
		
	}

}
