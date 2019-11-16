//Qinyao Zhang 11.16.19
package Main;

//Reverse Integer
public class Leetcood2 {

	 public static int reverse(int x) {
	     if (x > 2147483647 | x < -2147483647 ) {
	    	 return 0;
	     }
		 int R = 0;
	        while(x != 0) {
	            int digit = x % 10; //get last digit
	            R = R * 10 + digit; //add to tail of reverse number
	            x = x/10;			//it is int not float remove the last digit
	            System.out.println(x);
	        }
	        return R;
	    }

	 public static void main(String[] args) {
		 int x = 12345678;
		 int y = reverse(x);
		 System.out.println(y);
		 x = 1534236469;
		 System.out.println(reverse(x));//output 1056389759
	 }
}
