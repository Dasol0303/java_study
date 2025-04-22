package study.practice;
import java.util.Scanner;
public class Practice20 {

	public static void main(String[] args) {
		// q1();
		// q2();
		// q3();
		 q4();
	}
	
	public static void q1() {
		/*
		1.
		2x + 4y = 10 이 만족하는
		모든 x, y 쌍을 구하시오.
		(x와 y는 자연수 1~10)
		*/
		int x=1;
		int y=1;

		for(x=0; x<=5; x++) {
				int j=(2*x)+4;
			
				if(j<=10 && j==10) {
				System.out.println(x + ", " + y);
			}
		}
		
		x=1;
		y=1;
		
		for(y=0; y<=5; y++) {
				int j=2+(4*y);
			
				if(j<=10 && j==10) {
				System.out.println(x + ", " + y);
		}
	}
		
		/*
		for(int i=0; i <= 10; i=(2*x)+(4*y)) {
			x++;
			y++;
			i=(2*x)+(4*y);
			if(i<=10 && i==10) {
				System.out.println(x + ", " + y);
			}

		}
		*/

		//System.out.println(x, y);

		
	}
	public static void q2() {
		Scanner scanner =new Scanner(System.in);
		/*
		 2.
			정수 2개를 입력 받아서,
			아래 계산 결과를 출력하시오.
			큰수 - 작은수
		 */
		System.out.println("정수 2개 입력 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>b) {
			System.out.printf("%d - %d = %d\n", a, b, a - b);
		} else if(a<b) {
			System.out.printf("%d - %d = %d\n", b, a, b - a);
		} else {
			System.out.println(b + "=" + a);
		}

		
			
	}
	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		/*
		 3.
			윷놀이 게임
			4개의 윷을 입력받고 결과를 출력하시오.
			(뒷도는 없습니다!)
			0 : 안 뒤집어진 상태
			1 : 뒤집어진 상태
			ex) 입력 0 0 1 0
			결과 도
			입력 0 1 0 1
			결과 개
		*/
		
		int[] yutArr = new int[4];
		
		//전제조건 : 무조건 0 아니면 1 만 정상적으로 입력하는 상황이다!!
		System.out.println("윷 입력(1이면 뒤집어짐, 0이면 안뒤집어짐): ");
		for(int i=0; i<yutArr.length; i++) {
			yutArr[i] = scanner.nextInt();
		}
		
		//입력 값이 0 or 1 범위 안에서 입력이 되었는가?
		int sum = 0;
		for(int i=0; i<yutArr.length; i++) {
			sum = sum + yutArr[i];	// 0 + 0 + 1 + 1
		}
		
		/*
		int sum = 0;
		
		for(int i=0; i<yutArr.length; i++) {
			yutArr[i] = scanner.nextInt();
			sum = sum + yutArr[i];	
		}
		 */
		
		switch(sum) {
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		//case 0:
		default:
			System.out.println("모");
			break;
		}
		

		
	}
	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		/*
		4. 입력받은 수 만큼 별 출력하기
			ex) 4
			 ****
			5
			 *****
		*/
		System.out.print("숫자 한개 입력 : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		int i = 1;
		while(i<=num) {
			System.out.print("*");
			i++;
		}
		
	}

	
	
}
