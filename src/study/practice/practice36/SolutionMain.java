package study.practice.practice36;

public class SolutionMain {

	public static void main(String[] args) {

		Solution sol = new Solution();

		int[] testCase1 = {1,2,3,3,3,4};
		int testCase1Answer = 3;

		int[] testCase2 = {1,1,2,2};
		int testCase2Answer = -1;

		System.out.println( sol.solution(testCase1) == testCase1Answer );
		System.out.println( sol.solution(testCase2) == testCase2Answer );
		System.out.println( sol.solutionMap(testCase1) == testCase1Answer );
		System.out.println( sol.solutionMap(testCase2) == testCase2Answer );
	}

}
