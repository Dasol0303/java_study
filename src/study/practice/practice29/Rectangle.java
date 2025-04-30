package study.practice.practice29;

public class Rectangle {

	int width;
	int height;
	
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
//	int rectangle(int x, int y) {
//		rectangle = x * y;
//		return rectangle;
//	}
	
	double getArea() {
		return width * height;
	}
	
}
