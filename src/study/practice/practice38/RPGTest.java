package study.practice.practice38;

public class RPGTest {

	public static void main(String[] args) {
		// 객체 생성 및 초기화
		Novice novice = new Novice();
		novice.name = "프로도";
		novice.hp = 100;

		Wizard wizard = new Wizard();
		wizard.name = "해리포터";
		wizard.hp = 120;
		wizard.mp = 100;

		// 두 객체의 펀치
		novice.punch();
		wizard.punch();

		// 위자드 객체의 파이어볼
		wizard.fireball();

	}

}
