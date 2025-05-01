package study.cls.cls03.pack1;
import study.cls.cls03.pack2.Cup;
//상단에 import를 하면
//본 페이지에서 Cup 클래스 사용시 import한 클래스로 인식
import java.util.Scanner;

public class CupMain {

	public static void main(String[] args) {

		//상단에 import가 없으면, 동일 패키지 클레스 인식
		Cup c1 = new Cup();
	//->import전 가장 가까운 파일인 pack1의 Cup클래스 인식
		c1.method();
		
		study.cls.cls03.pack2.Cup c2 = new study.cls.cls03.pack2.Cup();
		c2.method();
		
		//pack2.Cup c2 = new pack1.Cup();
		//Cup c1 = new Monitor();
	
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		study.cls.cls03.pack1.Cup c3 = new study.cls.cls03.pack1.Cup();
		c3.method();
		
		//c2.b
		//c3.a
		//c3.b
	}
	

}
