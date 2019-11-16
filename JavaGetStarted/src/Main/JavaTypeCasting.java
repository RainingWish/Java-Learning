//Qinyao Zhang 11.16.19
package Main;

public class JavaTypeCasting {
	
	/*Widening Casting (automatically) - converting a smaller type to a larger type size
	*byte -> short -> char -> int -> long -> float -> double
	*/
	
	public static void main(String[] args) {
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
	    
	    myDouble = 9.78;
	    myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9

	}

}
