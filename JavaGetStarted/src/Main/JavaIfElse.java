//Qinyao Zhang 11.16.19
package Main;

public class JavaIfElse {

	/* if
	 * if (condition) {
  			// block of code to be executed if the condition is true
		}
	 */
	
	/* if-else
	 *  if (condition) {
  			// block of code to be executed if the condition is true
		} else {
  			// block of code to be executed if the condition is false
		}
	 */
	
	public static void main(String[] args) {
		
		if (20 > 18) {
			  System.out.println("20 is greater than 18");
			}
		
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}

		time = 20;
		String result = (time < 18) ? "Good day." : "Good evening."; // can be short
		System.out.println(result);
		
		time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
	}

}
