package sample;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		int i,j,m,n,o,p;
		Scanner sc = new Scanner(System.in);
		int a[][] = new int [10][10];
		int b[][] = new int [10][10];
		int mul[][]=new int[10][10];
		System.out.println("Enter the size of 1st matrix(m x n) : ");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println("Enter the size of 2nd matrix(o x p) : ");
		o = sc.nextInt();
		p = sc.nextInt();
		if(n!=o)
		{
			System.out.println("Multiplication not possible");		
		}
		else
		{
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
		System.out.println("multiplication of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<p;j++)
			{	
			 for(int k=0;k<p;k++)
				mul[i][j] += (a[i][k]*b[k][j]);
			 System.out.print("\t "+mul[i][j]);
			}
			System.out.println();
		}
	}
	 sc.close();		
	}
}
