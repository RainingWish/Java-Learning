//Qinyao Zhang 11.16.19
package Main;

public class JavaBreakContinue {

	public static void main(String[] args) {
		// The break statement can also be used to jump out of a loop.
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}

		//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

		//This example skips the value of 4:
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		
		//Break and continue in while loop
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		}
		
		i = 0;
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		}
	}

}
