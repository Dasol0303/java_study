package study.practice;
import java.util.Scanner;
public class Practice23_2 {

	public static void main(String[] args) {
		//prac1();
		prac2();
		//prac2_1();

	}
	
	public static void prac1() {
		Scanner scanner = new Scanner(System.in);

		/*
		String addOrder = "y";

		while (!addOrder.equals("n")) {

		}
		 */

		int menu1Count = 0;		//각 메뉴 몇잔 시켰는지 갯수
		int menu2Count = 0;
		int menu3Count = 0;



		while(true) {

			System.out.println("========메 뉴========");
			//			System.out.println("1. 아메리카노 3500원");
			//			System.out.println("2. 카페라떼 4100원");
			//			System.out.println("3. 바닐라라떼 4300원");
			System.out.printf("1.%-8s %5d원\n", "아메리카노", 3500);
			System.out.printf("2.%-8s %5d원\n", "카페라떼", 4100);
			System.out.printf("3.%-8s %5d원\n", "바닐라라떼", 4300);
			System.out.println("====================");


			//메뉴 입력
			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();

			//정상 메뉴 선택 여부! 1,2,3
			if(menu>=1 && menu<=3) {
				//수량 입력
				System.out.print("수량 선택 : ");
				int count = scanner.nextInt();

				//기록!! 무슨 메뉴를 몇잔 시켰나?
				//무슨메뉴? -> menu
				//몇잔? -> count

				if(menu == 1) {
					menu1Count += count;
				} else if (menu == 2) {
					menu2Count += count;
				} else {
					menu3Count += count;
				}


				scanner.nextLine(); //clear

				String addOrder;

				while(true) {
					System.out.print("추가주문 하시겠습니까? (y/n) : ");
					addOrder = scanner.nextLine();

					//y/n 정상입력 여부 체크
					if(addOrder.equals("y") || addOrder.equals("n")) {
						break;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요!!!");
					}
				}

				if(addOrder.equals("n")) {
					//최종 주문한 메뉴 목록 보여주고
					//총금액이 얼마다~
					int total = 0;

					System.out.println("====================");
					if(menu1Count > 0 ) {
						System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count * 3500);
						total = total + menu1Count * 3500;
					}
					if(menu2Count > 0 ) {
						System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count * 4100);
						total = total + menu2Count * 4100;
					}
					if(menu3Count > 0 ) {
						System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu2Count * 4100);
						total = total + menu3Count * 4100;
					}
					System.out.println("====================");
					System.out.printf("총액 : %d원", total);
					break;
				}
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요!!!");
			}


		}
	}
	public static void prac2() {
		Scanner scanner = new Scanner(System.in);
		
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] priceArr = {3500, 4100, 4300};
		
		int[] countArr = new int[3];	//0초기화
		
		int menu;
		int count;
		String addOrder;
		int total = 0;
		
		
		while(true) {	//
			//menuArr[2] priceArr[2] countArr[2]
			System.out.println("========메 뉴========");
			System.out.println(menuArr[0] + "		" + priceArr[0]);
			System.out.println(menuArr[1] + "		" + priceArr[1]);
			System.out.println(menuArr[2] + "		" + priceArr[2]);
			System.out.println("====================");
			
			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();
			if(!(menu>=1 && menu<=3)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요!!!");
				continue;
			}

			System.out.print("수량 선택 : ");
			count = scanner.nextInt();
			if(menu==1) {
				countArr[0] = count;
				total += priceArr[0] * countArr[0];
			}
			if(menu==2) {
				countArr[1] = count;
				total += priceArr[1] * countArr[1];
			}
			if(menu==3) {
				countArr[2] = count;
				total += priceArr[2] * countArr[2];
			}

			scanner.nextLine();

			System.out.print("추가주문 하시겠습니까? (y/n) : ");
			addOrder = scanner.nextLine();
			
			
			
			if(addOrder.equals("n")) {
				total = 0;
			}
			System.out.println("====================");
			for(int i=0; i<menuArr.length; i++) {
				
			}
			
			
			
//			while(true) {
//				System.out.print("추가주문 하시겠습니까? (y/n) : ");
//				addOrder = scanner.nextLine();
//
//				if (addOrder.equals("y")) {
//					break;
//				} else if (addOrder.equals("n")) {
//					System.out.println("====================");
//					if(countArr[0] >= 1) {
//						System.out.println("" + menuArr[0] + "	" + countArr[0] + 
//										  "잔  " + priceArr[0] * countArr[0] + "원");
//					}
//					if(countArr[1] >= 1) {
//						System.out.println("" + menuArr[1] + "	" + countArr[1] + 
//								  "잔  " + priceArr[1] * countArr[1] + "원");
//					}
//					if(countArr[2] >= 1) {
//						System.out.println("" + menuArr[2] + "	" + countArr[2] + 
//								  "잔  " + priceArr[2] * countArr[2] + "원");
//					}
//					System.out.println("총합 : " + total);
//					System.out.println("====================");
//					break;
//				
//				} else {
//					System.out.println("잘못 입력하셨습니다. 다시 입력하세요!!!");	
//				}
//				
//			}
			
			
		}

	}
	
	public static void prac2_1() {
		
		//리팩토링 : 결과의 변경 없이 코드 구조를 재조정

		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] priceArr = {3500, 4100, 4300};

		int[] countArr = new int[3];	// 0 초기화

		Scanner scanner = new Scanner(System.in);
		// menuArr[2] priceArr[2] countArr[2]

		while(true) {

			System.out.println("======메 뉴======");
			for(int i=0; i<menuArr.length; i++) {
				//i: 0 1 2 
				//No:1 2 3 
				System.out.printf("%d.%s \t%d원\n", i+1, menuArr[i], priceArr[i]);
			}
			System.out.println("================");

			//메뉴 입력
			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();

			if( !(menu>=1 && menu <= menuArr.length) ) {	//정상범위가 아니면!
				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
				continue;  //이 코드 이후로 현재턴 실행 생략 -> 다음 턴
			}

			//수량 입력
			System.out.print("수량 선택 : ");
			int count = scanner.nextInt();

			//기록!! 무슨 메뉴를 몇잔 시켰냐? 
			//무슨메뉴? -> menu  1 2 3  -> menuArr[0 1 2]
			//			배열에 접근하는 index : menu - 1 
			//몇잔? -> count
			// countArr 접근하는 index : menu - 1

			countArr[menu-1] += count;	//모든 메뉴에대해 수량 처리하는 코드가 공통 적용

			scanner.nextLine(); //clear

			String addOrder;

			while(true) {
				System.out.print("추가주문 하시겠습니까? (y/n) : ");
				addOrder = scanner.nextLine();

				//y/n 정상입력 여부 체크
				if( !(addOrder.equals("y") || addOrder.equals("n"))   ) {
					System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
				} else {  //정상입력!! y n
					break;
				}
			}

			if(addOrder.equals("n")) {
				//최종 주문한 메뉴 목록 보여주고
				//총금액이 얼마다~
				int total = 0;

				System.out.println("====================");
				//menuArr
				//priceArr
				//countArr 
				for(int i=0; i<menuArr.length; i++) {

					if(countArr[i] > 0) {
						System.out.printf("%-8s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i] * priceArr[i]);
						total = total + (countArr[i] * priceArr[i]);
					}
				}
				System.out.println("====================");
				System.out.printf("총액 : %d원", total);
				break;
			}

		}


		
		
	}

}
