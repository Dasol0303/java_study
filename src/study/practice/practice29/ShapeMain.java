package study.practice.practice29;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle();
		circle.setRadius(5);
		System.out.println("넓이 : " + circle.getArea());
		//원 넓이 : 반지름 * 반지름 * 3.14

		Rectangle rec = new Rectangle(10, 5); //-> 생성자!!
		System.out.println("넓이 : " + rec.getArea());
		//사각형 : 밑변 * 높이

		Triangle tri = new Triangle();
		tri.setSize(6, 8); //-> 메소드!!
		System.out.println("넓이 : " + tri.getArea());
		//삼각형 : 밑변 * 높이 / 2
		
		
	}

}
