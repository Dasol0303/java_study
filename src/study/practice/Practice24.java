package study.practice;
import java.util.Scanner;
public class Practice24 {

	public static void main(String[] args) {
		//prac1();
		prac2();
	}

	
	public static void prac1() {
		Scanner scanner = new Scanner(System.in);
		/*
			우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
			반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
			각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
			(*가능한 효율적인 구조를 생각해보세요)
	
			ex)
			1반 : 10 10 10 10 10
			2반 : 20 20 20 20 20
			3반 : 30 30 30 30 30
	
			1반 평균 : 10
			2반 평균 : 20
			3반 평균 : 30
			전체 평균 : 20
		*/
		int class1Total = 0;
		int class2Total = 0;
		int class3Total = 0;
		
		int[] class1Arr = new int[5];
		int[] class2Arr = new int[5];
		int[] class3Arr = new int[5];
		
		int[] totlas = new int[3];
		
		System.out.print("1반 : ");
		for(int i=0; i<class1Arr.length; i++) {
			class1Arr[i] = scanner.nextInt();
			class1Total += class1Arr[i];
		}
		
		System.out.print("2반 : ");
		for(int i=0; i<class2Arr.length; i++) {
			class2Arr[i] = scanner.nextInt();
			class2Total += class2Arr[i];
		}
		
		System.out.print("3반 : ");
		for(int i=0; i<class3Arr.length; i++) {
			class3Arr[i] = scanner.nextInt();
			class3Total += class3Arr[i];
		}
		
		
		System.out.printf("1반 평균 : %.2f\n", class1Total/5.0);
		System.out.printf("2반 평균 : %.2f\n", class2Total/5.0);
		System.out.printf("3반 평균 : %.2f\n", class3Total/5.0);
		System.out.printf("전체 평균 : %.2f\n" ,
					(class1Total+class2Total+class3Total)/15.0);
	}
	
	public static void prac2() {
		Scanner scanner = new Scanner(System.in);
		
		int[][] score = new int[3][5];
		
		int total = 0;
		int classTotal = 0;
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1) + "반 : ");
			
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = scanner.nextInt();
			}
		}
		
		int[] totals = new int[3];
		
		
		
	}
}
