package inheritance;

public class MultilevelEx1 extends MultilevelEx {   //child class B
	public void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("product="+c);
	}
	public void div() {
		int a=100;
		int b=50;
		int c=a/b;
		System.out.println("div="+c);
	}
}


