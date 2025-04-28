package study.cls.cls01;

public class StudentMain {

	public static void main(String[] args) {
		//자바 -> Run -> main 을 찾아서 실행
		
		//정수형 타입 변수
		int a = 10;
		
		//정수형 배열 변수 (참조타입 = 주소 저장)
		int[] arr = new int[5];
		
		//클래스타입 변수 (참조타입 = 주소를 저장)
		Student stu1 = null; //주소가 없다 = null;
		stu1 = new Student();//() <- 객체 생성 의미(비어있어도 이렇게!)
		
		Student stu2 = new Student();
		
		System.out.println(stu1.name);//기본값 : null
		
		System.out.println(stu2.age);//기본값 : 0
		
		stu1.name = "가이름";
		stu1.age = 19;
		stu1.grade = 3;

		stu2.name = "나이름";
		stu2.age = 15;
		stu1.grade = 2;

		System.out.println(stu1.name);

		System.out.println(stu2.age);

		Student stu3 = null;
		System.out.println(stu3);
		
		stu3 = new Student();//->student 라이브러리 클래스 선언 중요!!
		//입력 저장 공간이 생기는 과정
		
		System.out.println(stu3.name);
		
		
	}

}
