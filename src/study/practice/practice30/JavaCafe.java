package study.practice.practice30;

public class JavaCafe {
	public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
		}
	
	
	
//-----------------------------메소드------------------------------
		// 시급과 일한 시간을 입력받아, 주급을 출력
		public static void printPay(double basePay, int hours) {
			double pay = 0.0; //basePay * hours
			
			if(hours <= 40 && hours >= 0) {
				pay = basePay * hours;
			}
			if(hours > 40 && hours < 60) {
				int hoursA = hours - 40;
				double payA = (basePay * hoursA) * 1.5;
				pay = (basePay * (hours - hoursA)) + payA;
			}
			
			if(basePay < 8.00) {
				System.out.println("최저 시급 에러!!!! 악덕 사장 같으니라고..");
				return;
			}
			if(hours >= 60) {
				System.out.println("초과 근무시간 에러!!");
				return;
			}
			

			
		/* 해당 메소드를 완성하세요. */
		System.out.printf("$ %.2f\n", pay);
		}
}
