package sample;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		int i,j,row;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number of rows ");
		 row = sc.nextInt();
		 for(i=row;i>=1;i--)
		 {
		  for(j=1;j<=i;j++)
		  {
			  System.out.print(" * ");
		   }
		 System.out.println();
        }
      sc.close();
  

	}

}
