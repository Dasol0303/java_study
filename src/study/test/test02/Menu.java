package study.test.test02;

import java.util.Random;
import java.util.Scanner;

public class Menu {
	int menu;
	boolean isStart;
	
	int tryNum; //시도횟수
	int rouletteNum; //룰렛넘버
	int score; //점수
	
	int money; //금액
	int totalMoney; //매출 
	
	
	String id;
	String brand;
	
	Menu() {}
	Menu(String id, String brand) {
		this.id = id;
		this.brand = brand;
	}

	
	public void mainmenu() {
		Scanner scanner = new Scanner(System.in);
		isStart = true;
		
		System.out.println();
		System.out.printf("===%s  %s게임===",id, brand);

		while(isStart) {
			int menu = moveMenu();
			
			switch(menu) {

			case 1:
				moneyCharging();
				break;
			case 2:
				randomGame();
				break;
			case 3:
				sales();
				break;
			}	

		}

	}

	public int moveMenu() { //메뉴
		Scanner scanner = new Scanner(System.in);

		int menu = 0;
		
		while(true) {
			System.out.println();
			System.out.println("1.금액충전  2.게임시작  3.마감(종료)");
			System.out.print("입력 : ");
			menu = scanner.nextInt();
			
			if(menu >= 1 && menu <= 3) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
				System.out.println("보기 중에 선택하세요(1~3)");
			}
		}
		return menu;
	}
	
	
	public void moneyCharging() { //충전 -> 1번
		Scanner scanner = new Scanner(System.in);
		if(tryNum > 0) {
			System.out.println();
			System.out.println("게임시작 횟수가 충분합니다 게임하러 가세요..");
			mainmenu();
		}
		
		while (true) {
			System.out.println();
			System.out.print("충전 금액을 입력해주세요. : ");
			money = scanner.nextInt();
			
			if(!(money % 1000 == 0)) {
				System.out.println("1000원 단위로 입력해주세요.");
			} else {
				break;
			}
		}
		
		totalMoney += money;
		tryNum += money/500;
		
		System.out.printf("충전되었습니다.{충전 금액 :%d}  {게임가능횟수:%d}", money, tryNum);
		
		
	}

	public void randomGame() { //숫자 뽑기 -> 2번
		
		int success = 0;
		int fail = 0;
		
			Random random = new Random();
			
			while (tryNum > 0) {
				rouletteNum = random.nextInt(1, 7); //1~6
				
				if(rouletteNum > 0 && rouletteNum < 5) {
					score += rouletteNum;
					tryNum--;
					System.out.printf("성공! 뽑은 숫자:%d {현재점수:%d  게임가능횟수:%d}\n",rouletteNum, score, tryNum);
					success++;
				}
				if(rouletteNum == 5 && rouletteNum == 6) {
					tryNum--;
					System.out.printf("실패!! 뽑은 숫자:%d {현재점수:%d  게임가능횟수:%d}\n",rouletteNum, score, tryNum);
					fail++;
				}
			}
			if(tryNum == 0) {
				System.out.println("게임 가능 횟수 : 0 (충전 후 다시 시작해주세요.)");
			}
			
			System.out.println();
			System.out.printf("{총합 점수:%d} 성공 횟수:%d  실패 횟수:%d", score, success, fail);
			System.out.println();
	}
	
	public void sales() { // 마감 -> 
		System.out.println("=========게임 종료==========");
		System.out.printf("최종 매출액 : %d  남은 잔여 횟수:%d\n",totalMoney, tryNum);
		System.out.println("==========================");
		
		isStart = false;
	}
	
	
}

