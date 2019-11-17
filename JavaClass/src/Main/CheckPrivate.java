//Qinyao Zhang 11.17.19
package Main;

public class CheckPrivate {

	public static void main(String[] args) {

		Encapsulation myObj = new Encapsulation();
	    //myObj.name = "John";  // error
	    //System.out.println(myObj.name); // error 

		myObj.setName("John"); // Set the value of the name variable to "John"
		System.out.println(myObj.getName());
		
	}

}
