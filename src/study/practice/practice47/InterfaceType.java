package study.practice.practice47;

import java.util.ArrayList;
import java.util.List;

public class InterfaceType {

	public static void main(String[] args) {
		/*
		// 객체 생성
		Food food = new Food("족발", 19800);
		Electronics elect = new Electronics("에어팟", 199000);
		Clothing cloth = new Clothing("셔츠", 49900);
		
		// 총합 계산
		int total = food.discountedPrice() + elect.discountedPrice() + cloth.discountedPrice();
		*/
		
		//ArrayList사용!!-> 요걸 계속 쓸 수 있도록 연습 필요!!
		List<Orderable> list = new ArrayList<Orderable>();
		list.add(new Food("족발", 19800));
		list.add(new Electronics("에어팟", 199000));
		list.add(new Clothing("셔츠", 49900));
		
		int total = 0;
		for(Orderable od : list) {
			total += od.discountedPrice();
		}
		
		// 결과 출력
		System.out.printf("총합 : %d원", total);
	}

}
