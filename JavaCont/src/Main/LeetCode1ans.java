//Qinyao Zhang 11.18.19
package Main;

public class LeetCode1ans {

	public static String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) return ""; //null check
	    for (int i = 0; i < strs[0].length() ; i++){
	        char c = strs[0].charAt(i); //get char from strs[0]
	        for (int j = 1; j < strs.length; j ++) {
	            if (i == strs[j].length() || strs[j].charAt(i) != c)
	            	//i == strs[j].length() strs[j] cannotlongger than strs[0]
	            	//if longer dont need to check follow char
	            	//strs[j].charAt(i) != c compare c and char at strs[j]
	                return strs[0].substring(0, i);
	            	//if statement fail, return first i char
	        }
	    }
	    return strs[0];
	    //if pass loop return all char from strs[0]
	}
	
	
	public static void main(String[] args) {
		
		String[] input = {"flower","flower","flower"};
		System.out.println(longestCommonPrefix(input));
		
	}
	
}
