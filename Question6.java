package sample;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int [50];
		int sum = 0;
		System.out.println("Enter total number of element in array");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter data "+(i+1)+": ");
			 a[i] = sc.nextInt();
		}
		System.out.println("Displaying your array");
		for(int i=0;i<n;i++)
		{
			sum = sum +a[i];
			System.out.println(a[i]);
		}
		System.out.println("Sum of array element = "+sum);
		 sc.close();
	}
}
