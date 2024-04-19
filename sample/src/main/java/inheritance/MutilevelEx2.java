package inheritance;

public class MutilevelEx2 extends MultilevelEx1{             //child class C
	public void disp(){
		System.out.println("Multilevel inheritance");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MutilevelEx2 obj=new MutilevelEx2();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.disp();

	}

}
