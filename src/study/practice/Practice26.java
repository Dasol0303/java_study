package study.practice;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Practice26 {

	public static void main(String[] args) {
		//p1();
		//p2();
		//p3_basicV1();
		//p3_basicV2();
		p3_basicV3();

	}

	public static void p1() {
		Scanner scanner = new Scanner(System.in);
		
		
		int[] menuArr = new int[3];
		String[] nameArr = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] priceArr = new int[3];
		
		System.out.println("==========메	뉴========");
		
		for(int i=0; i<nameArr.length; i++) {
			
		}
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

		for(int i=0; i<personArr.length; i++) {
			System.out.println("내리는 층 입력 : ");
			int num = scanner.nextInt();

			if(num>=2 && num<=100) {
				//num = scanner.nextInt();
				personArr[i] += num;
				continue;
			}
			if(num<=1 && num>100) {
				num = 0;
				i--;
				System.out.println("없는 층입니다. 다시 입력해주세요.");
				continue;
			}
			if(num == 1) {
				i--;
				System.out.println("1층은 현재 층입니다. 다시 입력해주세요.");
			}
			
			if(num == personArr[i]) {
				personArr[num] = 0;
				i--;
				continue;
			}
	
		}
		
		int j=0; //가장 큰 수 저장할 공간

        for(int i=0; i<personArr.length; i++) {
        	if(j<=personArr[i]) {
        		j=personArr[i];
        	}
        }
		
		System.out.println("올라갑니다...");
		
		Arrays.sort(personArr);
        for (int i : personArr) 
            System.out.println(i + "(내림)");
        
        System.out.println();

        
        System.out.println("내려갑니다...");
        
        for(int i=j; i>=1; i--) {
        	System.out.println(i);	
        }
        System.out.println("1층입니다. 다 내리세요.");
		
		
		
	}
	
	public static void p3_basicV1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt();
		
		int[] destFloorArr = new int[personCount]; 
		
		System.out.println("목적지 층수 입력(2~100) : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			//입력한 값이 2~100이 아니면? -> 다시 입력해라
		}
		
		// 1층 ~ 100층 -> 목적지 층수에 멈추기
		
		//v1 : 100층까지 올라가서 내려오기
		
		for(int i=1; i<=100; i++) {
			System.out.println(i + "층");
			
			//내리는 층인지 확인
			for(int j=0; j<destFloorArr.length; j++) {
				if(i==destFloorArr[j]) {
					System.out.println("****도착****");
				}
			}
		}
		
		// 100층 -> 1층
		
		for(int i=100; i>=1; i--) {
			System.out.println(i + "층");
		}
		
		
	}
	
	public static void p3_basicV2() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt();

		int[] destFloorArr = new int[personCount]; 

		System.out.println("목적지 층수 입력(2~100) : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			//입력한 값이 2~100이 아니면? -> 다시 입력해라
		}

		// 1층 ~ 100층 -> 목적지 층수에 멈추기
		//v2 : 입력층 중에서 최대층까지만 가고 내려오기
		
		//입력 층 중에서 최대값 구하기
		int maxFloor = destFloorArr[0];
		for(int i=0; i<destFloorArr.length; i++) {
			if(maxFloor < destFloorArr[i]) {
				maxFloor = destFloorArr[i];
			}
		}
		
		for(int i=1; i<=maxFloor; i++) {
			System.out.println(i + "층");

			//내리는 층인지 확인
			for(int j=0; j<destFloorArr.length; j++) {
				if(i==destFloorArr[j]) {
					System.out.println("****도착****");
				}
			}
		}

		// 100층 -> 1층
		System.out.println("====내려갑니다.====");
		for(int i=maxFloor; i>=1; i--) {
			System.out.println(i + "층");
		}
	}
	
	public static void p3_basicV3() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt();

		int[] destFloorArr = new int[personCount]; 

		System.out.println("목적지 층수 입력(2~100) : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			//입력한 값이 2~100이 아니면? -> 다시 입력해라
		}

		// 1층 ~ 100층 -> 목적지 층수에 멈추기
		//v2 : 입력층 중에서 최대층까지만 가고 내려오기
		
		//입력 층 중에서 최대값 구하기
		int maxFloor = destFloorArr[0];
		for(int i=0; i<destFloorArr.length; i++) {
			if(maxFloor < destFloorArr[i]) {
				maxFloor = destFloorArr[i];
			}
		}
	/*		
		int floor = 1;
		boolean isUp = true;	//isUp true 올라가는중		false 내려가는중
		//true와 false로 처리하는 타입을 flag라고 이름지음
		while(true) {
			
			System.out.println(floor + "층");
			
			//100층까지 다 올라갔으면? 내려가는 방향으로 설정
			if(floor >= 100)
				isUp = false;
			
			if(floor <= 1 && isUp == false)
				break;
			
			//isUp 값에 의해 +1 -1 결정
			if(isUp)
				floor++;
			else
				floor--;
			
//			if(floor <= 0)
//				break;
		}
	*/
		int floor = 1;
		int flow = 1;	//flow : 1 -1	층의 진행 방향을 의미, 층 값 변화 연산에 참여
		//flow : 1=한층 증가	-1=한층 감소
		
		//도착 층 표시
		//1~100층 -> 100층 -> 1층
		//1~최대층 -> 최대층 -> 1층
		
		
		while(true) {
			
			System.out.println(floor + "층");
			
			//내리는 층인지 확인
			if(flow == 1) {
				for(int j=0; j<destFloorArr.length; j++) {
					if(floor==destFloorArr[j]) {
						System.out.println("****도착****");
					}
				}
			}

			//100층까지 다 올라갔으면? 내려가는 방향으로 설정
//			if(floor >= 100)
			if(floor >= maxFloor)
				flow = -1;
			
			if(floor <= 1 && flow == -1)
				break;
			
			floor += flow;
		}
		
		
	}
}
