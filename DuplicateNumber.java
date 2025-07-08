package sample;
 import java.util.Scanner;
 
public class DuplicateNumber {
	static void D(int a[],int n)
	 {
		
	 int i,j, dup = 0;
		for(i=0;i<n;i++)
		  {
		     for(j=1;j<n;j++)
		     { 
		    	 if(a[i] == a[j])
		    	{
		    		if(i!=j) 
		    	     dup++;
		    	}
		    	
		    	 
		     }
	     }
		System.out.println(" "+dup);
	 }
            public static void main(String[] args) {
			int a[] = new int [50];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter total number of element in array");
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter data "+(i+1)+": ");
				 a[i] = sc.nextInt();
			}
			D(a,n);
			 sc.close();
	
	}

}
