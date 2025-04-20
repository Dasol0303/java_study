package study.practice;
import java.util.Scanner;
public class Practice13 {

	public static void main(String[] args) {
		// q1();		// O
		// q2();		// O
		// q3();		// O
		// q4();		// O
		// q5();		// O
		 q6();		//
		// q7();		// O
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
		int total = 0;
		
		//int d5 = num % 5 == 0;
		
		for (num=0; num <= 1000; num=num+5) {
			total += num; // -> total에 num을 쌓아가듯이 더하겠다는 의미?
		}
		System.out.println(total);

			
	}

	public static void q4() {
		/*
		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		ex) 입력 : 10
		결과 : **********
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		
		if (num>=1 && num<=50) {
			for (int i=1; i<=num; i++) {
				System.out.printf("*");
			}
		} else {
			System.out.println("1~50까지의 수를 입력해주세요.");
		}
		
	}
	
	public static void q5() {
		/*
		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		ex) 1 - 2 + 3 - 4 .....
		*/
		//even = -2 -4 -6 -8 -10
		//odd = 1 3 5 7 9
		
		int even = 0;
		int odd = 0;
		
		for (int i=0; i <= 0 && i>=-10; i=i-2) {
			even += i;
		}
		for (int i=1; i<=10; i=i+2) {
			odd += i;
		}
		System.out.println(even + odd);

		
	}
	
	public static void q6() {
		/*
		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		*/
		int num = 0;
		int total;
		
		for (total=0; total<=1000; total+=num) {
			num++;
		}
		System.out.println(total);
		
		
		
		
	}
	
	public static void q7() {
		Scanner scanner = new Scanner(System.in);
		/*
		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
		ex) 입력 3
		3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		...
		3 * 9 = 27
		*/
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		
		for (int i=1; i<=9; i++) {
			int total = num * i;
			System.out.println(num + " * " + i + " = " + total);
		}
		
		
	}
	
	

}
