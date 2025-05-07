package study.collect;

import java.util.HashSet;
import java.util.Iterator;

public class Collection02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set
		
		//Set 의 특징 -> 중복은 체크가 되지 않는다.
		HashSet<String> set1 = new HashSet<String>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		//타입이 앞 뒤가 맞아야한다. => ~<String> = ~<String>();
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		System.out.println(set1.size());//->3 중복을 제거해서 종류는 3개
		System.out.println(set1.contains("C"));//-> 조회
		
		for(String value : set1) {
			System.out.println(value);
		}
		
		Iterator<String> it1 = set1.iterator();
		//iterator 메소드 종류
		//hasNext() : 다음 읽어올 값이 있나?
		//next()	: 다음 값 읽어오기
		System.out.println();
		while(it1.hasNext()) {	//A B C
			String s = it1.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		
	}

}











