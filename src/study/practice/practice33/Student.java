package study.practice.practice33;
import java.util.Scanner;
public class Student {
	/*
		//1. 
		다음을 만족하는 Student 클래스를 작성하시오.
		· String 형의 학과와 정수형의 학번을 필드로 선언
		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
		학과와 학번 필드에 적당한 값을 입력 후 출력
		기능 추가.
		· 필드를 모두 private 로 하고, getter 와 setter 를 구현하고
		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
		setter 를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력
	*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학과와 학번 입력 :");
		String department = scanner.next();
		int classOf = scanner.nextInt();
		
		Student stu = new Student();

//		stu.setDepartment(department);
//		stu.setClassOf(classOf);
		
		//stu.print(department, classOf);
		
		stu.setDepartment(department);
		stu.setClassOf(classOf);
		System.out.printf("%s학과 학번:%d\n",department, classOf);

	}
	//--------------------------속성---------------------
	private String department;
	private int classOf;
	
	//--------------------------메소드---------------------
	public String getDepartment() {
		return department;
	}
	public int getClassOf() {
		return classOf;
	}
	
	
	public void setDepartment(String department) {
		this.department = department;
		//System.out.println("학과 : " + department);
	}
	public void setClassOf(int classOf) {
		this.classOf = classOf;
		//System.out.println("학번 : " + classOf);
	}
	
	
//	void print(String department, int classOf) {
//		System.out.println("학과 : " + department + " 학번 : " + classOf);
//		
//	}
	

}
