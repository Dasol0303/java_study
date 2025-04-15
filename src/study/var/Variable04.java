package study.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열 -> 숫자
		String s1 = "1231";
		
		int n1 = 50;
		System.out.println(s1+n1);
		
		// 숫자형 String -> int 
		
		int n2 = Integer.parseInt(s1);
			//	 Integer.parseInt(문자열); 문자열을 int형 숫자로 변환
		
		System.out.println(n1 + n2);
		System.out.println(n1 + Integer.parseInt(s1));
							//  숫자변환 선언없이 바로 위처럼 계산 직전에 넣어주기 가능
							//	단, 문자열이 숫자여야만 가능
		
		String s2 = "13.13";
		double d1 = Double.parseDouble(s2);
				//  Double.parseDouble(문자열); 문자열을 double형 숫자로 변환
		
		boolean b1 = true;
		b1 = false;
		
		String s3 = "false";
		boolean b2 = Boolean.parseBoolean(s3);
		
		//숫자 -> 문자열
		String s4 = String.valueOf(true);
		String s5 = String.valueOf(1512);
		String s6 = String.valueOf(155.222);
		
		String s7 = 1512 + "";	//"1512" -> 문자열로 변환하는 방법 중 하나 ""을(내용없이) 더한다.
		
		
		
		
	}

}
