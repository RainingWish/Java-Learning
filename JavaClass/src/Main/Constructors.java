//Qinyao Zhang 11.17.19
package Main;

//A constructor in Java is a special method that is used to initialize objects. 
//The constructor is called when an object of a class is created
//It can be used to set initial values for object attributes

public class Constructors {
	
	int x; // Create a class attribute
	
	public Constructors() {
		x = 11; // Set the initial value for the class attribute x
	}

	//constructors parameters
	public Constructors(int y) {
		x = y; // Set the initial value for the class attribute x
	}
	
	public static void main(String[] args) {
		
		Constructors myObj = new Constructors(); // Create an object of class MyClass (This will call the constructor)
	    System.out.println(myObj.x); // Print the value of x
	    
	    Constructors myObj1 = new Constructors(5);
	    System.out.println(myObj1.x);
	    
	    
	}

}
