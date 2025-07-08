package sample;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,m,n,o,p;
		int a[][] = new int [10][10];
		int b[][] = new int [10][10];
		int add[][]=new int[10][10];
		System.out.println("Enter the size of 1st matrix(m x n) : ");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println("Enter the size of 2nd matrix(o x p) : ");
		o = sc.nextInt();
		p = sc.nextInt();
		for( i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{	
			 System.out.println("Enter data a"+(i+1)+(j+1)+": ");
			 a[i][j] = sc.nextInt();
			}
		}
		for( i=0;i<o;i++)
		{
			for(j =0;j<p;j++)
			{
			 System.out.println("Enter data b"+(i+1)+(j+1)+": ");
			 b[i][j] = sc.nextInt();
			}
		}
		if(m<o)
			m=o;
		if(n<p)
			n=p;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{	
				add[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{	
			System.out.print("\t "+add[i][j]);
			}
			System.out.println();
		}
		
	 sc.close();		
	}

}

