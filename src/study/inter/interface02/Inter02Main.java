package study.inter.interface02;

import java.util.ArrayList;
import java.util.List;

public class Inter02Main {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.c = new ApplePhone();
		p.call("1234");
		
		p.c = new SamsungPhone();
		p.call("5678");
		
		List<Callable> cList = new ArrayList<Callable>();
		cList.add(new ApplePhone());
		cList.add(new SamsungPhone());
		
		for(Callable c : cList) { //Callable 인터페이스에 하나씩 담김
			c.call();
		}
		
		List<Connectable> bList = new ArrayList<Connectable>();
		bList.add(new SamsungPhone());
		bList.add(new BluetoothSpeaker());
		
		for(int i=0; i<bList.size(); i++) {
			bList.get(i).connect();
		}
		
	}

}
