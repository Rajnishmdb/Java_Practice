package sample;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,n,temp,j;
		 int a[]= new int[20];
		 Scanner sc = new Scanner(System.in);
		 System.out.println("\nEnter the size of array");
		 n = sc.nextInt();
		 System.out.println("\nEnter the value in array \n");
		 for(i=0;i<n;i++)
		 {
			 System.out.println("\nElement( "+(i+1)+") =");
		      a[i]= sc.nextInt();
		 }
		 for(i=0;i<n;i++)
		 {
		  for(j=0;j<n-i;j++)
		  {
		    if(a[j]>a[j+1] && j+1< n-i)
		    {
		    temp =a[j];
		    a[j] = a[j+1];
		    a[j+1] = temp;
		    }
		   }
		 }
		/* System.out.println("Sorted array :-\n\t");
		 for(i=0;i<n;i++)
		 {
			 System.out.println(a[i]);
		 }*/
		 System.out.println("\n\t 1st Largest = "+a[n-1]);
		 System.out.println("\n\t 2nd Largest = "+a[n-2]);
		 sc.close();
		}
	}


