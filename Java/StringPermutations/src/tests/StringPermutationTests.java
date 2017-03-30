package tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StringPermutationTests {
	
	@Test
	public void testHat(){
		String s = "hat";
		List<String> expected = new ArrayList<String>(Arrays.asList(new String[]{"aht", "ath", "hat", "hta", "tah", "tha"}));
		List<String> results = solution.StringPermuatation.generatePermutations(s);
		
		for(int i=0; i<expected.size(); ++i){
			assertTrue("Expected: "+expected.get(i)+". got: "+results.get(i), 
					results.get(i).equals(expected.get(i)));
		}
	}
	
	@Test
	public void testABC(){
		String s = "abc";
		List<String> expected = new ArrayList<String>(Arrays.asList(
				new String[]{"abc", "acb", "bac", "bca", "cab", "cba"}));
		List<String> results = solution.StringPermuatation.generatePermutations(s);
		
		for(int i=0; i<expected.size(); ++i){
			assertTrue("Expected: "+expected.get(i)+". got: "+results.get(i), 
					results.get(i).equals(expected.get(i)));
		}
	}
	
	@Test
	public void testZu6(){
		String s = "Zu6";
		List<String> expected = new ArrayList<String>(Arrays.asList(
				new String[]{"6Zu", "6uZ", "Z6u", "Zu6", "u6Z", "uZ6"}));
		List<String> results = solution.StringPermuatation.generatePermutations(s);
		
		for(int i=0; i<expected.size(); ++i){
			assertTrue("Expected: "+expected.get(i)+". got: "+results.get(i), 
					results.get(i).equals(expected.get(i)));
		}
	}

}
