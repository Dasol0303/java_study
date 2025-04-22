package study.practice;

public class Practice21 {

	public static void main(String[] args) {
		 q1();
		// q2();
		// q3();
		// q4();
		// q5();
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
			}
		}
		
		
		/*
		for(int i=1; i<=5; i++) {
			System.out.print("*");
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		*/
		
	}
	public static void q2() {
		/*
		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
	*/

	}
	public static void q3() {
		/*
		3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6
	*/

	}
	public static void q4() {
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

	}
	public static void q5() {
	/*
		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
	*/

	}
	public static void q6() {
	/*
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
	*/

	}


}
