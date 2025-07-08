package sample;
/*Calculate circle area using java */
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
public class CircleAreaExample {

	public static void main(String[] args) {
	 
   int radius=0;
   System.out.println("please enter the radius of circle ");
   try {
	    //get the radius from console
	   BufferedReader br = new 
	   BufferedReader(new InputStreamReader(System.in));
	   radius = Integer .parseInt(br.readLine());
   }
	   catch(NumberFormatException ne)
	 {
		   System.out.println("Invalid radius Value"+ ne);
		   // system.exit(0);
	 }
   catch(IOException ioe)
   {
	   System.out.println("IO error"+ ioe);  
	// system.exit(0);
   }
    // NOTE : use Math.PI constant to get value of pi
   double area = Math.PI *radius*radius;
   System.out.println("Area of a circle is "+ area);
 }

}
