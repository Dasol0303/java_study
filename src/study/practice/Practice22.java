package study.practice;

public class Practice22 {

	public static void main(String[] args) {
		//q1();
		//q2();
		//q3();
		q4();
		
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.
		
	}
	
	public static void q1() {
		/*
		1.
			1 2 3 4
			5 6 7 8
			9 10 11 12
			13 14 15 16
		*/
		int[][] numArr = new int[4][4];
		
		int num = 1;
		for (int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				//numArr[i][j] = num++;
				//num++;
				numArr[i][j] = (4*i) + (j+1);
			}
		}
		
		// 밑 수식은 위의 값 출력하는 수식!!
		for (int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				System.out.printf("%3d", numArr[i][j]);
			}
			System.out.println();
		}
		
		
	}
	public static void q2() {
		/*
		2.
			1 5  9  13
			2 6 10 14
			3 7 11 15
			4 8 12 16
		*/
		int[][] numArr = new int[4][4];
		
		int num = 1;
		
		
//		for(int i=0; i<numArr.length; i++) {
//			for(int j=0; j<numArr[i].length; j++) {
//				numArr[j][i] = num++;
//			}
//		}
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				numArr[i][j] = (i+1) + (j*4);
			}
		}

		
		for (int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				System.out.printf("%3d", numArr[i][j]);
			}
			System.out.println();
		}
		
			
	}
	public static void q3() {
		/*
		3.
			16 15 14 13		16 - (i*4) - j
			12 11 10 9
			8 7 6 5
			4 3 2 1
		*/
		
		int[][] numArr = new int[4][4];

		int num = 16;
		for (int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				numArr[i][j] = num--;
			}
		}
		
		System.out.println();
		System.out.println();

		 
		num = 1;
		for (int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				numArr[i][j] = num++;
			}
		}
		
		for (int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				System.out.printf("%3d", numArr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
	public static void q4() {
		/*
		4.
			16 12 8 4
			15 11 7 3
			14 10 6 2
			13 9 5 1
		*/
		int[][] numArr = new int[4][4];

		int num = 1;
		
		for (int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				numArr[j][i] = num++;
			}
		}

		
		for (int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				System.out.printf("%3d", numArr[i][j]);
			}
			System.out.println();
		}
		
	}

	

}
