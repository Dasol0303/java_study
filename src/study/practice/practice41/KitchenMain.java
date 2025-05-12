package study.practice.practice41;

public class KitchenMain { 

	public static void main(String[] args) {
		
		KitchenPlace KP01 = new KitchenPlace();
		
		Refrigerator refG = new Refrigerator("SAMSUNG", 100, true, true, 6); //냉장고
											//브랜드 용량 전원유무 온도조절유무 문갯수
		Refrigerator iceTray = new Refrigerator(12, 5000); //얼음 트레이
												//몇 구인지 가격
		System.out.println(refG.toString());
		iceTray.iceTray();
		System.out.println();
		
		GasRange gasR = new GasRange(4, "LG", 900000, true); //가스레인지
								//화구수 브랜드 가격 화구력테스트유무
		System.out.println(gasR.toString());
		gasR.fireTest();
		System.out.println();
		
		Sink sink = new Sink(2000, 100, 150, "민트", "우드"); //싱크대
						//- 가로 세로 깊이 색상 재질
		System.out.println(sink.toString());
		System.out.println();
		
		Dust trash01 = new Dust(2, "핑크!"); //쓰레기통
							//용량 색상
		System.out.println(trash01.toString());
		trash01.isOpen(true, 3); //쓰레기통 열기 유무, 버리려는 쓰레기 용량
		//trash01.isOpen(true, 0.5);
		System.out.println();
		
		Cup cup01 = new Cup(500, "메탈", "회색"); //컵
						//용량 재질 색상
		System.out.println(cup01.toString());
		
		
		
		
	}

}
