package study.practice.Practice27;
import java.util.Scanner;
public class PersonMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Person cl01 = new Person();
		System.out.print("성함을 적어주세요. : ");
		String name = scanner.next();
		cl01.name = name;
		
		while(true) {
			System.out.print("성별을 적어주세요.(남=1 / 여=2 중 택1): ");
			int gender = scanner.nextInt();

			if(!(gender == 1) && !(gender == 2)) {
				System.out.println("숫자 1과 2중에서 골라주세요.");
				continue;
			}
			
			cl01.gender = gender;
			break;
		}
		
		
		while(true) {
			System.out.print("나이를 적어주세요. : ");
			int age = scanner.nextInt();
			
			if(age > 100 || age < 0) {
				System.out.println("0 ~ 100세까지의 나이를 입력해주세요.");
				continue;
			}
			
			cl01.age = age;
			break;
		}
		
		
		while(true) {
			System.out.print("키를 적어주세요. : ");
			double stature = scanner.nextDouble();
			
			if(stature > 200) {
				System.out.println("농구선수신가요..? 너무 큰 키는 부담스럽습니다. 다시 적어주세요.");
				continue;
			}
			if(stature < 30) {
				System.out.println("신생아신가요...?");
				continue;
			}
			
			cl01.stature = stature;
			break;
		}
		
		while(true) {
			System.out.print("직업유무를 알려주세요.(y/n) : ");
			String isJob = scanner.next();
			
			if(!(isJob.equals("y")) && !(isJob.equals("n"))) {
				System.out.println("y혹은 n을 입력해주세요.");
				continue;
			}
			
			if(isJob.equals("y")) {
				cl01.isJob = true;
				break;
			}
			if(isJob.equals("n")) {
				cl01.isJob = false;
				break;
			}	
		}
		
		
		
		cl01.printPersonInfo();
		
	}

}
