//Qinyao Zhang 11.17.19
package Main;

public class Person {

	String fname = "Qinyao";
	String lname = "Zhang";
	int age = 24;
	
	public static void main(String[] args) {

		Person myObj = new Person();
		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Age: " + myObj.age);

	}

}
