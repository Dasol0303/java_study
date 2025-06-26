package study.exp;

public class Exp02 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try {
			
			//NullPointerException
			//arr = null;
			//arr[1] = 10;
			
			//ArrayIndexOutOfBoundsException
			arr[10] = 10;
			
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생함");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생함");
		} catch (Exception e) {
			System.out.println("Exception 발생함");
		}

	}

}
