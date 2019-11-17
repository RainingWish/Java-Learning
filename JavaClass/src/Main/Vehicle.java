//Qinyao Zhang 11.17.19
package Main;

class Inheritance {
	  protected String brand = "Ford";        // Vehicle attribute
	  public void honk() {                    // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
	}

public class Vehicle extends Inheritance{
	 
	private String modelName = "Mustang";    // Car attribute
	
	public static void main(String[] args) {

	    // Create a myCar object
		Vehicle myCar = new Vehicle();

	    // Call the honk() method (from the Vehicle class) on the myCar object
	    myCar.honk();

	    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
	    System.out.println(myCar.brand + " " + myCar.modelName);
	  }

}
