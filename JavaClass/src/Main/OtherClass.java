//Qinyao Zhang 11.17.19
package Main;

//Using Multiple Classes

public class OtherClass {

	public static void main(String[] args) {

		MyClass myObj = new MyClass();
		System.out.println(myObj.x);

		Car myCar = new Car();     // Create a myCar object
	    myCar.fullThrottle();      // Call the fullThrottle() method
	    myCar.speed(200);          // Call the speed() method
	}

}
