package sample;
import java.util.*;

public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tools[] = {"black", "gray", "brown", "red", "pink"};
		ArrayList<String> l = new ArrayList<>();
		Collections.addAll(l,tools);
		int start = 3;
		String target = "black";
		System.out.print(shiftCards(l,start,target));
	}
	
	public static int shiftCards(List<String> cards, int startIndex, String target){
		int endIndex = cards.indexOf(target);
		int forward = 0, backward = 0;
		if(endIndex == startIndex)
			return 0;
		if(Math.abs(startIndex - endIndex)== 1)
			return 1;
		if(startIndex < endIndex) {
			forward = endIndex - startIndex;
			backward = startIndex + (cards.size()-1 - endIndex) +1;
		}
		if(endIndex < startIndex) {
			forward = endIndex + (cards.size() -1-startIndex)+1;
			backward = startIndex - endIndex;
		}
		if (forward < backward) {
			return forward;
		}
		else {
			return backward;
		}
		
	}
	  
}
