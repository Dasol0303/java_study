package study.practice;
import java.util.Scanner;
public class Practice18 {

	public static void main(String[] args) {
		 q1();
		 

	}
	
	public static void q1() {
		Scanner scanner = new Scanner (System.in);
	/*
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.print(" 메뉴 번호를 입력하세요 : ");
		int menu = scanner.nextInt();
		
			if (menu==1) {
				System.out.println(" 입력 메뉴입니다.");
			} else if (menu==2) {
				System.out.println(" 수정 메뉴입니다.");
			} else if (menu==3) {
				System.out.println(" 조회 메뉴입니다.");
			} else if (menu==4) {
				System.out.println(" 삭제 메뉴입니다.");
			} else if (menu==5){
				System.out.println(" 종료 메뉴입니다.");
			} else {
				System.out.println(" 없는 메뉴입니다.");
			}
	*/
		
			//배열
			String[] menuArr = {"입력", "수정", "조회", "삭제", "종료"};
						// 5
			for(int i=0; i<menuArr.length; i++) {	//i: 0 1 2 3 4
				System.out.println((i+1) + ". " + menuArr[i]);
				//	i:0				0+1.			menuArr[0]
				//					1. 입력
				//					2. 수정
			}
			
			System.out.println("메뉴 번호를 입력하세요 : ");
			int menu1 = scanner.nextInt();
			
			if(menu1 >= 1 && menu1 <= 4) {
				System.out.println(menuArr[menu1 - 1] + "메뉴입니다.");
			} else if(menu1 == 5) {
				System.out.println("프로그램이 종료됩니다.");
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
			
			
		
	}
	
		
		
	}
	
	

