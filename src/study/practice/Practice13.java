package study.practice;
import java.util.Scanner;
public class Practice13 {

	public static void main(String[] args) {
		// q1();
		// q2();
		 q3();
		// q4();
		// q5();
		// q6();
		// q7();
	}
	public static void q1() {
		Scanner scanner = new Scanner(System.in);
		//1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
	}
	
	public static void q2() {
		//2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		
		if (num % 7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("아닙니다.");
		}
		
		
	}
	
	public static void q3() {
		//3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		int num;
		int total = num*5;
		int i;
		
		for(num=1; num<=1000; num=num*5) {
			while (i<=total) {
				i=total + total;
			}
		}
		
		
			
	}

	public static void q4() {
		/*
		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		ex) 입력 : 10
		결과 : **********
		*/
	}
	
	public static void q5() {
		/*
		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		ex) 1 - 2 + 3 - 4 .....
		*/
		
		
	}
	
	public static void q6() {
		/*
		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		*/
		
		
	}
	
	public static void q7() {
		/*
		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
		ex) 입력 3
		3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		...
		3 * 9 = 27
		*/
		
		
	}
	
	

}
