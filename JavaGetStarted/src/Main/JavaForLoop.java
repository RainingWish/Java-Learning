//Qinyao Zhang 11.16.19
package Main;

public class JavaForLoop {

	/*for (statement 1; statement 2; statement 3) {
		  // code block to be executed
		 }
	Statement 1 is executed (one time) before the execution of the code block.
	Statement 2 defines the condition for executing the code block.
	Statement 3 is executed (every time) after the code block has been executed.
	*/
	
	
	/*There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
	 * for (type variableName : arrayName) {
  			// code block to be executed
		}
	 */
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
		
		for (int i = 0; i <= 10; i = i + 2) {
			  System.out.println(i);
			}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
	}
}
