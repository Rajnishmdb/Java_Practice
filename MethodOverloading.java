package sample;
 class Sum { 
	  
   int sum(int x, int y) 
    { 
        return (x + y); 
    } 
  
    int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    double sum(double x, double y) 
    { 
        return (x + y); 
    } 
  } 

public class MethodOverloading {
	 public static void main(String args[]) 
	    { 
	        Sum s = new Sum(); 
	        System.out.println("int sum(x,y) = "+s.sum(10, 20)); 
	        System.out.println(" int sum(x,y,z) = "+s.sum(10, 20, 30)); 
	        System.out.println("double  sum(x,y) = "+s.sum(10.5, 20.5)); 
	    } 
}
