package study.cond;

public class Conditional01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//조건문		if
		int num = 5;
		
		if (num > 10) {
		System.out.println("Hello");
		System.out.println("num이 10보다 크더라~");
	}
		
		if (num <= 20) {
			System.out.println("20보다 작거나 같더라~");
			System.out.println("하하하하하...?");
			System.out.println("덥긴 해..");
		}
		
		if (num!=5) //중괄호가 없으면 조건문 다음 1줄만 if문 범위에 종속됨
			System.out.println("살펴봤더니");
			System.out.println("5는 아니더라~"); //if문 범위에 들어가지 않음
		//{}가 없을 경우 가장 첫번째에 위치한 조건문만 인식
			
		boolean b1 = (num == 5);
		
		//삼항연산자 (조건식) ? 참 : 거짓
		//if (b1) { // 조건문 if (조건식)
		if (b1 == false) {//이 경우 b1이 false일 때 실행하겠다.
			System.out.println("num이 5다.");
		}
			
		//변수의 범위 (지역 변수)
		if (b1) { //true
			System.out.println("b1 조건문 내부 " + num);
			
			int x = 100;
			System.out.println("x= " + x);
		}
		
/*=======================어우 구역 좀 나누자 ============================*/
		
		int x = 200; //-> if문 바깥에서 한 선언이기에 유효한 코드(코드 작성 순서 유의!!)
		System.out.println("x값 확인 : " + x);
		//실행 안됨 -> x의 값은 if문 안에서 지정이 되었기 때문에 그 바깥에서는 인식 X
		
		
		System.out.println("프로그램 끝");
		

	}

}
