package sample;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		  int n,j,k;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number: ");
		  n = sc.nextInt();
		  k=0;
		     for(j=1;j<=n;j++)
		     {
			if(n%j==0)
			  k++;
		     }
		     if(k==2)
		     {
		    	 System.out.println("Given number is a prime number ");
		     }
		     else
		    	 System.out.println("Given number is not a prime number ");
          sc.close();
       }
   }