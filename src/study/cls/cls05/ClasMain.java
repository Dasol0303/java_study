package study.cls.cls05;

public class ClasMain {

	public static void main(String[] args) {
		
		int n1 = 20;
		int n2 = 30;
		int[] nArr = {10,20};
		int[] nArr2 = new int[5];
		
		// nArr[0]
		
		Temp t1 = new Temp();
		Temp t2 = new Temp();
		Temp[] tArr2 = {t1, t2};
		Temp[] tArr = new Temp[3];//-> 배열 공간을 만들겠다는 의미
					//new Temp(); -> 객체 만들겠다는 의미
		
		Temp[] tArr3 = {new Temp(), new Temp(), new Temp()};
		
		t1.method();
		//tArr[0].method(); //NullPointerException
		//Temp라는 공간이 들어올 수 있는 공간을 만들어줌!!
		tArr[0] = new Temp();
		tArr[1] = new Temp();
		tArr[2] = new Temp();
		
		for(int i=0; i<tArr.length; i++) {
			tArr[i] = new Temp();
			tArr[i].method();
		}
		
		System.out.println(methodA(30));
		
		t1.name = "t1";
		Temp result = methodB(t1);
		System.out.println(result.name);
		
		int[] result2 = methodC(nArr);
		for(int i=0; i<result2.length; i++) {
			System.out.print(result2[i] + " ");
		}
		System.out.println();
		
		Temp[] result3 = methodD(tArr2);
		System.out.println("---result3----");
		for(Temp t : result3) {
			t.method();
		}
		
		Temp[] rrr = methodE(null);
		if(rrr != null) {
			rrr[0].method();
		}
		
		//rrr[0].method(); -> null = 없는 값을 불러오려 해서 오류
	}
	
//----------------------여긴 메소드----------------------------
	public static int methodA(int n) {
		return n + 30; //int 반환 => 가능
	}
	
	public static Temp methodB(Temp t) {
		System.out.println(t.name);
		
		Temp tt = new Temp();
		
		return tt;
	}
	
	public static int[] methodC(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int n : arr) {
			
		}
		int[] result = {1,2,3,4};
		
		return result;
	}

	public static Temp[] methodD(Temp[] tArr) {
		for (int i=0; i<tArr.length; i++) {
			tArr[i].method();
		}
		
		for(Temp t : tArr) {
			t.method();
		}
		
		Temp[] arr = {new Temp(), new Temp(), new Temp()};
		
		return arr;
	}
			//					Temp tt = null;
	public static Temp[] methodE(Temp tt) {
		return null;
		
		//Temp[] tArr = null;
	}
}
