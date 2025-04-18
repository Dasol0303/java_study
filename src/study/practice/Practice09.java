package study.practice;

public class Practice09 {

	public static void main(String[] args) {
		
		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복

		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
System.out.println("========for문 1번========");
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
System.out.println("========for문 2번========");
		for(int i=1; i<=9; i++) {
			System.out.println(i);
		}
		
System.out.println("========for문 3번========");
		/*
		int i;
		int x;
		for(i=10; i<=100; i++) {
			i = i * x;
			System.out.println(x);
		}
		*/

// 증감식 안에 i+10만으로는 X -> i=i+10(혹은 i+=10)으로 i의 값을 정해줘야함
		for(int i=10; i<=100; i=i+10) {
			System.out.println(i);
		}
		
System.out.println("========for문 4번========");
		for(int i=25; i<=100; i=i+25) {
			System.out.println(i);
		}

System.out.println("========while문 5번========");
		int i = 50;
		while(i<=55) {
			System.out.println(i);
			i++;
		}

System.out.println("========while문 6번========");
		i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		i=10;
		while(true) {
			System.out.println(i);
			i--;
			if(i==0)
			//if(i<1)	//i==0	i<1 // 
				break;
		}
		
System.out.println("========while문 7번========");
		i=30;
		while(i>=0) {
			System.out.println(i);
			i=i-5;
		}
		
System.out.println("========while문 8번========");
		i=30;
		while(i>=5) {
			System.out.println(i);
			i=i-5;
		}

System.out.println("========while문 9번========");
		i=25;
		while(i>=0) {
			System.out.println(i);
			i=i-5;
		}
	}

}
