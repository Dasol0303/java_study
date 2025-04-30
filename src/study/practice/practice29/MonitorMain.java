package study.practice.practice29;
//import java.util.Scanner;
public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		
		Monitor m1 = new Monitor("삼성", 27, 150000, "검은색");
		m1.setXY(1080, 780);
		m1.powerOn();
		m1.printMonitor();
		
		Monitor m2 = new Monitor("LG", 32, 330000);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		m2.priceUp(70000);
		m2.printMonitor();
	}

}
