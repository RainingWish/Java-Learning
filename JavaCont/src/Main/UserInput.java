//Qinyao Zhang 11.18.19
package Main;
import java.util.Scanner;

/*
   Method				Description
nextBoolean()	Reads a boolean value from the user
nextByte()		Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()		Reads a float value from the user
nextInt()		Reads a int value from the user
nextLine()		Reads a String value from the user
nextLong()		Reads a long value from the user
nextShort()		Reads a short value from the user
 */

public class UserInput {

	public static void main(String[] args) {

		Scanner myObj  = new Scanner(System.in); //create a scanner obj
		System.out.println("Enter username");
		
		String username = myObj.nextLine(); //read user input
		System.out.println("Username is:" + username); 
		
		System.out.println("Enter name, age and salary:");
		String name = myObj.nextLine();
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		System.out.println("Name is:" + name); 
		System.out.println("Agr is:" + age); 
		System.out.println("Salary is:" + salary); 

		myObj.close();
	}

}
