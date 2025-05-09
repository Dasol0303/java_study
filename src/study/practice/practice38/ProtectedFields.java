package study.practice.practice38;

public class ProtectedFields {

	public static void main(String[] args) {
		// 객체 생성
		Basketball b = new Basketball();
		Soccer s = new Soccer();
		PingPong p = new PingPong();

		// 객체 필드 초기화
		b.setName("농구");
		s.setName("축구");
		p.setName("탁구");

		// 부모 타입(업 캐스팅)으로 배열 생성
		Sports[] sportsArr = { b, s, p };

		// 모든 운동 설명 출력
		for (int i = 0; i < sportsArr.length; i++) {
		Sports tmp = sportsArr[i];
		tmp.description();
		}
	}

}
