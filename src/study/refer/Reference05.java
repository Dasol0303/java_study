package study.refer;

public class Reference05 {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1; //같은 주소 가지는 과정
		
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("arr2");
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr1[0] = 100;
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("arr2");
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		int a = 10;
		int b = a;
		
		System.out.printf("a:%d b:%d\n", a, b);
		a = 20;
		System.out.printf("a:%d b:%d\n", a, b);
		//기본 타입 변수이기 때문에 읽는 순서에 따라 b는 a에 영향을 받지 않았다..?
		//참조 변수는 좀 다르넹
		
		//정수형 변수 : 주소(참조형 변수)
		//기본타입 : 참조타입
		//int c = arr1; 
		
		//int = int (int 배열이기 때문에 저장 가능)
		int c = arr1[2]; 
		
		
		//arr1 -> arr3
		int[] arr3 = new int[3]; //{0,0,0}
		
		//arr3 = arr1;
		
		for(int i=0; i<3; i++) {
			arr3[i] = arr1[i]; //기본타입 int 값 복사
		}
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("arr3");
		for(int i=0; i<3; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		arr1[1] = 200;
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("arr3");
		for(int i=0; i<3; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		int[] arr4 = new int[3];
		//arr1 -> arr4
		System.arraycopy(arr1, 0, arr4, 0, 3);
		
		//arr1
		//arr4
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("arr4");
		for(int i=0; i<3; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
		arr1[2] = 300;
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("arr4");
		for(int i=0; i<3; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
	}

}
