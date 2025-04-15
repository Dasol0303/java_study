package study.var;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "text";
		
		System.out.println("출력 1");
		System.out.println(s);
		System.out.println("출력 2");
		//				ln = line 줄바꿈 포함
		
		System.out.print("출력 1");
		System.out.print(s);
		System.out.print("출력 2");
		
		System.out.println(); // Enter효과 주려는 의도(줄바꿈)
		
		
		int hour = 12;
		int minute = 36;
		//현재 12시 36분 입니다.
		
		System.out.println("현재 " + hour + "시 " + minute + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n", hour, minute); 
		System.out.printf("현재 %d시 %d분 입니다.\n", minute, hour); 
		//	%d -> int의 자리 맡아두기 후 ,를 사용해 순서대로 들어가려는 int 이름 넣어주기
		
		//System.out.printf("이자는 3.5% 입니다."); //오류
		  System.out.printf("이자는 3.5%% 입니다.\n");
		  
		  String menu = "햄버거";		// %d -> %4d, %-4d = 왼쪽이나 오른쪽 4칸 비우기
		  minute = 48;				// %s
		  double rate = 4.1515;		// %f -> .2%f = 소수점 2번째 자리까지만 보여주겠다
		  		  
		  System.out.printf("오늘 %-4d분에 점심으로 %s를 먹고 은행 이자는 %.2f%%더라~\n", minute, menu, rate);
		
		
		
		
	}

}
