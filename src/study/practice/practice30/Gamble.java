package study.practice.practice30;

import java.util.Random;

public class Gamble {
	public static void main(String[] args) {
		
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		
		System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
		
		//Math.random()

	}


	//---------------------------메소드--------------------------------------------
	
	public static int dice() {
		/* Math.random() 메소드를 활용하여 1~6 사이의 정수를 반환하도록 하
		시오 */		
		Random random = new Random();
		int num = random.nextInt(1, 7);
		
		return num;
	}
	
	public static double exchange(double dollar) {
		/* 입력받은 달러를 환전하여 반환 하시오 */
		double won = dollar * 1082.25108;
		
		return won;
	}


}
