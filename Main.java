package sample;

//An abstract class with a final method 
abstract class Base { 
	 void fun() { System.out.println("Derived fun() called"); } 
} 

class Derived extends Base {} 

class Main { 
	public static void main(String args[]) { 
	Base b = new Derived(); 
	b.fun(); 
	} 
} 
