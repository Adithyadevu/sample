
package accessmodifiers;

public class Firstaccesmodiex {
 public void display1(){
		System.out.println("hello..");
	}
  protected void display2(){
	System.out.println("world..");
}
  private void display3(){
	System.out.println("nature..");
}
 void display4(){
	System.out.println("beautiful..");
}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	Firstaccesmodiex obj=new Firstaccesmodiex();
	obj.display1();
	obj.display2();
	obj.display3();
	obj.display4();

	}

}
