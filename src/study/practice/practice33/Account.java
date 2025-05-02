package study.practice.practice33;

public class Account {
	/*
		//3. 
		다음을 만족하는 클래스 Account를 작성하시오.
		· 다음의 2 개의 필드를 선언
		private String owner;
		private long balance;
		· 위 모든 필드에 대한 getter와 setter의 구현
		· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
		다음 기능을 추가하여 작성하시오.
		· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소
		드
		public long deposit(long amount)
		· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메
		소드
		public long withdraw(long amount)
		· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한
		저축과 인출을 수행한 후 잔금을 출력
		메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
		· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
		· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인
		출하려는 메소드를 호출하여 출력
	 */

	public static void main(String[] args) {
		//ATM
		Account a1 = new Account("나", 50000);
		long insertMoney = 30000;

		//return balance 케이스
//		long result = a1.deposit(insertMoney);
//		System.out.println("입금액 : " + insertMoney);
//		System.out.println("입금 후 잔액 : " + result);
//		System.out.println();

		//return amount 케이스
		long result2 = a1.deposit(insertMoney);
		System.out.println("입금액 : " + result2);
		System.out.println("입금 후 잔액 : " + a1.getBalance());

		long result3 = a1.withdraw(150000);
		if(result3 == 0) {
			System.out.println("잔액 부족으로 인출 실패");
		}

		a1.deposit(500000);
		System.out.println("입금 후 잔액 : " + a1.getBalance());
		
		result3 = a1.withdraw(150000);
		if(result3 == 0) {
			System.out.println("잔액 부족으로 인출 실패");
		}
		
		System.out.println("출금 후 잔액 : " + a1.getBalance());
	}
	
	//--------------------------속성---------------------
	private String owner; //계좌 소유주
	private long balance; //잔액 / 큰 정수값 저장 long
	
	
	//--------------------------생성---------------------
	public Account() {
		owner = null;
		balance = 0;
	}
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public Account(long balance, String owner) {
		this.owner = owner;
		this.balance = balance;
	}
	
	//--------------------------메소드---------------------
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

	//			입금		(입금할 금액)
	public long deposit(long amount) {
		//계좌 잔액 5만		3만 입금 -> 잔액 8만
		balance += amount;
		
		//return	1) 입금액		2)입금 후 잔액
		//-> 설계에 따라 다른 리턴
		
		return amount; // 입금액 => ex - 3만
		//return balance; // 입금 후 잔액 => ex - 8만
	}
	
	//			인출		인출할 금액
	public long withdraw(long amount) {
		
		//8만원 -> 10만원 인출 X
		
		//1) 인출 불가! 금액 다시 입력
		//2) 가능한 최대금액인 8만원 인출
		
		if(amount > balance) {
			//System.out.println("잔액부족");
			return 0;
			//return code	-1 잔액부족 -2 정지계좌 -3 알수없는사유
		}
		
		balance -= amount;
		
		//return 실제 인출한 금액
		return amount;
		
	}
	
}






















