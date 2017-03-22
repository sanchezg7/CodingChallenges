package oddOccurences;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9,3,9,3,9,7,9};
		
		System.out.println(solution(A));
	}
	
	private static int solution(int[] A){
		HashSet<Integer> collection = new HashSet<Integer>();
		
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

