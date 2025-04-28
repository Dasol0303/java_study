package study.cls.cls01;

public class PhoneMain {

	public static void main(String[] args) {
		
		//Phone p1 = new Phone(); X사용불가X
		//-> 라이브러리 클래스 파일에 기본생성자 선언이 없다면 오류 항목/ ()안에 아무것도 없는 거!!
		Phone p1 = new Phone("갤럭시21");
		
		Phone p2 = new Phone("아이폰14");
		
		Phone p3 = new Phone("아이폰15", 300);
		
		Phone p4 = new Phone("갤럭시25", 250, 5000);
	}

}
