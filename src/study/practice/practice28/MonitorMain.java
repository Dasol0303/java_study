package study.practice.practice28;

public class MonitorMain {

	public static void main(String[] args) {
		Monitor samsung = new Monitor("삼성", "더프레임", 65);
		
//		samsung.company = "삼성";
//		samsung.model = "더프레임";
//		samsung.inch = 65;
		samsung.printMonitorInfo();
		
		Monitor lg = new Monitor("LG", "올레드", 80);
		lg.printMonitorInfo();
		
	}

}
