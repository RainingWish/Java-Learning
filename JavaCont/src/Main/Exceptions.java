//Qinyao Zhang 11.18.19
package Main;

//Exception is use to catch error and tell user what error is


public class Exceptions {
	
	//throw statement allows you to create a custom error.
	static void checkAge(int age) {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	}

	public static void main(String[] args) {
		
		//try catch 
		
		try {
			int[] myNumbers = {1,2,3,4};
			System.out.println(myNumbers[10]);//if not have exception will be an error
		}catch(Exception e) {
			System.out.println("wrong input");
		}finally { //finally let you execute code
			System.out.println("try catch finish");
		}
		
		//check throw
		//checkAge(15); //output will be an error
		
		checkAge(20);
		
	}
	
}