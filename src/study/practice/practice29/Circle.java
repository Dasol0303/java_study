package study.practice.practice29;

public class Circle {

	int circle;
	
//	getArea(int circle) {
//		this.circle = circle;
//	}
	
//	double setRadius (double x) {
//		circle = x * x * 3.14;
//		return circle;
//	}
	
	void setRadius(int circle) {
		this.circle = circle;
	}
	
	double getArea() {
		double area = circle * circle * 3.14;
		return area;
	}
	
	
}
