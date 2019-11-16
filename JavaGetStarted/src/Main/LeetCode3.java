//Qinyao Zhang 11.16.19
package Main;

//Palindrome Number

public class LeetCode3 {

	public boolean isPalindrome(int x) {
	       int O = x;
	        int R = 0;
		        while(x != 0) {
		            int digit = x % 10; //get last digit
		            R = R * 10 + digit; //add to tail of reverse number
		            x = x/10;			//it is int not float remove the last digit
		        }
		    if(O>=0 & O == R){
	            return true;
	        }else{
	            return false;
	        } 
	    }
}
