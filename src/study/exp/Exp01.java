package study.exp;

import java.util.Scanner;

public class Exp01 {

	public static void main(String[] args) {
		
		//예외처리
		
		//일반예외				/	실행예외
		//컴파일Exception		/	런타임Exception
		//CheckedException	/	UnCheckedException
		
		Temp t1 = new Temp();
		Temp t2 = null;
		
		t1.t = 100;
		
		if(t2 != null)	//개념적인 예외처리
			t2.t = 200;
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("숫자를 입력하세요 : ");
		
		int input = 0;
		
		/*
		// 1회성 입력 기회를 주는 예외처리 
		 
		try {
			//int input = scanner.nextInt();
			//try 지역변수 input 외부에서 접근 불가능
			
			input = scanner.nextInt();
		} catch(Exception e) {
			//별 의미없이 안에 아무것도 안적을 수도 있음!
			
			//e.printStackTrace(); 
			//발생하는 이벤트 찝어두기(이거 없으면 밑에 finish 출력문 안나옴!)
			
			System.out.println("숫자로 좀 입력하시죠?");
			scanner.nextLine();
			input = scanner.nextInt();
		}
		*/
		
		
		while(true) {
		
			try {
				
				System.out.println("숫자를 입력하세요 : ");
				input = scanner.nextInt(); //숫자로 받기
				scanner.nextLine(); //clear
				break;
				//제대로 입력했을 때 break!!
				
			} catch(Exception e) {
				
				System.out.println("숫자로 좀 입력하시죠?");
				scanner.nextLine();
			}
		}
		
		//문자로 입력 받기 -> 숫자로 변환하기
		System.out.println("숫자를 입력하세요 : ");
		String s = scanner.nextLine(); //"123" "12wef"
		
		
		//String -> int
		try {
			System.out.println("parseInt전");
			input = Integer.parseInt(s);
			System.out.println("parseInt후");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace(); 
		} finally {
			System.out.println("this is finally");
		}
		
		
		System.out.println("입력한 값 : " + input);
		
		System.out.println("************Finish************");

		//instance of
		P p = new C();
		C c = (C)p;
		
		P p2 = new P();
		C c2 = (C)p2; //ClassCastException
		
		
		
		
	}

}


class Temp {
	int t;
}

class P {
	
}

class C extends P {
	
}








