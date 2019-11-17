//Qinyao Zhang 11.17.19
package Main;

//Static vs. Non-Static
//we created a static method, which means that it can be accessed
//without creating an object of the class,
//unlike public, which can only be accessed by objects

public class JavaClassMethods {

	static void myMethod() {
		System.out.println("Hello World!");
	}
	
	 // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }
	  
	public static void main(String[] args) {
	    myMethod();
	    
	    myStaticMethod(); // Call the static method
	    //myPublicMethod(); //This would compile an error

	    JavaClassMethods myObj = new JavaClassMethods(); // Create an object of MyClass
	    myObj.myPublicMethod(); // Call the public method on the object
	    
	  }
}
