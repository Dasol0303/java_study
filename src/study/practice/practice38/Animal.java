package study.practice.practice38;

public class Animal {
	String name; // 이름

	public void cry() {
		System.out.println("동물이 웁니다!");
	}
}

	/* 1. Pet 클래스를 Animal로부터 확장 선언 하세요. */
class Pet extends Animal {
	/* 2. 부모 클래스 Animal과 중복되는 필드를 제거하세요. */
	//String name; // 이름
	int age; // 나이
	int price; // 가격

	/* 3. 부모 클래스 Animal과 중복되는 메소드를 지우세요. */
//	public void cry() {
//		System.out.println("동물이 웁니다!");
//	}
	

	public void play() {
		System.out.println("애완 동물이 장난을 칩니다~");
	}
}
