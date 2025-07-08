package sample;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		  int i,n,j,k,num=0;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the value of n: ");
		  n = sc.nextInt();
		  System.out.println("Prime numbers between 1 and "+n+" are:\n");
		  for(i=1;i<n;i++)
		  {
		     k=0;
		     for(j=1;j<n;j++)
		     {
			if(i%j==0)
			  k++;
		     }
		     if(k==2)
		     {
		    	 num++;
		       System.out.println("\t"+i);
		     }
		  }
		  System.out.println("Total prime number are"+num);
         sc.close();

	}

}
