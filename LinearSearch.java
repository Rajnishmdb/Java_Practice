package sample;
 import java.util.Scanner;
public class LinearSearch {
	public static int linearSearch(int[] a,int n, int data){   
        for(int i=0;i<n;i++){    
            if(a[i] == data){    
                return i;    
            }    
        }    
        return -1;    
    }    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int [50];
		System.out.println("Enter total number of element in array");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter data "+(i+1)+": ");
			 a[i] = sc.nextInt();
		}
		System.out.println("Enter data  to be searched");
		int data = sc.nextInt();
        int pos = linearSearch(a,n,data);    
        System.out.println(data+" is found at index: "+pos+(" and at position ")+(pos+1));    
       sc.close();
	}
}
