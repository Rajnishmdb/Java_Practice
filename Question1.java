package sample;
import java.util.Scanner;
public class Question1 {
 /*Write a program print your details(name, roll no,fee) input from user. */
	public static void main(String[] args) {
    Scanner c = new Scanner(System.in);
    int roll,fee;
    String name;
    System.out.println("Enter your name ");
    name =c.next();
    System.out.println("Enter your roll no. ");
    roll = c.nextInt();
    System.out.println("Enter your fee");
    fee = c.nextInt();
    System.out.println(" I am "+name+" and my roll No. is "+roll+".\n  I have to pay "+fee+" rupees as fee");
    c.close();
	}
}
