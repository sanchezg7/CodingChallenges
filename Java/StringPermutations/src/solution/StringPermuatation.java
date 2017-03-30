package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class StringPermuatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generatePermutations("hat"));
		System.out.println(generatePermutations("abc"));
		System.out.println(generatePermutations("Zu6"));
	}
	
	/**
	 * Find all permutations of a string, in order
	 * digits < uppercase letters < lowercase letters
	 * @param s
	 * @return a List of possible permutations
	 */
	public static List<String> generatePermutations(String s){
		List<String> perms = new ArrayList<>();
		//base case
		if(s.length()==1){
			perms.add(s);
			return perms;
		}else if(s.length()==0){
			perms.add("");
			return perms;
		}
		
		PriorityQueue<Character> minHeap = new PriorityQueue<>();		
		for(int i=0; i<s.length(); ++i){
			minHeap.add(s.charAt(i));
		}
		
		while(!minHeap.isEmpty()){
			StringBuffer tempPerm = new StringBuffer();
			char orderedChar = minHeap.poll();
			String withoutChar = deleteChar(orderedChar, s);
			tempPerm.append(orderedChar);
			List<String> permResults = generatePermutations(withoutChar);
			for(String perm : permResults){
				perms.add(tempPerm.toString() + perm);
			}
		}
		return perms;
		
	}
	
	/**
	 * Deletes the first instance of a char
	 * @param target
	 * @param s
	 * @return
	 */
	public static String deleteChar(char target, String s){
		StringBuilder sb = new StringBuilder(s);
		
		for(int i=0; i<sb.length(); ++i){
			if(sb.charAt(i) == target){
				sb.deleteCharAt(i);
				return sb.toString();
			}
		}
		 return s;
	}

}
