package sample;

abstract class A{
	abstract void callme();
	 void callmetoo(){
	System.out.println(" This is non-abstract method");	
	}
}
class B extends A{
	void callme(){
		System.out.println(" This is abstract method and implementation of callme");
 }
	 
}
public  class AbstractDemo {
	public static void main(String[] args){
		B b = new B();
		b.callme();
		b.callmetoo();
       
	}

}
