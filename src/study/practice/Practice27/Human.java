package study.practice.Practice27;

public class Human {
	
	String name;
	String gender;
	int age;
	double stature;
	double kg;
	String job;
	String bloodType;
	String condition;
	boolean isSleep;
	
	//생성자 선언하지 않으면? 기본생성자 자동 생성
	//Human() {}
	
	
	//요 밑에는 생성자!!
	//생성자 : 객체가 생성될 때 초기에 해야 할 일
	Human() {
	}
	
	Human(String name, String gender, int age, double stature, double kg,
			String job, String bloodType, String condition, boolean isSleep) {
		System.out.println("이름 : " + name);
		this.name = name;
		System.out.println("성별 : " + gender);
		this.gender = gender;
		System.out.println("나이 : " + age + "살");
		this.age = age;
		System.out.println("키 : " + stature + "cm");
		this.stature = stature;
		System.out.println("몸무게 : " + kg + "kg");
		this.kg = kg;
		System.out.println("직업 : " + job);
		this.job = job;
		System.out.println("혈액형 : " + bloodType);
		this.bloodType = bloodType;
		System.out.println("건강상태 : " + condition);
		this.condition = condition;
		System.out.println("수면중여부 : " + isSleep);
		this.isSleep = isSleep;
		
	}
//위 코드는 활용성이 떨어지는 코드!! 생성과 출력 코드는 역할을 나누어서 따로 두는 편이 좋다!!
	
	//메소드
	void printHumanInfo() { //메소드 이름의 앞은 소문자!!
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + stature);
		System.out.println("몸무게 : " + kg);
		System.out.println("직업 : " + job);
		System.out.println("혈액형 : " + bloodType);
		System.out.println("건강상태 : " + condition);
		System.out.println("수면중여부 : " + isSleep);
		System.out.println("수면중여부 : " + (isSleep ? "자는 중" : "안 자는 중"));
		System.out.println();
		
	}
	

}
