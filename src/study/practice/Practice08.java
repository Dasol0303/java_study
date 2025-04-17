package study.practice;
import java.util.Scanner;
public class Practice08 {

	public static void main(String[] args) {
//		prac1();
//		prac2();
//		prac3();
		prac4();
	}
		
		public static void prac1() {
			Scanner scanner = new Scanner(System.in);

			//들여쓰기 정렬
			//영역지정해서 -> Ctrl + i
			//전체영역지정 -> Ctrl + a

			/*
		//1번

		// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.

		//입력에 따른 출력 예시
		26
		"잘못입력했습니다."

		5
		오전입니다.
		이른 오전입니다.

		9
		오전입니다.
		늦은 오전입니다.

		21
		오후입니다.
		늦은오후입니다.
			 */


			System.out.print("시간을 입력해주세요. : ");
			int clock = scanner.nextInt();

			if (clock >= 1 && clock <= 24) {
				if (clock >= 1 && clock <= 12 ) {
					if (clock >= 1 && clock <= 6) {
						System.out.println(clock + "\n오전입니다.\n" + "이른 오전입니다.");
					}
					if (clock >= 7 && clock <= 12) {
						System.out.println(clock + "\n오전입니다.\n" + "늦은 오전입니다.");
					}
				}

				if (clock > 12 && clock <= 24) {
					if (clock >= 13 && clock <= 18) {
						System.out.println(clock + "\n오후입니다.\n" + "이른 오후입니다.");
					}
					if (clock >= 19 && clock <= 24) {
						System.out.println(clock + "\n오후입니다.\n" + "늦은 오후입니다.");
					}
				} 
			}
			else {
				System.out.println("잘못입력했습니다.");
			}
		}
		
		
		public static void prac2() {
			/*
		//2번 아래 코드를 if문으로 변경

		int diceNum = 3; //주사위 수 1~6

		// if문 변환
		switch(diceNum) {
		case 1: // diceNum == 1
		System.out.println("1");
		break;
		case 2:
		System.out.println("2");
		break;
		case 3:
		System.out.println("3");
		case 4:
		System.out.println("4");
		case 5:
		System.out.println("5");
		break;
		default:
		System.out.println("6");
		//case 6:
		}
			 */


			int diceNum = 8;

			if (diceNum == 1) {
				System.out.println("1");
			} else if (diceNum == 2) {
				System.out.println("2");
			} else if (diceNum == 3) {
				System.out.println("3");
				System.out.println("4");
				System.out.println("5");
			} else if (diceNum == 4) {
				System.out.println("4");
				System.out.println("5");
			} else if (diceNum == 5) {
				System.out.println("5");
			} else {
				System.out.println("6");
			}

		}

		public static void prac3() {
			/*
		//3번 아래 코드를 swtich 문으로 변경


		//String 값 비교
		//localNum == "031" 비교X
		//localNum.equals("031") 비교O	true/false


		String localNum = "031";
		// switch 문으로 변경
		if ( localNum.equals("031") ){	//equals -> 수학...!
		System.out.println("경기도입니다");
		}
		if ( localNum.equals("02") ){
		System.out.println("서울입니다.");
		}
		if ( localNum.equals("041") ){
		System.out.println("충남입니다");
		}
		if ( localNum.equals("051") ){
		System.out.println("부산입니다");
		}
			 */
			String localNum = "0545";
			switch(localNum) {
			case "031": System.out.println("경기도입니다.");
			break;
			case "02": System.out.println("서울입니다.");
			break;
			case "041": System.out.println("충남입니다.");
			break;
			case "051": System.out.println("부산입니다.");
			break;
			}
			//default: -> 위의 if문과 같게 하려면 default값에 출력값 넣으면 X
		}

		public static void prac4() {
			Scanner scanner = new Scanner(System.in);
			
		//4번 아래 코드를 switch 문으로 변경
		// *** switch 문은 범위를 지정할 수 없습니다.
		// 결과 값만 동일하게 나오도록 만들어보세요.
		// 단, 점수는 100점까지로 간주합니다.
		// 점수는 0~100 점 중에 score로 주어진다.
		
		int score = 45;
			
		if( score >= 90) {
		System.out.println("학점 A");
		} else if ( score >= 80) {
		System.out.println("학점 B");
		} else if (score >= 70) {
		System.out.println("학점 C");
		} else if (score < 70) {
		System.out.println("학점 F");
		}
			
		
		

		switch(score) {
		case 100: System.out.println("학점 A");
		case 99:
		case 98:
		case 97:
			//91~96
		case 90: System.out.println("학점 A");
			break;
			//...A
		case 89:
		case 88:
			//...B
		case 80: System.out.println("학점 B");
			break;
		default:
			
			
			
			//90~99
			//80~89
			//70~79
			//십의자리수가 7 8 9 C B A
			//90 / 10 = 9
			//95 / 10 = 9
			//99 / 10 = 9
			//100 / 10 = 10
			
			int num10 = score/10;
			switch(num10) {
			case 10:
			case 9: //90~99
				System.out.println("학점 A");
				break;
			case 8: 
				System.out.println("학점 B");
				break;
			case 7: 
				System.out.println("학점 C");
				break;
			default: //F
				System.out.println("학점 F");
			}
			
		}
	}


}

