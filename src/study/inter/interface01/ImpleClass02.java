package study.inter.interface01;

public class ImpleClass02 implements Interface01, Interface02{

	@Override
	public void method3() {
		System.out.println("Imple02 method3");
	}

	@Override
	public void method1() {
		System.out.println("Imple02 method1");
	}

	@Override
	public void method2() {
		System.out.println("Imple02 method2");
	}
	

}
