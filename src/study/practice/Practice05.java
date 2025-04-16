package study.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//1번. num 값을 확인하여 "양수" "음수" "0" 이라고 출력하도록 코드를 작성하세요.
		/*
		int num = 10;
		System.out.println( _______);
		*/
		/*
		int num = 2;
		String numA = (num >= 1) ?  "양수": ((num <= -1) ? "음수" : "0");
		System.out.println(numA);
		*/
		
		int num = 0;
		System.out.println(num > 0 ? "양수" : (num <0 ? "음수" : "0"));
		System.out.println(num == 0 ? "0" : (num>0? "양수" : "음수"));

		//2번. 아래와 같이 프로그램이 진행되면서 숫자 2개를 입력받고 각각의 결과를 출력하세요.
		// ㅇ 모양은 사용자가 입력한 숫자와 계산된 결과입니다.
		// 나누기 결과는 소수점을 포함하여 나타나도록 해주세요.
		/*
		첫번째 숫자를 입력하세요 : ㅇ
		입력한 숫자=ㅇ
		두번째 숫자를 입력하세요 : ㅇ
		입력한 숫자=ㅇ

		더하기 : ㅇ+ㅇ=ㅇ
		뺴기 : ㅇ-ㅇ=ㅇ
		곱하기 : ㅇ*ㅇ=ㅇ
		나누기 : ㅇ/ㅇ=ㅇ
		*/
		Scanner scanner = new Scanner(System.in); 
		
		
		System.out.print("첫번째 숫자를 입력하세요. : ");
		int x = scanner.nextInt();
		System.out.println("입력한 숫자=" + x);
		System.out.print("두번째 숫자를 입력하세요. : ");
		int y = scanner.nextInt();
		System.out.println("입력한 숫자=" + y);
		
		int pluse = x + y;
		int ma = x - y;
		int go = x * y;
		double na = (double)x / y;
		
		//System.out.println("더하기 : " + x + " + " + y + " = " + (x+y));
		System.out.printf("더하기 : %d + %d = %d\n", x, y, x+y);
		
		System.out.printf("더하기 : %d + %d = %d\n", x, y, pluse);
		System.out.printf("빼기 : %d - %d = %d\n", x, y, ma);
		System.out.printf("곱하기 : %d * %d = %d\n", x, y, go);
		System.out.printf("나누기 : %d / %d = %s\n", x, y, na);
		//System.out.printf("나누기 : %d / %d = %f", x, y, (double)na);
		//					결과값이 실수. -> 실수 문자열 표현을 위해 %f 작성
		// -> 여기서 실수 소수점 표시 기준 작성도 가능= %.2f(=소수점 두개까지 보여주겠음)
		
		
		
	}

}
