package study.practice.Practice27;

public class Person {
	/*
	아래 컨셉으로 클래스를 만든 후,
	해당 클래스를 기반으로 각자 인스턴스 객체를 한개씩 생성해서
	값을 저장하고 출력!!!


	사람 클래스

	이름
	성별
	나이
	키
	직업유무
	
	스캐너로 받아서 출력 해보기!!!
	번호도 랜덤출력? 해볼까 ㅎㅎ
	*/
	
	//속성
	String name;
	int gender;
	int age;
	double stature;
	boolean isJob;
	
	//생성자
	Person () {
	}
	Person(String name, int gender, int age,
			double stature, boolean isJob) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.stature = stature;
		this.isJob = isJob;
	}
	
	//메소드
	void printPersonInfo() {
		System.out.println("이름: " + name);
		if(gender == 1) {
			System.out.println("성별: 남");
		}
		if(gender == 2) {
			System.out.println("성별: 여");
		}
		System.out.println("나이: " + age);
		System.out.println("키: " + stature);
		System.out.println("직업유무: " + (isJob ? "O" : "X"));
		System.out.println();
	}
	
	
}
