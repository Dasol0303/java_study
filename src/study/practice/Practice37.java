package study.practice;
import java.util.HashMap;
public class Practice37 {

	public static void main(String[] args) {
		//공백 제외, 알파벳 대소문자 구분X
		/*
			1. 이 문장에 사용된 알파벳의 갯수는 몇개인가요?
			(중복된 수 제외, 대소문자 구분X)
			Ex) R r 둘다 구분하지 않고 알파벳 r 한개라고 체크
			
			2. 이 문장에 사용된 알파벳들이 각각 몇 글자씩 있는지 세어보고 출력하세요.
		 */
		
		String str = "Returns a completion of the value and message";
		str = str.replace(" ", "");
		
		String[] strArr = str.split("");


		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String key : strArr) {	
			map.put(key, 0);
			if(map.containsKey(key)) {
				int count = map.get(key) + 1;
				map.put(key, count);
			}

		}	
		
		
		System.out.println("사용된 알파벳 숫자 : " + strArr.length);
		
		
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		

	}

}
