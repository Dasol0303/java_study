package study.practice.practice36;
import java.util.HashMap;
public class Solution {

	//최빈값 구하기
	public int solutionMap(int[] array) {

		//		숫자		 카운트
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 

		//{1,2,3,3,3,4};
		for(int n : array) {

			//map 에 해당 값이 key 있나?
			if(map.containsKey(n)) {
				//있으면? 기존 카운트 + 1

				//map.get(n) 기존 n이라는 숫자(key)에 대한 카운트 값 => value
				int newCount = map.get(n) + 1;
				map.put(n, newCount);

				//map.put(n, map.get(n) + 1);
			} else {
				//없으면? 새로 추가 , 카운트 1
				map.put(n, 1);
			}
		}

		for(int key : map.keySet()) {
			System.out.printf("key:%d value:%d\n", key, map.get(key));
		}


		return 0;
	}

	public int solution(int[] array) {
		int maxIndex = 0;
		int max = 0;

		int[] count = new int[1000];

		for(int i : array){
			count[i]++;
			if(count[i] > max){
				max = count[i];
				maxIndex = i;
			}
		}

		int answer = maxIndex;
		for(int i=0; i<count.length; i++){
			if(i!=maxIndex && count[i] == max){
				answer = -1;
				break;
			}
		}

		//	        for(int i=0; i<count.length; i++) {
			//	        	System.out.printf("숫자:%d 갯수:%d\n", i, count[i]);
		//	        }

		return answer;
	}

}
