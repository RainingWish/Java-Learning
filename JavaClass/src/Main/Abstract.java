//Qinyao Zhang 11.17.19
package Main;

//abstract class
//abstract class have nothing in main
//abstract class must defined in subclass?
public abstract class Abstract {
	
	public String fname = "John";
	public int age = 24;
	public abstract void study(); //abstract method
	
}

//Subclass(inherit from Person)
class Student extends Abstract {
	public int graduationYear = 2018;
	public void study() {	// the body of the abstract method is provided here
	   
		System.out.println("Studying all day long");
		
	}
}
