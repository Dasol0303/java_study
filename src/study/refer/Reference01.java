package study.refer;
import java.util.Scanner;
public class Reference01 {

	public static void main(String[] args) {
		
		
		//참조변수
		Scanner scanner = new Scanner(System.in);
		
		String str1 = "아침";
		String str2 = "아침";
		String str3 = scanner.nextLine();
		
		//참조변수에서 == 비교는 값 비교가 아니라 참조하는 주소가 같은지 비교 하는 것	
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1.equals(str2));
// 아래의 값이 다른 이유 : 결과로 보여지는 겉이 같아 보여도 코드상으로 지정해준 것(주소)이 다르기 때문
		
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str2));
		//String 값을 비교할때는 equals를 쓰자
		
		
		//null
		int num;
		int sum = 0;
		
		//num = num + 10;
		sum = sum + 10;
		
		//System.out.println(num);
		System.out.println(sum);
		
		String s1;
		String s2 = null; //s2도 비어있는 상태이지만 null 이라는 값을 지정해줌
		//참조하는게 없다! = null
		String s3 = "글자";
		
		//System.out.println(s1);
		System.out.println(s2);//null
		System.out.println(s3);
		
		
		if(s2!=null)
			System.out.println(s2.equals("글자"));
//if없이 사용하면 -> 결과가 false가 아닌 NullPointException 오류 발생
	
		
		
	}

}
