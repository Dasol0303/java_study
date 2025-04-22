package study.practice;
import java.util.Scanner;
public class Practice19 {

	public static void main(String[] args) {
		
		 q2();

	}
	
	public static void q2() {
		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
		//규칙 찾아보기.
		/*
		1 2 2 2 2
		3 1 2 2 2
		3 3 1 2 2
		3 3 3 1 2
		3 3 3 3 1
		*/
		
		int[][] numArr = new int[5][5];
		
		for(int i=0; i<numArr.length; i++) {//i=0; i<5; i++
			
			for(int j=0; j<numArr[i].length; j++) {//j=0; j<5; j++
				//System.out.print(numArr[i][j] + " ");
				
				if (i!=0 && i>j) {
					System.out.print(numArr[i][j] + 3 + " ");
				}
				if(i==j) {
					System.out.print(numArr[i][j] + 1 + " ");
				}
				if (j!=0 && j>i) {
					System.out.print(numArr[i][j] + 2 + " ");
				}
				
				/*
				if (j!=0 && j>i){
					System.out.println(numArr[i][j] + 2);
				}*/
				//System.out.print(numArr[i][j] + 3);
				//System.out.println(numArr[][] + 2);
				//System.out.println(numArr[][] + 2);
				
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
}
