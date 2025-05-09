package study.practice.practice39;

public class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		String str = String.format("Orc {name: %s, hp: %d}", name, hp);
		return str;
	}
}

class OrcWarrior extends Orc{
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		String str = String.format("OrcWarrior {name: %s, hp: %d, amor: %d}", name, hp, amor);
		return str;
	}
}