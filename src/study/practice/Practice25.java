package study.practice;
import java.util.Scanner;
public class Practice25 {

	public static void main(String[] args) {
		//qvl_1();
		qvl_2();
		
		/*
			학생 10명의 시험 점수가 다음과 같이 주어졌다고 가정합니다.
			이 점수들을 배열에 저장한 뒤, 다음 조건에 따라 통계를 계산하는 프로그램을 작성하세요.
	
			int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
	
			최고 점수와 최저 점수를 출력하세요.
			평균 점수를 출력하세요.
			80점 이상인 학생의 수를 출력하세요.
	
			출력 예)
	
			최고 점수: 100
			최저 점수: 63
			평균 점수: 82.5
			80점 이상 학생 수: 6명
		*/
		
		
		

	}
	
	public static void qvl_1() {

		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		
		int h=scores[0]; //가장 큰 수 저장 공간
		int l=scores[0]; //가장 작은 수 저장 공간
		int total = 0;
		
		int stScore80 = 0;
		
		//80점 이상 수 저장
		for(int i=0; i<scores.length; i++) {
			if(scores[i] >= 80) {
				stScore80++;
			}
		}

		//최저 최고 값 찾기
		for(int j=0; j<scores.length; j++) {
			if(h<scores[j]) {
				h=scores[j];
			}
			if (scores[j] < l) {
                l = scores[j];
            }
		}
		
		//평균 구하기
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		
		System.out.println("최고 점수 : " + h);
		System.out.println("최저 점수 : " + l);
		System.out.printf("평균 점수 : %.2f\n", (double)total/scores.length);
		System.out.println("80점 이상 학생 수 : " + stScore80);
		
	}
	
	public static void qvl_2() {
		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};

		int h=scores[0]; //가장 큰 수 저장 공간
		int l=scores[0]; //가장 작은 수 저장 공간
		int total = 0;

		int stScore80 = 0;

		for(int i=0; i<scores.length; i++) {
			//80점 이상 수 저장
			if(scores[i] >= 80) {
				stScore80++;
			}
			//최저 최고 값 찾기
			if(h<scores[i]) {
				h=scores[i];
			}
			if (scores[i] < l) {
				l = scores[i];
			}
			//평균 구하기
			total += scores[i];
		}

		System.out.println("최고 점수 : " + h);
		System.out.println("최저 점수 : " + l);
		System.out.printf("평균 점수 : %.2f\n", (double)total/scores.length);
		System.out.println("80점 이상 학생 수 : " + stScore80);

		
	}

}
