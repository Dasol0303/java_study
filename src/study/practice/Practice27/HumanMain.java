package study.practice.Practice27;

public class HumanMain {

	public static void main(String[] args) {
		//프로그램 시작 지점
		Human person = new Human ("이름름르믈ㄹㄹ름", "여", 29, 160.9,
					00.00, "사람", "RH-AB", "졸려요", false);
				
		
		Human person1 = new Human();
		
		person1.name = "아르르르르르르ㅡ를";
		person1.gender = "여";
		person1.age = 1;
		person1.stature = 200.04;
		person1.kg = 90.5;
		person1.job = "사람";
		person1.bloodType = "AB";
		person1.condition = "문제없다!!";
		person1.isSleep = false;
		
		System.out.println();
		System.out.println("이름 : " + person1.name);
		//... 요렇게 하믄 된다...
		
		
		System.out.println();
		Human p3 = new Human();
		p3.printHumanInfo();
		
		
	}

}
