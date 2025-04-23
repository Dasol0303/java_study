package study.practice;
import java.util.Scanner;
public class Practice23 {

	public static void main(String[] args) {
		
//		while(menu==1) {
//		int americano = scanner.nextInt();
//	}
//	while(menu==2) {
//		int cafeLatte = scanner.nextInt();
//	}
//	while(menu==3) {
//		int vaLatte = scanner.nextInt();
//	}
		
		Scanner scanner = new Scanner(System.in);
		
		int americano = 3500;
		int cafeLatte = 4100;
		
		String menu1="1";
		String menu2="2";
		String menu3="3";
		
		System.out.println("메뉴 선택 : ");
		String menu = scanner.nextLine();
		
		if (menu.equals(menu1)) {
			
		} else if (menu.equals(menu2)) {
					
		} else if (menu.equals(menu3)) {
			
		} else {
			System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
		}
		
		
		
		/*
		System.out.println("수량 선택 : ");
		int num = scanner.nextInt();
		
		System.out.println("추가 주문하시겠습니까? : ");
		String word = scanner.nextLine();
		
		if() {
			
		}
		*/

	}

}
