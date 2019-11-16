//Qinyao Zhang 11.16.19
package Main;

public class JavaSwitch {

	/*	switch(expression) {
	  		case x:
	    		// code block
	    		break;
	  		case y:
	    		// code block
	    		break;
	  		default:
	    		// code block
		}
	*/
	
	public static void main(String[] args) {
		
		int day = 7;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break; //need to add break otherwise it will continue run next case
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
			System.out.println("Input must between 1 and 7");  
		}

	}

}
