package study.inter.interface01;

import java.util.ArrayList;
import java.util.List;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Interface01.CODE); //->기존에 있는 코드 선언? 불러오기? 가능!!
		
		int topp = Interface01.FISHBREAD_TOPPING_PIZZA;
		//Interface01.FISHBREAD_TOPPING_KIMCHI
		//FishBreadCode 인터페이스 같은 이름 만들고 코드표화 해서 만들면 사용 참고가 더 쉬워짐!!
		//CommonCode. ---;
		
		ImpleClass c = new ImpleClass();
		c.method1();
		c.method2();
		
		//Interface01 i1 = new Interface01(); -> 인터페이스 생성 불가 (추상 클래스와 유사)
		
		Interface01 i1 = new ImpleClass();
		i1.method1();
		i1.method2();
		
		Interface01 i11 = new ImpleClass02(); //-> 가능!!
		i11.method1();
		i11.method2();
		Interface02 i22 = new ImpleClass02(); //-> 가능!!
		i22.method3(); //->Interface02에만 들어있는 method3 호출만 가능!!(위도 마찬가지)
		
		Interface01[] arr = {new ImpleClass(), new ImpleClass02()}; 
		//->배열 담기 가능!!
		List<Interface01> list = new ArrayList<Interface01>();
		list.add(new ImpleClass());
		list.add(new ImpleClass02());
		//->리스트 담기 가능!!
		
		test1(c);
		test1(i11);
		test1(arr[0]);
		//->Interface01 타입 안에 들어갈 수 있는 객체면 다 가능!!(밑에 메소드 확인!!)
		
		Interface01 if1 = test2(); //return Interface01
		
		//Interface01 i11 = new ImpleClass02();
		//ImpleClass02 i11 = new ImpleClass02();
		
		ImpleClass02 ice02 = (ImpleClass02)i11;
		//ImpleClass ic2 = (ImpleClass02)i1; -> 오류
		if(i1 instanceof ImpleClass) {
			ImpleClass ic = (ImpleClass)i1;
		}
		
		
	}
							//Interface01 inter = new ImpleClass() 이런 느낌..
							//Interface01 inter = new ImpleClass02() 이런 느낌.. 
	public static void test1(Interface01 inter) {
		
	}

	public static Interface01 test2() {
		
		return new ImpleClass(); //Interface01요 안에 들어갈 수 있어서 리턴 가능!!
	}
}
