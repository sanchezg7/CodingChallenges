
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={3,8,9,7,6};
		System.out.println(solution(A, 3));
	}
	
	/**
	 * K rotations == K shifts (to the right) 
	 * Elements that jump off of the array are wrappend around and placed accordingly
	 * @param A
	 * @param K
	 * @return
	 */
	public static int[] solution(int[] A, int K){
		int[] shifted = new int [A.length]; 
		
		for(int i=0; i<A.length; ++i){
			shifted[(i+K)%A.length] = A[i];
		}
		return shifted;
	}

}

