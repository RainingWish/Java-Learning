//Qinyao Zhang 11.18.19
package Main;

//Abstract class: is a restricted class that cannot be used to create objects 
//(to access it, it must be inherited from another class).

//Abstract method: can only be used in an abstract class,
//and it does not have a body. 
//The body is provided by the subclass (inherited from).


//Why And When To Use Abstract Classes and Methods?
//To achieve security - hide certain details and 
//only show the important details of an object.



//abstract class
abstract class Animal{
	
	//abstract method(cant have body)
	public abstract void animalSound();
	
	//regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

//Subclass of Animal
class Pig extends Animal{
	public void animalSound() {
		System.out.println("Wee Wee");
	}
}

class Dog extends Animal{
	public void animalSound() {
		System.out.println("WONG WONG");
	}
}

public class Abstraction {

	public static void main(String[] args) {

		Pig myPig  =  new Pig();
		myPig.animalSound();
		myPig.sleep();

		Dog myDog  =  new Dog();
		myDog.animalSound();
		myDog.sleep();
	}

}
