package sample;

     import java.io.BufferedReader;
     import java.io.IOException;
     import java.io.InputStreamReader;
public class Bufferedinput {
	public static void main(String[] args) {
     int a=0;
     int b=0;
     int c=0;
     try{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 System.out.println("Enter the value of a and b");
    	 a = Integer.parseInt(br.readLine());
    	 b = Integer.parseInt(br.readLine());
     }
     catch(NumberFormatException ne){
    	 System.out.println("Invalid value"+ne);
     }
     catch(IOException ioe){
    	 System.out.println("IO Error : "+ioe);
     }
     c = a+b;
     System.out.println("sum = "+c);
	}
}




