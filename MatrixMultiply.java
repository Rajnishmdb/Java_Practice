package sample;
import java.util.Scanner;
public class MatrixMultiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int [10][10];
		int b[][] = new int [10][10];
		int add[][]=new int[10][10];
		int sub[][]=new int[10][10];
		int mul[][]=new int[10][10];
		//System.out.println("Enter total number of element in array");
		//int n = sc.nextInt();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{	
			 System.out.println("Enter data a"+(i+1)+(j+1)+": ");
			 a[i][j] = sc.nextInt();
			 System.out.println("Enter data b"+(i+1)+(j+1)+": ");
			 b[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{	
				add[i][j]=a[i][j]+b[i][j];
				sub[i][j]=a[i][j]-b[i][j];
				for(int k=0;k<3;k++)
				mul[i][j] += (a[i][k]*b[k][j]);
			}
		}
		System.out.print("Sum of matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{	
			System.out.print("\t "+add[i][j]);
			}
			System.out.println();
		}
		System.out.print("Sub of matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{	
			System.out.print("\t "+sub[i][j]);
			}
			System.out.println();
		}
		System.out.print("multipl of matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{	
			System.out.print("\t "+mul[i][j]);
			}
			System.out.println();
		}
	 sc.close();		
	}
}
