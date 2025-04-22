package study.practice;

public class Practice14 {
	 
 	public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		//출력결과
 		int[] intArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; 
 		for(int i=0; i<10; i++) {
 			System.out.print(i + " ");
 		}
 
 		System.out.println();
 
 		for(int i=0; i<10; i++) {
 			System.out.print(intArr[i] + " ");
 		}
 
 		System.out.println();
 
 		for(int i=0; i<10; i++) { 
 			if(i%2 != 0) { 
 				System.out.print(intArr[i] + " ");
 			}
 		}
 
 		System.out.println();
 	}
 
 }