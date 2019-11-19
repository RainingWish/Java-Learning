//Qinyao Zhang 11.18.19
package Main;
import java.util.ArrayList;

/*
 Primitive Data Type	Wrapper Class
		byte				Byte
		short				Short
		int					Integer
		long				Long
		float				Float
		double				Double
		boolean				Boolean
		char				Character
 */

public class Wrapper {

	public static void main(String[] args) {
		
		// ArrayList and Hashmap must use wrapper classes
		//ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
		ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

		//create a wrapper object
		Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    //normal print
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
	    //use method inside wrapper obj
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	    
	    //convert int to string
	    myInt = 999;
	    String myString = myInt.toString();
	    System.out.println(myString.length());//check length
	    
	}

}
