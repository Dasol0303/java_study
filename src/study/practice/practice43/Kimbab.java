package study.practice.practice43;

import java.util.ArrayList;

import study.practice.practice35.Menu;

public class Kimbab extends TruckCalculation{
	
	/*
	 	야채김밥 3800
	 	치즈김밥 4500
	 	돈가스김밥 5000
	 	새우김밥 5000
	 	참치김밥 5000
	 	불고기김밥 5000
	 */
	
	//김밥가게
	int num;
	int menu;
	
	Kimbab() {}
	Kimbab(int menu, int num) {
		this.menu = menu;
		this.num = num;
	}
	
	
	
	public void KimbabMenu() {
		System.out.println("-----------메뉴-----------");
		System.out.println("1. 야채김밥			3800");
		System.out.println("2. 치즈김밥			4500");
		System.out.println("3. 돈가스김밥			5500");
		System.out.println("4. 새우김밥			5000");
		System.out.println("5. 참치김밥			4000");
	}
	public void KimbabPrice() {
		ArrayList<Kimbab> list = new ArrayList<Kimbab>();
		list.add(new Kimbab(1, 3800));
		list.add(new Kimbab(2, 4500));
		list.add(new Kimbab(3, 5500));
		list.add(new Kimbab(4, 5000));
		list.add(new Kimbab(5, 4000));
	}
	
	

	
}

