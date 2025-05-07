package study.collect;
import java.util.ArrayList;
public class Collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList
		
		String[] arr = new String[3];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		
		//위쪽은 배열 추가하려면 new String[4] 이렇게 써야함
		
		for(int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(String value : arr ) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		
		ArrayList<String> list = new ArrayList<String>();//보통 list로 이름 지어줌
		//ArrayList 공간을 사용하겠다 -> 선언
		
		ArrayList<String> list2 = null;//null 가능함
		//ArrayList<Menu>	Menu[] -> 다른 클래스 위치 배열? 사용가능
		//ArrayList<Order>	Order[] ->		//
		
		System.out.println(list.size());
		//System.out.println(list2.size()); //얘는 안됨. null이라서 
		
		
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		
		System.out.println(list.size());
		System.out.println(list.get(2)); // 배열처럼 0 1 2 3 ...숫자 적용시켜서 2는 3번째
		System.out.println();
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.add(2, "A");//문자열 추가!! //(2,"A") -> 2인덱스에 문자열 추가(2인덱스부터 뒤로 밀림)
		list.set(3, "H");//3인덱스 문자열을 교체
		list.remove(0);//0인덱스 삭제
		list.remove("G");//원하는 문자열 삭제 -> 배열도 같이 줄어듦
		
		for(String v : list) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println(list.contains("Z")); //contains는 boolean타입처럼 사용 => 값 체크용
		System.out.println(list.contains("E"));
		
		int[] intArr = new int[10];
		
		//ArrayList<int> intList = new ArrayList<int>();
		//-> 사용불가! 기본타입은 담을 수가 없음. String은 참조변수이기 때문에 사용가능
		ArrayList<Integer> intList = new ArrayList<Integer>();
		//Integer.parseInt(null)
		//Integer => int를 감싸주는 역할
		
		//포장객체 Wrapper Class
		//int -> Integer
		//double -> Double
		//boolean -> Boolean
		
		intList.add(10);
		//intList.add(new Integer(30)); //-> 글자에 선 그어진건 deprecated 금방 사라질 아이..?
		intList.add(30);
		intList.add(50);
		//-> 숫자 저장 배열
		System.out.println();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		for(int n : intList) {
			System.out.print(n+" ");
		}
		System.out.println();
		
	}

}



















