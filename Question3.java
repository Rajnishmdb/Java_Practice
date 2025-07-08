package sample;
import java.util.Scanner;
public class Question3 {
/* Write a program to implement all operation 1.Arithmetic 
   2.Relational 3.Conditional 4.Bitwise 5.Unary operator */
	public static void main(String[] args) {
    Scanner i = new Scanner(System.in);	
    int a,b,c,d;
    System.out.println("------------------------------------------------");
    System.out.println("# OPERATIION OF ARITHMETIC OPERATOR ");
    System.out.println("1:ADDITION(+) ");
    System.out.println("2:SUBTRACTION(-) ");
    System.out.println("3:MULTIPLICATION(*) ");
    System.out.println("4:DIVISION(/) "); 
    System.out.println("5:MODULUS(%) ");
    System.out.println("6:INCREMENT(++)");
    System.out.println("7:DECREMENT (--)");
    System.out.println("8:ADDITION ASSIGNMENT(+=) ");
    System.out.println("9:SUBTRACTION ASSIGNMENT(-=)");
    System.out.println("10:MULTIPLICATION ASSIGNMENT(*=)");
    System.out.println("11:DIVISION ASSIGNMENT(/=)");
    System.out.println("12:MODULUS ASSIGNMENT(%=)");
    System.out.println("0:EXIT");
    System.out.println("------------------------------------------------");
    System.out.println("Enter your choice: ");
    d = i.nextInt();
  if(d != 0)
  {	  
	  System.out.println("Enter the value of two operands");
      a = i.nextInt();
      b = i.nextInt();  
   switch(d)
   {
   case 1: System.out.println(" *OPERATION OF ADDITION( + ) OPERATOR");
           
           c = a+b;
           System.out.println(" \t\t"+a+"+"+b+" = "+c);
           System.out.println("press a key to continue");
           break;
   case 2: System.out.println(" *OPERATION OF SUBTRACTION (-) OPERATOR");
           
           c = a-b;
           System.out.println(" \t\t "+a+"-"+b+" ="+c);
           break;
   case 3: System.out.println(" *OPERATION OF MULTIPLICATION (*) OPERATOR");
           
           c = a*b;
           System.out.println(" \t\t"+a+"*"+b+" = "+c);
           break;
   case 4: System.out.println(" *OPERATION OF DIVISION( / )OPERATOR");
           
           c = a/b;
           System.out.println(" \t\t"+a+"/"+b+" = "+c);
           break;
   case 5: System.out.println(" *OPERATION OF MODULUS (%) OPERATOR");
           
            c = a%b;
           System.out.println(" \t\t "+a+" % "+b+" = "+c);
           break;
   case 6: System.out.println(" *OPERATION OF INCREMENT( ++ )OPERATOR");
           
           ++a;
           ++b ;
           System.out.println("  \t\t++a = "+a+"\n \t\t ++b= "+b);
           break;
   case 7: System.out.println(" *OPERATION OF DECREMENT(--) OPERATOR");
           
           --a;
           --b ;
           System.out.println(" \t\t --a = "+a+"\n \t\t --b= "+b);
           break;
   case 8: System.out.println(" *OPERATION OF ADDITION ASSIGNMENT( +=) OPERATOR");
          
           a +=b;
           b +=b;
           System.out.println("  \t\t(a += b)= "+a+"\n \t\t (b += b)= "+b);
           break;
   case 9: System.out.println(" *OPERATION OF SUBTRACTION ASSIGNMENT( -=) OPERATOR");
           
           a -=b;
           b -=b;
           System.out.println("  \t\t(a -= b)= "+a+"\n \t\t (b -= b)= "+b);
           break;
  case 10: System.out.println(" *OPERATION OF MULTIPLICATION ASSIGMENT OPERATOR (*=) OPERATOR");
           
           a *=b;
           b *=b;
           System.out.println(" \t\t (a *= b)= "+a+"\n \t\t (b *= b)= "+b);
           break;
  case 11: System.out.println(" *OPERATION OF DIVISION ASSIGNMENT( /= ) OPERATOR");
          
           a /=b;
           b /=b;
           System.out.println("\t\t (a /= b)= "+a+"\n \t\t (b /= b)= "+b);
           break;
  case 12: System.out.println(" *OPERATION OF MODULUS ASSIGNMENT( %= )OPERATOR");
           
           a %=b;
           b %=b;
           System.out.println(" \t\t (a %= b)= "+a+"\n \t\t (b %= b)= "+b);
           break;
   default : System.out.println("You entered wrong choice");
             break;
 }	
}  
i.close();
}
}

