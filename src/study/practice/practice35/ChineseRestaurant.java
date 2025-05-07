package study.practice.practice35;
import java.util.ArrayList;
import java.util.ArrayList;

public class ChineseRestaurant {
	public static void main(String[] args) {
		// 주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
		// 메뉴를 조합하여 주문을 생성
		//Menu[] menuArr = { jjajang, jjambbong, tangsook };
		
		ArrayList<Menu> list = new ArrayList<Menu>();
		list.add(jjajang);
		list.add(jjambbong);
		list.add(tangsook);
		
		Order order = new Order(123, list);
		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
		
//		Menu[] menuArr2 = { new Menu("짬뽕", 5900), new Menu("탕수육", 13900)};
//		Order order2 = new Order(124, list);
//		System.out.printf("[주문번호 %d]주문 합계: %d원\n",order2.orderNum , order2.totalPrice());
		
		ArrayList<Menu> list2 = new ArrayList<Menu>();
		list2.add(new Menu("짬뽕", 5900));
		list2.add(new Menu("짜장", 4900));
		list2.add(new Menu("탕수육", 13900));
		list2.add(new Menu("탕수육", 13900));

		Order order2 = new Order(124, list2);
		System.out.printf("[주문번호 %d]주문 합계: %d원\n",order2.orderNum , order2.totalPrice());
	}
}

