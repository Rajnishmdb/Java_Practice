package sample;

import java.util.Scanner;

public class New3 {
	
 public static void main(String[] args) {
   Scanner i = new Scanner(System.in);	
    int a,b,c,d,x,y;
    System.out.println("------------------------------------------------");
	System.out.println("# OPERATIION OF ARITHMETIC OPERATOR ");
	System.out.println("Enter the value of two operands");
	  x = i.nextInt();
	  y = i.nextInt();
	  d=1;
	 while(d != 13)
	 {
	  switch(d)
	   {
	   case 1: System.out.println(" *OPERATION OF ADDITION( + ) OPERATOR");
	           a=x;
	           b=y;
	           c = a+b;
	           System.out.println(" \t\t"+a+"+"+b+" = "+c);
	           System.out.println("press a key to continue");
	           break;
	   case 2: System.out.println(" *OPERATION OF SUBTRACTION (-) OPERATOR");
	            a=x;
                b=y;
	           c = a-b;
	           System.out.println(" \t\t "+a+"-"+b+" ="+c);
	           break;
	   case 3: System.out.println(" *OPERATION OF MULTIPLICATION (*) OPERATOR");
	           a=x;
               b=y;
	           c = a*b;
	           System.out.println(" \t\t"+a+"*"+b+" = "+c);
	           break;
	   case 4: System.out.println(" *OPERATION OF DIVISION( / )OPERATOR");
	            a=x;
               b=y;
	           c = a/b;
	           System.out.println(" \t\t"+a+"/"+b+" = "+c);
	           break;
	   case 5: System.out.println(" *OPERATION OF MODULUS (%) OPERATOR");
	           a=x;
                b=y;
	            c = a%b;
	           System.out.println(" \t\t "+a+" % "+b+" = "+c);
	           break;
	   case 6: System.out.println(" *OPERATION OF INCREMENT( ++ )OPERATOR");
	            a=x; b=y;
	           ++a;
	           ++b ;
	           System.out.println("  \t\t++a = "+a+"\n \t\t ++b= "+b);
	           break;
	   case 7: System.out.println(" *OPERATION OF DECREMENT(--) OPERATOR");
	           a=x;
               b=y;
	           --a;
	           --b ;
	           System.out.println(" \t\t --a = "+a+"\n \t\t --b= "+b);
	           break;
	   case 8: System.out.println(" *OPERATION OF ADDITION ASSIGNMENT( +=) OPERATOR");
	            a=x;
                b=y;
	           a +=b;
	           b +=b;
	           System.out.println("  \t\t(a += b)= "+a+"\n \t\t (b += b)= "+b);
	           break;
	   case 9: System.out.println(" *OPERATION OF SUBTRACTION ASSIGNMENT( -=) OPERATOR");
	           a=x;
               b=y;
	           a -=b;
	           b -=b;
	           System.out.println("  \t\t(a -= b)= "+a+"\n \t\t (b -= b)= "+b);
	           break;
	  case 10: System.out.println(" *OPERATION OF MULTIPLICATION ASSIGMENT OPERATOR (*=) OPERATOR");
	            a=x;
                b=y;
	           a *=b;
	           b *=b;
	           System.out.println(" \t\t (a *= b)= "+a+"\n \t\t (b *= b)= "+b);
	           break;
	  case 11: System.out.println(" *OPERATION OF DIVISION ASSIGNMENT( /= ) OPERATOR");
	           a=x;
               b=y;
	           a /=b;
	           b /=b;
	           System.out.println("\t\t (a /= b)= "+a+"\n \t\t (b /= b)= "+b);
	           break;
	  case 12: System.out.println(" *OPERATION OF MODULUS ASSIGNMENT( %= )OPERATOR");
	           a=x;
               b=y;
	           a %=b;
	           b %=b;
	           System.out.println(" \t\t (a %= b)= "+a+"\n \t\t (b %= b)= "+b);
	           break;
	   	 }	
	  ++d;
	}  
	i.close();
}
}
