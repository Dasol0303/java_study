package study.practice.practice40;

public class Overriding {

	public static void main(String[] args) {
		// 객체 생성 및 초기화 - 정사각형
		Square s = new Square();
		s.name = "정사각형";
		s.length = 5;

		// 객체 생성 및 초기화 - 삼각형
		Triangle t = new Triangle();
		t.name = "삼각형";
		t.base = 4;
		t.height = 3;

		// 객체 생성 및 초기화 - 원
		Circle c = new Circle();
		c.name = "원";
		c.radius = 4;

		// 업 캐스팅 - 도형 배열에 정사각형, 삼각형, 원 담기
		Shape[] shapes = { s, t, c };

		// 모든 도형의 넓이 계산 및 출력
		for (int i = 0; i < shapes.length; i++) {
		Shape tmp = shapes[i];
		System.out.printf("%s의 넓이 -> %.2f\n", tmp.name, tmp.area());
		}

	}

}
