package sample;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		int num=0,temp,reverse,rem,sum =0; 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    num = sc.nextInt();
	    temp = num;
		reverse =0;
		while(temp>0){
		 rem = temp % 10;
		 sum = sum +rem;
		 reverse = reverse * 10 + rem;
	     temp = temp / 10;
		 }
		System.out.println(" Your reverse number "+reverse+"nd sum of digt "+sum);
		sc.close();
	}

}
