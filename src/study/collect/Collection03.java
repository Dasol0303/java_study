package study.collect;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Collection03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map
		
		//HashMap
		
		//key	value
		
		//출석번호	이름
		//숫자	문자
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "김일");
		map1.put(2, "정이");
		map1.put(3, "이삼");
		map1.put(3, "최삼");//3번 덮어써서 수정해주기
		
		map1.remove(2);//(2, "정이") -> 지우기
		
		System.out.println(map1.size());
		System.out.println(map1.containsKey(3));
		System.out.println(map1.containsKey(5));
		
		System.out.println(map1.containsValue("이삼"));
		System.out.println(map1.containsValue("최사"));
		
		System.out.println(map1.get(1));//-> Key가 1에 해당하는 value를 읽어온다는 의미
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("규칙1", "지각하지 않기");
		map2.put("규칙2", "결석하지 않기");
		
		System.out.println(map2.get("규칙2"));//->동일 value옆의 value를 불러옴
		
		map1.keySet();	//set -> iterator -> hasNext next
		System.out.println("----------map1 key-------------");
		for(int key : map1.keySet()) {	//여기의 key값 = 1 2 3
			System.out.print(key + " " + map1.get(key) + " ");
		}								//map1.get(key) => value 불러오기
		System.out.println();
		
		
		System.out.println("----------map1 value-------------");
		for(String value : map1.values()) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		//map1.entrySet(); -> 밑에 식처럼 만들어줌. 대신 entry랑 set 임포트 필수!!
		Set<Entry<Integer, String>> entrySet = map1.entrySet();
		
		System.out.println("----------map1 entrySet-------------");
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
	}

}



















