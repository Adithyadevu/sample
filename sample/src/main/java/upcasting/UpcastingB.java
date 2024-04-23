package upcasting;

public class UpcastingB extends UpcastingA{
	public void print() {
		System.out.println("Single inheritance");
		System.out.println("Parent class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UpcastingA obj=new UpcastingB();
obj.print();
	}

}