package study.practice.practice40;

public class Shape {
	String name;

	// 도형의 넓이를 반환
	public double area() {
	return 0;
	}
	}


	// 정사각형
	class Square extends Shape {
	int length; // 한 변의 길이

	/* 1. 정사각형 넓이를 구하도록 area()를 재정의하세요. */
	public double area() {
		return length * length;
		}
	
	}

	
	// 삼각형
	class Triangle extends Shape {
	int base; // 밑변
	int height; // 높이

	/* 2. 삼각형 넓이를 구하도록 area()를 재정의하세요. */
	public double area() {
		return (base * height) / 2;
		}
	}

	
	// 원
	class Circle extends Shape {
	int radius; // 반지름

	/* 3. 원의 넓이를 구하도록 area()를 재정의하세요. */
	public double area() {
		return radius * radius * Math.PI;
		}
}
