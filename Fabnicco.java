package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fabnicco {

	public static void main(String[] args) {
		 int limit=0,a=0,b=1,c=0,i=0;
		 try{
	    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	 System.out.println("Enter the limit");
	    	 limit = Integer.parseInt(br.readLine());
	     }
	     catch(NumberFormatException ne){
	    	 System.out.println("Invalid value"+ne);
	     }
	     catch(IOException ioe){
	    	 System.out.println("IO Error : "+ioe);
	     }
		 System.out.println(" fabinicco series : ");
		 System.out.println(a);
		 System.out.println(b);
		 for(i=1;i<=limit-2;++i)
		 {
		  c = a + b;
		  System.out.println(" "+c);
		  a = b;
		  b = c;
		 }
	}

}
