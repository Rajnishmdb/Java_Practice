package sample;

public class MString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("\\ Method of String class \\\n");
		 String s1=new String("Rajnish Ranjan"); 
		 String s2=new String("Ranjan");
		 System.out.println("\t s1=new String(Rajnish Ranjan)");
		 System.out.println("\t s2=new String(Ranjan)");
		 System.out.println("\ts1.length() =  "+s1.length());
		 System.out.println("\ts2.length() =  "+s2.length());
		 System.out.println("\t s1.equals(s2) =  "+s1.equals(s2));
		 System.out.println("\t (s1== s2) =  "+(s1 == s2));
		 s1 = s1.concat(s2);
		 System.out.println("\ts1.concat(s2) =  "+s1);
		 char result = s1.charAt(8);
	     System.out.println("\t char result = s1.charAt(8) =   "+result);
	     int r = s1.compareTo( s2 );
	      System.out.println("\tint r = s1.compareTo( s2 )= " +r);
	      System.out.println("\ts1.indexOf( 'R' ) = "+s1.indexOf( 'R' ));
	      System.out.println("\ts2.indexOf( 'R' ) = "+s2.indexOf( 'R' ));
	      System.out.println("\ts1.replace('A','R') = "+s1.replace('R','A'));
		 StringBuffer s=new StringBuffer("Rajnish Ranjan");
		 System.out.println("\\ Method of StringBuffer class \\\n");
		 System.out.println("\t s=new StringBuffer(Rajnish Ranjan)");
		 s.insert(0,"Er."); 
	     System.out.println("\ts.insert(0,Er)  = "+s);
	     s.delete(0,3); 
	     System.out.println("\ts.delete(0,3) =  "+s); //returns forGeeks 
	     s.deleteCharAt(7); 
	     System.out.println("\ts.deleteCharAt(7) = "+s);
	     s.replace(0,7,"R."); 
	     System.out.println("\ts.replace(0,7,R) = "+s);
	     s.reverse();
	     System.out.println("\ts.reverse()  =  "+s); 
	     System.out.println("\ts.length() =  "+s.length());
	     System.out.println("\ts.capacity()  =  "+s.capacity());	
	     }

}
