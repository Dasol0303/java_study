package study.practice;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
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


		//while(true) {
		for(int i=0; i<personArr.length; i++) {
			System.out.println("내리는 층 입력 : ");
			int num = scanner.nextInt();

			if(num>=2 && num<=100) {
				//num = scanner.nextInt();
				personArr[i] += num;
				continue;
			}
			if(num>100) {
				num = 0;
				i--;
				System.out.println("없는 층입니다. 다시 입력해주세요.");
				continue;
			}

		}
		//}
		
		//To. 쌤...
		//아니.. 그 이런 배열을 원하긴 했는데 이거 이렇게 찾아서 써도 되는건가요..???
		Arrays.sort(personArr);
        for (int i : personArr) 
            System.out.println(i + "(내림)");
		
		
		
/*
		System.out.println("내리는 층");
		
		
		
		int[] numArr = new int[person];
		//가장 큰 수 하나 빼서 그 수를 numArr[0]에 넣고 그 다음으로는 가장 큰 수 기준으로 비교하고 큰 수대로 넣기?
		//-> 식 중간에 가장 작은 수보다 큰 수가 나오면 얘를 저장하네........?
		//가장 작은 수도 빼야하나.. 아닌 듯..?
		
		int j=0; //가장 큰 수 저장할 공간
		
		for(int i=0; i<personArr.length; i++) {
			if(j<=personArr[i]) {
				j=personArr[i];
			}
		}
		
		numArr[0] = j;
		
		for(int i=0; i<personArr.length; i++) {
			
		}
		
//		for(int i=0; i<personArr.length; i++) {
//			for(int j=person-1; j>=0; j--) {
//				
//				if(personArr[i] > personArr[j]) {
//					numArr[i] += personArr[i];
//					break;
//				}
//				if(personArr[i] <= personArr[j]) {
//					numArr[i] += personArr[j];
//					break;
//				}
//				if(i == personArr.length-1) {
//					
//				}
//				
//			}
//		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(numArr[i] + ("내림"));
		}

//		if(personArr[i] > personArr[j]) {
//			System.out.println(personArr[i] + "(내림)");
//			continue;
//		}
//		if(personArr[i] < personArr[j]) {
//			i--;
//			continue;
//		}
*/
		
		
		
		
		
		
		
	}
	
}
