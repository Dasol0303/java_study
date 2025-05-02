package study.practice.practice31;
import java.util.Scanner;
public class WeightAfterFiveMonths {
	public static void main (String[] args) {
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("현재 무게와 개월 수 입력 : ");
		double start = scan.nextDouble();
		int after = scan.nextInt();

		// 계산
		double result = weight(start, after);
		//static이 붙어있어서 메소드 호출이 가능!!

		// 결과 출력
		System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
	}

	//----------------------------메소드----------------------------------
	
	// 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
	public static double weight(double currentWeight, int months) {
		
		double expectedWeight = currentWeight;
		
		for (/* 초기값 */int i = 1; /* 조건식 */i<=months; /* 갱신 */i++) {
			expectedWeight += 0.231;
		}
		return expectedWeight;
	}
}
