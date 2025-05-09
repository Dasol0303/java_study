package study.practice.practice38;

public class InheritanceTest {

	public static void main(String[] args) {
		// 객체 생성
		Pet dog = new Pet();

		/* 4. 객체를 초기화하세요. */
		dog.name = "차우차우";
		dog.age = 3;
		dog.price = 2200000;

		// 정보 출력
		System.out.printf("Pet { name: %s, age: %d세, price: %d원 }", dog.name, dog.age, dog.price);
	}

}
