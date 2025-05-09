package study.inherit.inherit05.v2;

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
		
		
		for(Cleaner c : list) {
			c.removeDust();
			c.washWindow();
			c.cleanFloor();
		}
		
	}

}








