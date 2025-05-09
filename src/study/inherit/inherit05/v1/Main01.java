package study.inherit.inherit05.v1;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	public static void main(String[] args) {
		
		//청소
		
//		FloorCleaner fc1 = new FloorCleaner();
//		FloorCleaner fc2 = new FloorCleaner();
//		FloorCleaner fc3 = new FloorCleaner();
//		
//		fc1.cleanFloor();
//		fc2.cleanFloor();
//		fc3.cleanFloor();
//		
//		WindowCleaner wc1 = new WindowCleaner();
//		
//		DustCleaner dc1 = new DustCleaner();
		// 위의 코드대로 관리하면 볼게 너무 많아짐!!
		
		DustCleaner[] dustArr = new DustCleaner[3];
		dustArr[0] = new DustCleaner();
		dustArr[1] = new DustCleaner();
		dustArr[2] = new DustCleaner();
		
//List로 시작해도 ArrayList로 인식 가능-> ArrayList가 List를 부모로 두고 있기 때문
		List<WindowCleaner> windowList 
					= new ArrayList<WindowCleaner>();
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		
		//Set<String> set = new HashSet<String>();
		//Map<String, Integer> map = HashMap<String, Integer>();
		
		List<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		
		for(int i=0; i<dustArr.length; i++) {
			dustArr[i].removeDust();
		}
		
		for(int i=0; i<windowList.size(); i++) {
			windowList.get(i).washWindow(); 
			//인덱스로 접근 후 스타일 주기
		}
		
		for(FloorCleaner fc : floorList) {
			fc.cleanFloor();
			//향상된 for문으로 사용!!
		}
		
		
		
	}

}








