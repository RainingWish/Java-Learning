//Qinyao Zhang 11.16.19
package Main;

public class JavaWhileLoop {

	/*
	 * while (condition) {
  			// code block to be executed
		}
	 */
	
	/*
	 *do {
  		// code block to be executed
		}
		while (condition); 
	 */
	
	public static void main(String[] args) {
		
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}

		//The do/while loop will always be executed at least once, even if the condition is false
		i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
	}

}
