package study.practice.practice29;

public class Tv {
	/*
	1. 아래 기능이 올바르게 수행되도록 코드를 작성하기.
	//아래 주석 부분이 실행 후 결과로 출력되는 부분입니다.
	//
	public class ExrMain {

	public static void main(String[] args) {

	TV myTv = new TV("LG", 2021, 43);
	myTv.show();
	//LG제품 2021년형 43인치 TV
	}

	}
	 */

	String company;
	int year;
	int inch;

	Tv() {
	}

	Tv (String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(company + "제품 " + year + "년형 " + inch + "인치 TV");
	}
}
