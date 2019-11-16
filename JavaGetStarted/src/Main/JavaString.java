//Qinyao Zhang 11.16.19
package Main;

public class JavaString {

	public static void main(String[] args) {
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());

		txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		/* The indexOf() method returns the index (the position)
		 * of the first occurrence 
		 * of a specified text in a string (including whitespace)
		 */
		txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7
		
		//concat() function same as " "
		String firstName = "Qinyao ";
		String lastName = "Zhang";
		System.out.println(firstName.concat(lastName));
		
		/* Special Characters 
		 * Escape character	Result	Description
			\'			'			Single quote
			\"			"			Double quote
			\\			\			 Backslash
		 */
		txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		txt = "It\'s alright.";
		System.out.println(txt);
		txt = "The character \\ is called backslash.";
		System.out.println(txt);
		
		/* Six other escape sequences
		 * Code		 	Result	
			\n			New Line	
			\r		Carriage Return
			\t		   	  Tab	
			\b			Backspace	
			\f			Form Feed
		 */
		txt = "Hello\rWorld!";
	    System.out.println(txt);
	    txt = "Hello\fWorld!";
	    System.out.println(txt);
	    
	    int x = 10;
	    int y = 20;
	    int z = x + y;      // z will be 30 (an integer/number)
	    System.out.println(z);
	    
	    String X = "10";
	    String Y = "20";
	    String Z = X + Y;   // Z will be 1020 (a String)
	    System.out.println(Z);
	    
	    String a = "10";
	    int b = 20;
	    String c = a + b;   // c will be 1020 (a String)
	    System.out.println(c);
	    
	    int A = 10;
	    String B = "20";
	    String C = A + B;   // C will be 1020 (a String)
	    System.out.println(C);
	}

}
