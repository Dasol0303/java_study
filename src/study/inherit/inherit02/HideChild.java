package study.inherit.inherit02;

import study.inherit.inherit01.Parent;

public class HideChild extends Parent {

	public HideChild() {
		super(0);
	}
	public void printInfo() {
		System.out.println(money); 
		// money에 접근 X 같은 패키지가 아니라서!!
		// 접근하려면 부모 클래스에 protected 걸어줘야함
	}
	
}
