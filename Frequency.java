package sample;
import java.util.*;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getUniqueLetter("statistics"));

	}

	public static int getUniqueLetter(String s){
	    HashMap<Character,Integer> h = new HashMap<Character, Integer>();
	    for (int i=0;i<s.length();i++){
	      //h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
	    	if (h.containsKey(s.charAt(i))) {
				h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}
	    	else {
				h.put(s.charAt(i),1);
			}
	    } 
	    char u = s.charAt(0);
	    boolean found = false;
	    for(Map.Entry<Character,Integer> e:h.entrySet()) {
	    	if(e.getValue() == 1) {
	    		found = true;
		    	u = e.getKey();
		    	break;
	    	}
	    	
	    }
	    if (found) {
			return s.indexOf(u)+1;
		}
	    else {
			return -1;
		}
	    
	  }
}
