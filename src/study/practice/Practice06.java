package study.practice;
import java.util.Scanner;
public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		
	
		System.out.print("삼각형의 밑변을 입력해주세요.");
		int width = scanner.nextInt();
		System.out.print("삼각형의 높이를 입력해주세요.");
		int height = scanner.nextInt();
		System.out.printf("삼각형의 넓이 = %s\n", (double)width*height/2);
	
		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		
	
		System.out.print("사다리꼴의 윗변을 입력해주세요.");
		int saU = scanner.nextInt();
		System.out.print("사다리꼴의 밑변을 입력해주세요.");
		int saD = scanner.nextInt();
		System.out.print("사다리꼴의 높이를 입력해주세요.");
		int saH = scanner.nextInt();
		System.out.printf("사다리꼴의 넓이 = %s", (double)(saU + saD)*saH /2);
	
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
	
	
		System.out.print("과자의 갯수 : ");
		int snack = scanner.nextInt();
		System.out.print("인원수 : ");
		int person = scanner.nextInt();
		
		System.out.printf("한 명당 받는 과자의 갯수 = %d\n", snack/person);
		System.out.printf("남는 과자의 갯수 = %d\n", snack%person);
	
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		/*
		158 / 100 = 1.58 -> int로는 1
		158 / 10 = 15.8 -> int로는 15 -> 15 % 10 = 5
		
		158 % 100 = 58
		158 % 10 = 8
		*/
	
		System.out.print("세자리의 정수를 입력해주세요.");
		int x3 = scanner.nextInt();
		System.out.println("백의자리 : " + x3/100
						 + "\n십의자리 : " + (x3/10)%10
						 + "\n일의자리 : " + x3%10);
	

		// 5번. x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		//x와 y를 바꾼 작업
		
		int z = x; //x값 임시 보관
		x = y;
		y = z;
		//
		System.out.println("x="+x+ " y="+y);
	
	}

}
