package study.practice.practice41;

public class KitchenPlace {//공간
	
	String color; //벽지 색
	int heigthM;//층고
	int squareM;//평수
	
	
	KitchenPlace(){}
	KitchenPlace(String color, int heigthM, int squareM){
		this.color = color;
		this.heigthM = heigthM;
		this.squareM = squareM;
	}
	
	public String toString() {
		String str = String.format("주방공간 {평수:%d평  벽지색상:%s색  층고높이:%dm}", squareM, color, heigthM);
		return str;
	}
	
}
