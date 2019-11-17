//Qinyao Zhang 11.17.19
package Main;

//Access Methods With an Object

public class Car {

	// Create a fullThrottle() method
	public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	}
	
	// Create a speed() method and add a parameter
	public void speed(int maxSpeed) {
	    System.out.println("Max speed is: " + maxSpeed);
	}
	
	int modelyear;
	String modelname;
	
	public Car() {
		modelyear = 0;
		modelname = "unknown";
	}
	
	public Car(int year, String name) {
		modelyear = year;
		modelname = name;
	}
	
	
	// Inside main, call the methods on the myCar object
	public static void main(String[] args) {

		Car myCar = new Car();     // Create a myCar object
	    myCar.fullThrottle();      // Call the fullThrottle() method
	    myCar.speed(200);          // Call the speed() method	
	    System.out.println(myCar.modelyear + " " + myCar.modelname);
	    
	    Car myCar1 = new Car(1969, "Mustang");
	    System.out.println(myCar1.modelyear + " " + myCar1.modelname);
	}

}
