package study.practice.practice44;

public class Practice44 {
	public static void main(String[] args) {
		Unit[] arr = {new Marine(), new Tank(), new Dropship()};
		
		for(Unit unit : arr) {
			unit.stop();
			unit.move(150, 200);
		}
		
	}
}


abstract class Unit {
	int x,y;
	
	public void stop() {
		//현재 위치에 정지
		x = x;
		y = y;
		System.out.println("멈춘다");
		
	}
	
	abstract void move (int x, int y);
			
}


//base code
class Marine extends Unit{ // 보병
	void move(int x, int y) { 
		//지정된 위치로 이동
		System.out.println("걸어서 이동");
	} 
	void stimPack() { /* .*/} //스팀팩을 사용한다
}

class Tank extends Unit{ // 탱크
	void move(int x, int y) { 
		//지정된 위치로 이동
		System.out.println("탱크 바귀 굴러가면서 이동");
	} 
	void changeMode() { /* . */} //공격모드를 변환한다
}

class Dropship extends Unit{ // 수송선
	void move(int x, int y) { 
		//지정된 위치로 이동
		System.out.println("날아서 이동");
	} 
	void load() { /* .*/ } //선택된 대상을 태운다
	void unload() { /* .*/ } //선택된 대상을 내린다
}









