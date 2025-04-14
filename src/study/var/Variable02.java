package study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2, 8, 10, 16 진수 -> 정수형
		int num2 = 0b1010; //2진수 : 10
		int num8 = 012;	 	//8진수 : 10
		int num10 = 10;		//10진수 : 10
		int num16 = 0x30;	//16진수 : 48
		
		//주의사항: 전화번호 앞자리
		//int num = 010;	전화번호010이 아니라 8진수 10으로 인식
		//문자형태 "010"으로 작성해야 의도대로 작성되어짐 
		
		char ch1 = 123; //정수형 변수 char -> 문자를 나타내는 말(?) 
		char ch2 = 'B'; //문자 한개 '작은따옴표'
		//char ch3 = 'AB'; //두개 사용 불가
		//char ch3 = "A"; // 문자 한개 '작은따옴표'	"큰따옴표 사용불가
		
		System.out.println(ch1); //유니코드표에 있는 123이 나타내는 문자 {
		System.out.println(ch2);
		
		String str1 = "AB";
		String str2 = "C";		//'C' 작은따옴표 문자하나는 -> char 타입에 사용
		
		String str3 = "한글문자열";
		String str4 = "01012345678";
		String str5 = "010-1234-5678";
				
		System.out.println(str1);
		System.out.println(str3 + str5);
		
		String menu = "나는 \"햄버거\"를 좋아한다.\\"; //나는 "햄버거"를 좋아한다.
				//	 (		)	(   	)
		System.out.println(menu);
		
		System.out.println("Hello\tworld!\nWelcome");
		// \n은 줄바꿈		\하나는 Tab처럼 띄어쓰기 크게
		
		double db1 = 12.12; //실수형
		double db2 = 0.1212e2; // 0.1212 * 10의제곱	->12.12
		float f1 = 12.12f; //float 타입에 실수 숫자값 저장할때는 뒤에 f를 붙인다.
		
		//논리형 참/거짓 true/false
		boolean stop = true;
		boolean start = false;
		boolean isHungry = true; //변수명을 의미있게 지어주는 것이 좋음.
		
		
	}

}
