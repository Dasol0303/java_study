package study.cond;

public class Conditional03 {

	public static void main(String[] args) {
		// 조건문 switch -> 입력값이 같은가?를 구분하는 식 /표현 가능한 식이 if문에 비해 떨어지는 편
		
		int dice =2;
		
		if(dice >= 1 && dice <= 3) {
			
		}
		
		switch(dice) {
		case 1:		// dice == 1
			System.out.println("dice 값이!!!!");
			System.out.println("1이다");
			break;
		case 2:		// dice == 2
			System.out.println("2이다");
			break;
		case 99:	// dice == 99
			System.out.println("99이다");
			break;
		default:	//else
			System.out.println("default 다");
			
		}
		
		dice =99;
		switch(dice) { // java 14 17버전부터 가능한 코드-> 사용X
		case 1 -> System.out.println("1이다");	//break 포함
		case 2 -> System.out.println("2이다");
		case 99 -> System.out.println("99이다");
		default -> System.out.println("default 다");
		}
		
		
		//switch 실수형(double) 사용 가능하나 추천X
		char c = 'c';
		
		switch(c) {
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		default:
		}
		
		String day = "FRI";
		
		switch(day) {		//1.7 버전부터 사용가능한 코드
		case "MON":
		case "TUE":
			//...
		case "FRI":
			System.out.println("금요일입니다.");
			break;
		default :
		}

	}

}
