package study.var;

import java.util.Scanner;	//Scanner 라이브러리 import(불러온다/가져온다)

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//사용자 입력
		
		Scanner scanner = new Scanner(System.in); 
		//Scanner 생성 (초기 설정)
		//이후에는 scanner. ~ 와 같이 적기
		
		System.out.println("입력");
		String inputData = scanner.nextLine(); 
		//다음 엔터까지 입력된 값 읽어오기 -> console에서 내가 값을 입력하기 전까지는 실행단계 (완료X)
		// console > 빨간 네모에 색이 들어와 있으면 프로그램 실행 중
		
		System.out.println("입력완료");
		System.out.println(inputData);
		
		System.out.print("지금 몇시죠? : ");
		//println이 아닌 print를 사용하면 줄바꿈 없음 표시
		int hour = scanner.nextInt();
		
		
		System.out.printf("아~ 지금 %d시 이군요!\n", hour);
		
		System.out.println("중간고사 평균 점수 입력 : ");
		double mean = scanner.nextDouble();
		System.out.printf("아 %.2f점 이군요~\n", mean);
		
		
		
		
	}

}
