package sample;

public class TestMemberOuter1 {
	 int data= 55;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
	  TestMemberOuter1 obj=new TestMemberOuter1();  
	  TestMemberOuter1.Inner in=obj.new Inner();  
	  in.msg();    
	 }  
   }  


