package oddOccurences;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9};
		
		System.out.println(solution(A));
	}
	
	private static int solution(int[] A){
		Set<Integer> collection = new HashSet<Integer>();
		
		for(int number : A){
			if(collection.contains(number)){
				collection.remove(number);
			}else {
				collection.add(number);
			}
		}
		
		return collection.iterator().next();
	}

}

