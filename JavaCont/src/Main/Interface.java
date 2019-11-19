//Qinyao Zhang 11.18.19
package Main;

//interfaces cannot be used to create objects
//Interface methods do not have a body 
//the body is provided by the "implement" class

//Interface methods are by default abstract and public
//Interface attributes are by default public, static and final

//Java does not support "multiple inheritance" 
//(a class can only inherit from one superclass). 
//However, it can be achieved with interfaces, 
//because the class can implement multiple interfaces.

//Interface
interface Animal1 {
	
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pig1 implements Animal1 {
	
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

interface FirstInterface {
	
	  public void myMethod(); // interface method
	  
}

interface SecondInterface {
	
	  public void myOtherMethod(); // interface method
	  
}

class DemoClass implements FirstInterface, SecondInterface {
	
	 public void myMethod() {
	    System.out.println("Some text..");
	 }
	 
	 public void myOtherMethod() {
	    System.out.println("Some other text...");
	 }
	 
}

public class Interface {

	public static void main(String[] args) {
		
		Pig1 myPig = new Pig1(); 
	    myPig.animalSound();
	    myPig.sleep();
		
	    DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	}

}
