package study.practice.practice29;

public class Triangle {
	int width;
	int height;
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height / 2.0;
	}
}
