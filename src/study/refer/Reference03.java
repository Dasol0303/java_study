package study.refer;

public class Reference03 {

	public static void main(String[] args) {
		//2차원 배열
		
		int [][] scores = new int[2][3];		
		/* -> 행과 열
		 	0	1	2
		0	ㅁ	ㅁ	ㅁ
		1	ㅁ	ㅁ	ㅁ
		 */
		
		boolean[][] arrs = new boolean[3][4];
		
		/*
			0	1	2	3
 		0	ㅁ	ㅁ	ㅁ	ㅁ
 		1	ㅁ	ㅁ	ㅁ	ㅁ
 		2	ㅁ	ㅁ	ㅁ	ㅁ
 
		 */
		
		int[][] arr1 = new int[3][4];	//0 초기화
		
		for(int i=0; i<3; i++) {//i:0 1 2
			for(int j=0; j<4; j++) {//j:0 1 2 3
				//i:0
				//j:0 1 2 3
				//i:1
				//j:0 1 2 3
				//i:2
				//j:0 1 2 3
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}	
		int[][] arr2 = {{1,2,3}, {4,5,6}};
		
		//[2][3]
		//i:0 1
		//j:0 1 2
		//					2
		for(int i=0; i<arr2.length; i++) {
			//					3
			for(int j=0; j<arr2[i].length; j++) {
			
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}	
		
	}

}
