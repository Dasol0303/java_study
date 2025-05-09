package study.inherit.inherit05.v3;

import java.util.ArrayList;
import java.util.List;

public class Main02 {

	public static void main(String[] args) {
		
		//청소
		
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new FloorCleaner();
		Cleaner c4 = new WindowCleaner();
		
		List<Cleaner> list = new ArrayList<Cleaner>();
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
//		list.add(new FloorCleaner());
//		list.add(new FloorCleaner());
		//-> 아래 두개는 버그에서 테스트용으로 추가한거!!
		
		
		for(Cleaner c : list) {
			c.doClean();
		}
		
	}

}








