package sample;

public class ExceptionalHandlind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int d,a;
     try {
    	 d=0;
    	 a=42/d;
    	 System.out.println("Not printable");
        }
     catch(ArithmeticException e){
    	 System.out.println("Division by zero"); 
     }
	 System.out.println("After catch statement");
  }
}
