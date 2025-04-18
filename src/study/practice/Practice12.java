package study.practice;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Hint
		i, j 값 변화 추적 -> 규칙 찾기
		print
		println


		※규칙을 찾아보고 작성
		1) 반복문 1개로 결과 만들기
		2)반복문 2개 중첩해서 결과만들기

		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
		12345
		12345
		12345
		12345
		12345

		//2.
		11111
		22222
		33333
		44444
		55555
	*/
		for(int a=1; a<=5; a++) {
			System.out.println("12345");
		}
		
		/*
		for(int a=1; a<=5; a++) {
			System.out.println(""+a+a+a+a+a);
		}
		
		
		for(int b=1; b<=1; b++) {
			int a = 1;
			while(a<=5) {
				System.out.printf("%d%d%d%d%d\n",a,a,a,a,a);
				a++;
			}
		}
		*/
		
		for(int a=1; a<=5; a++) {
			System.out.println(11111*a);
		}
		for(int a=11111; a<=55555; a=a+11111) {
			System.out.println(a);
		}
		
		
		
		
	}

}
