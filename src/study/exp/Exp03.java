package study.exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		try {
			s.addItem1("111");
		} catch (Exception e) {
			System.out.println("main addItem1 호출 부분 catch block");
		}
		
		//s.addItem1("111");
		
		s.addItem2("222");
		
		try {
			s.addItem3("111");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			s.addItem4("111");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//throw로 넘기는 방식으로 해결하면 안 좋음! 떠넘기고 떠넘기는 형태라 좋은 구조 X
		
		
		try {
			s.addItem5("555");
		} catch (Exception e) {
			System.out.println("main addItem5 호출 부분 catch block");
			//e.printStackTrace();
		}
		
		
		int result6 = s.addItem6("666");
		if(result6 == 1) { //잘된거~
			
		}
		if(result6 == -1) { //뭔가 문제가 있다!
			
		}
		
		
		try {
			s.addItem7("777");
		} catch (ListFullException e) {
			e.printStackTrace();
		} catch (InvalidParameterValueException e) {
			e.printStackTrace();
		}
		
		
		try {
			s.addItem8("888");
		} catch (MyCustomException e) {
			e.printStackTrace();
			
			//어떻게 대응할 것인가를 정해주는 구간
			if(e.exceptionCode == 99) {
				
			}
			if(e.exceptionCode == 120) {
				
			}
			
		}
		
		
		
	}

}


class Sample {
	
	List<String> list; //null
	
	void addItem1(String s) {
		list.add(s); //배열에 하나씩 추가
	}
	
	
	void addItem2(String s) {
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("main addItem2 catch block");
			
			if(list == null) {
				list = new ArrayList<String>();
				list.add(s);
			}
		}
	}
	
	
	void addItem3(String s) throws Exception{
		list.add(s);
	}
	
	
	void addItem4(String s) throws ClassNotFoundException{ 
							//나는 NullPointerException이 발생할 수도 있는 메소드입니닫ㅇ
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("main addItem4 catch block");
		}
	}
	
	//throws : 메소드 선언부분 뒤에 붙여서, 예외떠넘기기가 발생할 수 있다고 경고!!
	//throw : 실제로 예외를 떠넘겨버리기!! 수행!! "예외를 던져라" => 예외를 전달하기 위함
	
	void addItem5(String s) throws Exception {
		try {
			list.get(30);
		} catch(Exception e) {
			System.out.println("Sample addItem5 catch block");
			throw e; //예외를 던져라!! 떠넘기는걸 수행해라!!
		}
	}
	
	int addItem6(String s) {
		
		//리턴값 : 1 정상작동	-1 뭔가 문제가 있다!!
		
		try {
			list.add(s);
			//return 1;
		} catch (Exception e) {
			return -1;
		}
		
		return 1; //try 내부가 아닌 바깥에 적어두는 경우도 있다(별 다른 코드가 있다면!)
		
		//-1 저장실패
		//-2 불러오기 실패
		//-3 인덱스 실패
		//-4 ......
	}
	
	void addItem7(String s) throws ListFullException, InvalidParameterValueException{
		
		if(s == null) {
			throw new InvalidParameterValueException(); 
			//Exception 날리기 (단, Exception 객체가 존재해야함)
		}
		
		try {
			
			//별도의 로직 만들어주기 (catch의 thorw외에?)
			if(list.size() == 10) {
				throw new ListFullException();
			} else {
				list.add(s);
			}
			
		} catch (Exception e) {
			//throw e;
			throw new ListFullException();
		}
		
	}
	
	
	void addItem8(String s) throws MyCustomException{
		
		if(s == null) {
			MyCustomException me = new MyCustomException();
			me.exceptionCode = 20;
			
			throw me;
		}
		
		try {
			
			if(list.size() == 10) {
				MyCustomException me = new MyCustomException();
				me.exceptionCode = 120;
				
				throw me;
			} else {
				list.add(s);
			}
			
		} catch (Exception e) {
			//throw e;
			MyCustomException me = new MyCustomException();
			me.exceptionCode = 99;
			
			throw me;
		}
		
	}
	
	
	
	
}



//Custom Exception
//-> 내 맘대로 처리하는 것
class ListFullException extends Exception {
	 //Exception 객체인 것 처럼 활용

}

class InvalidParameterValueException extends Exception {
	
}

class MyCustomException extends Exception {
	int exceptionCode;
	
	// 10
	// 20
	// 30
	// 99
	// 120
	//이렇게 숫자로 나누고 이걸로 처리하는 방향 정하기
}













