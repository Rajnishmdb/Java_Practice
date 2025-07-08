package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		 int num=0,sum=0,i=0,j=0;
		 try{
	    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	 System.out.println(" You want to know sum of 1st ? even numbers");
	    	 j = Integer.parseInt(br.readLine());
	     }
	     catch(NumberFormatException ne){
	    	 System.out.println("Invalid value"+ne);
	     }
	     catch(IOException ioe){
	    	 System.out.println("IO Error : "+ioe);
	     }
		 num = 2;
		 sum = 0;
		 System.out.println(" Even numbers are:");
		 for(i=1;i<=j;++i)
		 {
		  sum = sum + num;
		  System.out.println("	"+num);
		  num = num +2;
		  }
		 System.out.print(" Sum of " +j);
		 System.out.println(" even numbers is :"+sum);
	}

}
