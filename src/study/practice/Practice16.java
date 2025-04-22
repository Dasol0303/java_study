package study.practice;
import java.util.Scanner;
public class Practice16 {

	public static void main(String[] args) {
		// prac1();
		// prac2();
		 prac3();

	}
	
	public static void prac1() {
	Scanner scanner = new Scanner(System.in);
	/*1.
	+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
	몇번째 수인가요? : 그에 해당하는 수를 출력
	ex) 10 20 30 50 90
	몇번째 수인가요? 5
	결과 : 90
	*/
	
	int[] arr = {10, 20, 30, 50, 90};
	// index : 0 1 2 3 4
	// 사용자  : 1 2 3 4 5
	
	//사용자가 선택한 번째 수 -1 인덱스 위치 

	int[] numArr = new int[5];
	System.out.println("5개 수 입력 : ");
	
	for (int i=0; i<numArr.length; i++) {
		numArr[i] = scanner.nextInt();
	}
	
//	numArr[0] = scanner.nextInt();
//	numArr[1] = scanner.nextInt();
//	numArr[2] = scanner.nextInt();
//	numArr[3] = scanner.nextInt();
//	numArr[4] = scanner.nextInt();
	
	System.out.println("몇번째? 입력 : ");
	int index = scanner.nextInt();
	
	System.out.println(numArr[index-1]);
	
	
//아래 코드는 식이 너무 늘어나있는 케이스
	/*
	int n1 = scanner.nextInt();
	int n2 = scanner.nextInt();
	int n3 = scanner.nextInt();
	int n4 = scanner.nextInt();
	int n5 = scanner.nextInt();
	
	System.out.println("몇번째? 입력 : ");
	int index = scanner.nextInt();
	
	
	if(index==1) 
		System.out.println(n1);
	 else if(index==2)
		 System.out.println(n2);
	//...
	 */

	
// 내가 만든 거ㅠ 
	
	/*
	//int[] numArr = new int[5];	//배열 길이 지정
	
	int i=0;
	int numArr[] = new int[5];
	
	for (i=0; i<numArr.length; i++) { //for문으로 정수 받기
		System.out.print("정수 입력 : "); //얘 for문 밖에 위로 빼내야 숫자만 또로록 뜨게 입력 가능!!
		numArr[i] = scanner.nextInt(); // -> 받은 정수를 각 배열에 저장
	}
	
	System.out.print("몇번째 수인가요? : ");
	i = scanner.nextInt();
	System.out.print("결과 : " + numArr[i]);
	*/
	}
	
	public static void prac2() {
		Scanner scanner = new Scanner(System.in);
		/*
		2.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		받은후에 순서를 거꾸로 출력하세요.
		ex) 1 2 3 4 5
		결과 : 5 4 3 2 1
		 */
		
		int[] numArr = new int [5];
		System.out.print("5개 수 입력 : ");
		
//		for(int i=0; i<numArr.length; i++) { //0 1 2 3 4 입력
//			numArr[i] = scanner.nextInt();
//		}
		
//		for(int i=numArr.length-1; i>=0; i--) {	//4 3 2 1 0
//			System.out.print(numArr[i] + " ");
//		}
		
		for(int i=numArr.length-1; i>=0; i--) { //4 3 2 1 0 입력
			numArr[i] = scanner.nextInt();
		}
		
		for(int i=0; i<numArr.length; i++) {	//0 1 2 3 4
			System.out.print(numArr[i] + " ");
		}
		
		
	}
	public static void prac3() {
		/*
		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1   2   3   4
		5   6   7   8
		9  10 11 12
		13 14 15 16
		*/
		
		//int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		int[][] arr = new int[4][4];
		
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = num;
//				num++;
				//i : 0		  1		  2
				//j : 0 1 2 3 0 1 2 3 0 1 2 3 ...
				//n : 1 2 3 4 5 6 7 8 9 10 11 12 ...
				arr[i][j] = (4*i) + (j+1);
			}
		}
		
		
		
		for(int i=0; i<arr.length; i++) {	//i : 0 1 2 3	행 인덱스
			for(int j=0; j<arr[i].length; j++) {
//만약 정사각형의 형태라면 위의 배열 갯수대로 4개를 적어도 무관하나 지정보다는 arr[i].length;를 적어 변화하는 값을 따르도록 만들어주는 편이 좋다
				//System.out.println(arr[i][j] + " ");
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		

	}

	

}
