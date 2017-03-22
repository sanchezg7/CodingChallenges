package binaryGap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5));
	}
	
	public static int solution(int N) {
        // write your code in Java SE 8
		
        String payload = convertIntToBinary(N);
        String[] tokens = payload.split("1");
        int maxLength = 0;
        if(tokens.length == 0){return 0;}
        //Calculate binary gap only if the token is not a collection of trailing zeros
        if(tokens!= null && tokens[tokens.length-1].equals("")){
        	maxLength = calculateBinaryGapLength(tokens[tokens.length-1]);
        }
        //start from the second last token and work backwards
        for(int i=tokens.length-2; i>0; --i){
        	int binaryGapLength =calculateBinaryGapLength(tokens[i]); 
        	if(maxLength < binaryGapLength){
        		maxLength = binaryGapLength;
        	}
        }

        return maxLength;
    }
    
    //convert an integer into a byte array
    private static String convertIntToBinary(int number){
        return Integer.toBinaryString(number).trim();   
    }
    
    //call zero length calc, update if max
    
    //calculate length of 0 occurances until hits 1
    private static int calculateBinaryGapLength(String binaryGap){
        return binaryGap.length();
    }

}

