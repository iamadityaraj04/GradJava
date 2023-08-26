package programs;

class A{
	final int var=50;
	final int x;
	A(){
		x=50;
	}
	final public void greet() {
		System.out.println("Hi from A class");
	}
}
final class BB extends A{
	//final method can not be overridden
//	public void greet(){
//		System.out.println("Hello from B class");
//	}
}
class CC //extends B
{
}
public class FinalDemo {
	public static void main(String args[]) {
		final int x=10;
		System.out.println(x);
		//x=20;
		System.out.println(x);
		
		A a1=new A();
		System.out.println(a1.var);
		//a1.var=100;
		System.out.println(a1.var);
		
		a1.greet();
		
		BB b1=new BB();
		b1.greet();
	}
}
