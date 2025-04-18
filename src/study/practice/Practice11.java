package study.practice;
import java.util.Scanner;
public class Practice11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	/*
		* 윤년이란?
				지구가 태양을 한 번 공전하는 데 걸리는 시간을 일 년으로 두었는데,
				사실은 그 시간이 365일이 아닌 365일 5시간 49분 가량이다.
				일 년에 5시간 49분씩 4 년이 지나면 약 하루가 되는데,
				이를 맞추기 위해 4 년마다 한 번씩 2월을 하루 늘리고 이를 윤년이라 한다.
				단, 이렇게 계산하게 되면 매년 11분 가량이 초과되어 계산된다.
				이는 131년이 지나면 하루(대략 400년에 3일)가 되기 때문에 대부분의 국가에서 반영하는
				그레고리력에서는 400년에 3일을 제외시키기 위해 100년마다 한 번 윤년을 없애고
				400년 마다 다시 하루를 추가해 윤년을 둔다. 정리하면 다음과 같은 방법으로 윤년을 계산할 수 있다.

				☞ 연도가 4로 나누어 떨어지면 윤년이다. ex) 2020년, 2024년, 2028년, ...
				☞ 연도가 100으로 나누어 떨어지면 윤년이 아니다. ex) 2100년, 2200년, 2300년, ...
				☞ 연도가 400으로 나누어 떨어지면 윤년이다. ex) 2000년, 2400년, 2800년, ...

				예를 들면 2000년은 100의 배수이지만 400으로 나누어 떨어지기 때문에 윤년이다.

				년도를 입력받아서 윤년인지 아닌지의 여부를 출력하세요.
	*/
		
		/*
		System.out.print("년도를 입력해주세요. : ");
		int year = scanner.nextInt();
		
		//boolean leapYear = true;
		//boolean NoneLeap = false;
		
		int leapYear = year % 4;
		
		if(leapYear == 0 && ) {
			System.out.print(year + "년 \n" + "윤년입니다.");
			
			if(leapYear > 0)
				System.out.print(year + "년 \n" + "윤년이 아닙니다.");
		}
		*/
		
		/*
		 * 			%4		%100	%400	윤년
		 * 2020		O		X		X		O
		 * 2021		X		X		X		X
		 * 2024		O		X		X		O
		 * 2100		O		O		X		X
		 * 2200		O		O		X		X
		 * 2000		O		O		O		O
		 * 2400		O		O		O		O
		 * */
		
		System.out.print("년도 입력 : ");
		int year = scanner.nextInt();
		
		if(year % 4 == 0) {

			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
					System.out.println("윤년O");
				} else {
					System.out.println("윤년X");
				}

			} else {
				System.out.println("윤년O");
			}
			
		} else {
			System.out.println("윤년X");
		}
		
		
		//-> 위의 식은 간편하게 보여주면 요 아래 식
		if(year % 400 == 0) {
			System.out.println("윤년O");
		} else if(year % 100 == 0) {
			System.out.println("윤년X");
		} else if(year % 4 == 0) {
			System.out.println("윤년O");
		} else {
			System.out.println("윤년X");
		}
		
		//-> ||랑 &&연산 잘하면 중첩연산 가능!!
		
		
		
	}

}
