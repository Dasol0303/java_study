package study.practice;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	1. 아래 1), 2) 에 맞게 풀이.
	int x = 10;
	int y = 4;
	___result = ___x/y;
	System.out.println(result);

	1) 결과가 2가 나오도록 작성하세요
	2) 결과가 2.5가 나오도록 작성하세요
	*/
		
		int x = 10;
		int y = 4;
		double result1 = (double)x/y;
		System.out.println(result1);
		
		int result11 = (int)x/y;
		System.out.println(result11);
		
		
		
	/*
	2. 결과가 7.5가 나오도록 작성하세요
	double a = 3.5;
	double b = 4.7;
	double result = _______________;
	System.out.println(result);
	*/
		
		double a = 3.5;
		double b = 4.7;
		double result2 = a + (int)b;
		System.out.println(result2);
		

	/*
	3. 계산결과가 12가 나오도록 작성하세요
	String a = "3.4";
	String b = "4";
	______ result = ________;
	System.out.println(result);
	*/
		
		String c = "3.4";
		String d = "4";
		double c1 = Double.parseDouble(c);
		int d1 = Integer.parseInt(d);
		//(int)Double.parseDouble(c) -> 3
		//int result = (int)Double.parseDouble(c) * Integer.parseInt(d);
		int result3 = (int)c1 * d1;
		System.out.println(result3);
		


	/*
	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
	String a = "10";
	int b = 3;
	double c = 4.5;
	_____ result = _______;
	System.out.println(result);
	*/
		/*
		String e = "10";
		int f = 3;
		double g = 4.5;
		int fg = f * (int)g + 1;
		String fg1 = String.valueOf(fg);
		
		String result4 = e + fg1;
		System.out.println(result4);
		*/
		
		String e = "10";
		int f = 3;
		double g = 4.5;
		String result4 = e + (Integer.parseInt(e) + f);
		//String result = e + ((int)(f*g));
					//	 "10" + (int)(13.5) -> 13
		System.out.println(result4);
		
		
	/*
	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
	int a = 4;
	double b = 3.4;
	String c = "6.8";
	_____ result = _______;
	System.out.println(result);
	*/
		/*
		int h = 4;
		double i = 3.4;
		String j = "6.8";
		double j1 = Double.parseDouble(j);
		
		int i1 = (int)i - 1;
		int j2 = (int)j1 / 2;
		
		String h1 = h + "";
		String i2 = i1 + "";
		String j3 = j2 + "";
		
		String result5 = i2 + h1 + j3;
		System.out.println(result5);
		*/
		
		int h = 4;
		double i = 3.4;
		String j = "6.8";
		
		String result5 = ((int)Double.parseDouble(j) - h) + String.valueOf(h) + (int)i;
		//										   6 - 4 = 2	 + "4" 		  +   3
		System.out.println(result5);
		
	/*
	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
	int x = 111;
	int y = 13;
	int result = _____;
	System.out.println(result);

	1) 출력결과 : 7
	2) 출력결과 : 8
	*/
		/*
		int s = 111;
		int t = 13;
		
		int result61 = (t + 1) / 2;
		int result6 = ((t + 1) / 2) + 1;
		System.out.println(result6);
		System.out.println(result61);
		*/
		// 111/13 = 8.7 (몫: 8, 나머지: 7)
		
		int s = 111;
		int t = 13;
		int result6 = s % t; //1)
		result6 = s / t; //2)
		
		System.out.println(result6);
		
	}

}
