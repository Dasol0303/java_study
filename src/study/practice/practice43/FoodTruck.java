package study.practice.practice43;

import java.util.Scanner;

public class FoodTruck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//메뉴 보여주기
		Kimbab kimbab = new Kimbab();
		kimbab.KimbabMenu();
		//주문 입력받기
		System.out.print("메뉴 입력:");
		int menuNum = scanner.nextInt();
		System.out.print("갯수 입력:");
		int num = scanner.nextInt();
		
		//재고 출력
	}
	
}
