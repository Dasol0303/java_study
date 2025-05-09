package study.practice.practice38;

public class Novice {
	String name;
	int hp;

		public void punch() {
			System.out.printf("[%s]의 펀치!!\n", name);
		}
	}

/* 1. Wizard 클래스를 Novice 클래스로부터 확장하세요. */
class Wizard extends Novice{
		/* 2. mp 필드를 추가하세요. */
		int mp;

		/* 3. fireball() 메소드를 만드세요. */
		public void fireball() {
			System.out.printf("[%s]의 파이어볼!!\n", name);
		}
	
	}
