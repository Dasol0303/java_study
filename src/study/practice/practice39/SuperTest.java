package study.practice.practice39;

public class SuperTest {

	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc1 = new Orc("오크", 80);
		System.out.println(orc1.toString());
		System.out.println(orc1); //재정의 했기 때문에 toString없이 담긴 객체를 불러도 가능
		
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior orcWarrior = new OrcWarrior("오크전사", 120, 3);
		System.out.println(orcWarrior.toString());
		System.out.println(orcWarrior); //재정의 했기 때문에 toString없이 담긴 객체를 불러도 가능

	}

}
