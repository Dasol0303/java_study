package study.practice;
import java.util.Scanner;
public class Prac_01 {

	public static void main(String[] args) {
		//p1();
		p2();

	}

	public static void p1() {
		Scanner scanner = new Scanner(System.in);
		
		
		int[] menuArr = new int[3];
		String[] nameArr = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] priceArr = new int[3];
		
	}
	
	public static void p2() {
		/*
		엘리베이터

		스마트 엘리베이터 시스템을 제작하려고 합니다.
		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
		(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )

		- 기본 문제
		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)

		+ 탑승 인원을 입력받습니다.
		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("탑승인원 입력 : ");
		int person = scanner.nextInt();

		
		int[] personArr = new int[person];

		
		while(true) {
			for(int i=0; i<=personArr.length; i++) {
				System.out.println("내리는 층 입력 : ");
				int num = scanner.nextInt();

				if(num>=1 && num<=100) {
					num = scanner.nextInt();
					personArr[i] += num;
					continue;
				}
				if(num>100) {
					num = 0;
					System.out.println("없는 층입니다. 다시 입력해주세요.");
					continue;
				}

			}
		}
//			if (num>100) {
//				System.out.println("없는 층입니다. 다시 입력해주세요.");
//				continue;
//			}

		
			
			


		
		
		
		
		
		
		
	}
	
}
