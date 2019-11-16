//Qinyao Zhang 11.16.19
package Main;

//A method is a block of code which only runs when it is called.


public class JavaMethods {

	static void myMethod() {
	    System.out.println("I just got executed!");
	  }
	
	static void myMethod2(String fname) {
	    System.out.println(fname.concat(" Unknown"));
	  }
	
	static void myMethod3(String fname, int age) {
	    System.out.println(fname + " is " + age);
	  }
	
	static int myMethod(int x) {
	    return 5 + x;
	  }
	
	static int myMethod1(int x, int y) {
	    return x + y;
	  }

	static void checkAge(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!");

	    // If age is greater than 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!");
	    }

	  }
	
	
	public static void main(String[] args) {
		myMethod();
		myMethod();
		myMethod();//can call myltiple times
		
		myMethod2("Ado");

		myMethod3("Liam", 5);
	    myMethod3("Jenny", 8);
	    myMethod3("Anja", 31);
		
	    System.out.println(myMethod(3));
	    
	    System.out.println(myMethod1(5, 3));
	    
	    int z = myMethod1(5, 3);
	    System.out.println(z);
	    
	    checkAge(20);
	}

}
