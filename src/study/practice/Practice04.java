package study.practice;


public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.

		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
		6000원 이하 -> "훌륭"
		6000원 초과 ~ 8000원 -> "선방"
		8000원 초과 ~ 12000원 -> "눈물"
		12000원 초과 -> "물로배채우기"

		int menuPrice = 30000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result = ________;
		System.out.println(result);
		*/
		
		int menuPrice = 9000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result = (menuPrice > 12000) ? "물로배채우기" : 
						((menuPrice > 8000) ? "눈물" : 
						((menuPrice > 6000) ? "선방" : "훌륭"));
		System.out.println(result);
		
	}

}
