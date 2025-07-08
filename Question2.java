package sample;
import java.util.Scanner;
public class Question2 {
/* Compute area of circle triangle and rectangle*/
	public static void main(String[] args) {
	Scanner n = new Scanner(System.in);
	float a,b;
	System.out.println("Enter radius of circle");
	a = n.nextFloat();
	System.out.println("Area of circle is "+(3.14*a*a));
	System.out.println("Enter the hight and base of triangle");
	a = n.nextFloat();
	b = n.nextFloat();
	System.out.println("Area of triangle is "+((a*b)/2));
	System.out.println("Enter the lenght and width of rectangle");
	a = n.nextFloat();
	b = n.nextFloat();
	System.out.println("Area of rectangle is "+a*b);
	n.close();
	}

}
