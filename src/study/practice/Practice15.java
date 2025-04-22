package study.practice;
public class Practice15 {
	 
 	public static void main(String[] args) {
 		
 		for(int i=1; i<=3; i++) {
 			for(int j=1; j<=3; j++) 
 				System.out.print(j);
 			System.out.println();
 		}
 		
 		for(int i=3; i>=1; i--) {
 			for(int j=1; j<=i; j++) 
 				System.out.print(j);
 			System.out.println();
 		}
 		
 		for(int i=1; i<=3; i++) {
 			for(int j=1; j<=i; j++) 
 				System.out.print(j);
 			System.out.println();
 		}
 		
 		for(int i=11; i<=20; i++) {
 			if(i%2==0 && i%3 == 0)
 				System.out.println(i);
 			else if(i%4 == 0)
 				System.out.println(i);
 			
 			if(i%5 == 0)
 				System.out.println(i);
 		}
 	}
 
 }