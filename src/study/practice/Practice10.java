package study.practice;
import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요. : ");
		int gog = scanner.nextInt();
		System.out.print("영어 점수를 입력해주세요. : ");
		int eg = scanner.nextInt();
		System.out.print("수학 점수를 입력해주세요. : ");
		int ma = scanner.nextInt();
		
		int k = gog + eg + ma;
		double x = (double) k /3;
		boolean m = (gog >= 40 && eg >= 40 && ma >= 40 && x >= 60);
		
		if(m) {
			System.out.println("축하합니다. 합격입니다!");
			System.out.println("국어점수 : " + gog);
			System.out.println("영어점수 : " + eg);
			System.out.println("수학점수 : " + ma);
			System.out.println("평균 : " + x);
			System.out.println("합계 : " + k);
		} else {
			System.out.println("불합격입니다.");
		}	
	}

}
