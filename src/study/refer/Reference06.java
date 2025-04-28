package study.refer;

public class Reference06 {

	public static void main(String[] args) {
		
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			//sum += i; //0 1 2 3 4
			sum += arr[i]; //10 20 30 40 50
		}
		System.out.println(sum);
		
		sum = 0;
		int index = 0;
		for(int num : arr) {	//num 변수에 배열의 값이 매핑
			//arr 배열에 있는 값을 num에 넣어주면서 반복 
			sum += num;
			
			index++;
			if(index >= 3) {
				break;
			}//반복 횟수 정해줄 때 쓰는 방법
			
			//arr 의 길이만큼 처음부터 끝까지 다 반복
			//값만 주어짐, 인덱스는 모름(필요하면 따로 처리)
		}
		System.out.println(sum);
		
		
		int[] scores = {90, 95, 100, 80, 70}; //정수
		
		//채점 실수로 모두 -5점 처리
		
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();

		for(int score : scores) {
			score = score - 5;
		}//얘는 인덱스 접근 계산이 안됨!!
		
		//----정수 접근 계산식 추가!!------
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i] - 5;//인덱스에 접근해 계산해야하기 때문에 이러한 식을 씀!
		}
		//----정수 접근 계산식 추가!!------
		
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();

	}

}
