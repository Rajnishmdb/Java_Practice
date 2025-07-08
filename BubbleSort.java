package sample;

import java.util.Scanner;

public class BubbleSort {
	static void bubblesort(int arr[],int n)
    {
		int i ,j;
		int temp;
		for(i=0;i<n;i++)
		{
		 for(j=0;j<n-i;j++)
		 {
			if(arr[j]>arr[j+1] && j+1 < n-i)
			{
				System.out.println("  "+arr[j]+" & "+arr[j+1]);
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]= temp;
			}
		 }
		}
	}
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
		bubblesort(a,n);
		System.out.println("Displaying your array");
		for(int i=0;i<n;i++)
		{
			
			System.out.print("  "+a[i]);
			sum = sum+ a[i];
		}
		System.out.println("\n Sum of array element = "+sum);
		 sc.close();
	}
}


	



