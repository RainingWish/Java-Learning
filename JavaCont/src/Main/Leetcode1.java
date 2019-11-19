//Qinyao Zhang 11.18.19
package Main;

//Longest Common Prefix
//with bug to complex cant fix

public class Leetcode1 {

	public static String longestCommonPrefix(String[] strs) {
        
		for (int i=0; i<strs.length; i++) {
			if(strs[i]==null) {
				return "";
			}
		}
		int num = 0;
		String ans = strs[0];
		
		for (int j = 0;j<strs[0].length();j++) {
			int cont = 1;
			char c = strs[0].charAt(j);
			for (int k = 1; k < strs.length; k++){
				for(int n = 0; n<strs[k].length(); n++) {
					if(c == strs[k].charAt(n)) {
						cont +=1;
					}
				}
			}
			if(cont != strs.length) {
				if(j==0) {
					return "";
				}else {
					num = j;
					break;
				}
			}
			
		}
		ans = ans.substring(0, num);
		return ans;
			
    }
	
	public static void main(String[] args) {
		
		String[] input = {"rog","rcecar","rar"};
		System.out.println(longestCommonPrefix(input));
		
	}

}
