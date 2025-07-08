package sample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {

	public static void main(String[] args) {
	 int marks=0;
	 try{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 System.out.println("Enter the mark");
    	 marks = Integer.parseInt(br.readLine());
     }
     catch(NumberFormatException ne){
    	 System.out.println("Invalid value"+ne);
     }
     catch(IOException ioe){
    	 System.out.println("IO Error : "+ioe);
     }
	 if(marks<30)
		 System.out.println("you failed");
	 else
		 System.out.println("You passed");
	}

}
