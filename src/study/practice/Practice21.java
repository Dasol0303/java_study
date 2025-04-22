package study.practice;
import java.util.Scanner;
public class Practice21 {

	public static void main(String[] args) {
		// q1();
		// q2();
		// q3();
		// q4();
		 q5();
		// q6();
	}
	public static void q1() {
	/*
		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*
	*/
		for(int i=1; i<=5; i++) {
			if(i==1) {
				System.out.print("*****\n");
			} else if (i==2) {
				System.out.print("****\n");
			} else if (i==3) {
				System.out.print("***\n");
			} else if (i==4) {
				System.out.print("**\n");
			} else if (i==5) {
				System.out.print("*\n");
			}
		}
		System.out.println();
		
		
		for(int i=1; i<=5; i++) {
			System.out.print("*");
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		
	}
	public static void q2() {
		/*
		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
	*/
		
		for(int a=1; a<=5; a++) {
			System.out.print("*");
			for(int b=1; b<a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		/*
		3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6
	*/
		System.out.println("정수 입력 : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				int j = num / i;
				System.out.println("" + i + " " + j);
			} //헐 break!!! 어케 쓰더라 내일 아침에 학원가서 책 봐야겠다ㅠㅠ
			
			
		}
		

	}
	public static void q4() {
		Scanner scanner = new Scanner(System.in);
	/*
		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5
		*
		**
		***
		****
		*****
		****
		***
		**
		*

		입력 : 3

		*
		**
		***
		**
		*
	*/
		System.out.println("정수 입력 : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print("*");
			
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
		for(int i=1; i<=num; i++) {
			System.out.print("*");
			
			for(int j=1; j<=num-i; j++) {
				System.out.print("*");
			}	
			System.out.println();
		}

		

	}
	public static void q5() {
	/*
		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는? //이거 220인데...
	*/
		
		int total = 0;//1++2 
		int c = 0;
		
		for(int a=1; a<=10; a++) {
			
			for(int b=1; b<=a; b++) {
				c += b;
				total = c + b;
			}
		}
		System.out.println(total);

	}
	public static void q6() {
	/*
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오.
		100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
	*/
		// odd	1 3 5 7 9 ...
		//even	-2 -4 -6 -8 -10 ...
		// 
		
		
		
		

	}


}
