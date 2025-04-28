package study.test;
import java.util.Scanner;
import java.util.Random;
public class Test01 {

	public static void main(String[] args) {
		//basic();
		//level1();
		//level2();
		level3();
	}

	public static void basic() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int threeOut = 0;

		System.out.println("====야구 게임 시작====");
		while(true) {
			int comNum = random.nextInt(1, 11);
			System.out.println("숫자를 입력해주세요.(1~10) : ");
			int num = scanner.nextInt();
			if(!(num>=1 && num<=10)) {
				System.out.println("1부터 10까지 골라주세욤.");
				continue;
			}
			System.out.println("투수		사용자\n");
			
			if(num == comNum) {
				threeOut++;
				System.out.printf("%d		%d		%d아웃\n",
						comNum, num, threeOut);
			}
			
			if(num != comNum) {
				System.out.printf("%d		%d		안타\n",
						comNum, num);
			}
			if(threeOut == 3) {
				System.out.println("===3아웃 게임 종료===");
				break;
			}
		}
		
		
	}


	public static void level1() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int threeOut = 0;
		int[][] countPlay = new int[3][3];
		int play = 1;
		
		System.out.println("====야구 게임 시작====");
		
		for(int i=0; i<countPlay.length; i++) {
			
			
			for(int j=0; j<countPlay.length; j++) {
				int comNum = random.nextInt(1, 11);
				
				System.out.println("숫자를 입력해주세요.(1~10) : ");
				int num = scanner.nextInt();
				if(!(num>=1 && num<=10)) {
					System.out.println("1부터 10까지 골라주세욤.");
					continue;
				}
				System.out.println(play + "회 투수		사용자\n");
				
				if(num == comNum) {
					threeOut++;
					System.out.printf("%d		%d		%d아웃\n",
							comNum, num, threeOut);
				}
				if(num != comNum) {
					System.out.printf("%d		%d		안타\n",
							comNum, num);
				}
				if(threeOut == 3) {
					threeOut = 0;
					System.out.println("3아웃		" + play + "회 종료");
					play++;
					break;	
				}
			}
			if(i==2 && threeOut==3) {
				System.out.println("===3회 3아웃 게임 종료===");
				break;
			}
		}
		
		
	}

	public static void level2() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String[] name = {"곰", "토끼", "너구리", "뱀", "고양이", "강아지", "불독", "배고픔", "어휴"};
		int threeOut = 0;
		int[][] countPlay = new int[3][3];
		int play = 1;
		int outTotal = 0;//아웃 세는 용도

		for(int i=0; i<name.length; i++) {
			System.out.println(name[i] + "	출격!!!!!");
			
			int comNum = random.nextInt(1, 11);

			System.out.println("숫자를 입력해주세요.(1~10) : ");
			int num = scanner.nextInt();
			if(!(num>=1 && num<=10)) {
				System.out.println("1부터 10까지 골라주세욤.");
				continue;
			}
			System.out.println(play + "회 투수		사용자\n");
			
			if(num == comNum) {
				threeOut++;
				System.out.printf("%d		%d		%d아웃\n",
						comNum, num, threeOut);
			}
			
			if(num != comNum) {
				System.out.printf("%d		%d		안타\n",
						comNum, num);
			}
			
			if(threeOut == 1) {
				outTotal++;
			}
			if(i==8) {
				i=-1;
			}
			if(outTotal == 3 && play == 3) {
				threeOut = 0;
				System.out.println("3아웃		" + play + "회 종료");
				play++;
				break;	
			}
			
		}
		
	}

	public static void level3() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String[] name = {"곰", "토끼", "너구리", "뱀", "고양이", "강아지", "불독", "배고픔", "어휴"};
		int threeOut = 0;
		int[][] countPlay = new int[3][3];
		int play = 1;
		int outTotal = 0;//아웃 세는 용도

		int taYou = 0; //타율
		int anta = 0; //안타
		int taNum = 1; //타석수
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i] + "	출격!!!!!");
			taYou = anta/taNum;
			System.out.println("타순 : " + taNum + "	타율 : " + taYou);
			
			int comNum = random.nextInt(1, 11);

			System.out.println("숫자를 입력해주세요.(1~10) : ");
			int num = scanner.nextInt();
			if(!(num>=1 && num<=10)) {
				System.out.println("1부터 10까지 골라주세욤.");
				continue;
			}
			
			System.out.println(play + "회 투수		사용자\n");
			taNum++; //타석수 증가 휘둘렀자나...
			
			if(num == comNum) {
				threeOut++;
				System.out.printf("%d		%d		%d아웃\n",
						comNum, num, threeOut);
			}
			
			if(num != comNum) {
				System.out.printf("%d		%d		안타\n",
						comNum, num);
				anta++;
				
			}
			
			
			if(threeOut == 1) {
				outTotal++;
			}
			if(i==8) {
				i=-1;
			}
			if(outTotal == 3 && play == 3) {
				threeOut = 0;
				System.out.println("3아웃		" + play + "회 종료");
				play++;
				break;	
			}
			
		}
	}

}
