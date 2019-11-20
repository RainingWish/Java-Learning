//Qinyao Zhang 11.19.19
package Main;
import java.io.File;
import java.io.IOException;//Import the IOException class to handle errors
import java.io.FileWriter;

public class CreateWrite {

	public static void main(String[] args) {
		
		try {
			File myObj = new File("filename.txt"); //file created in project browser
			//create a file in the place you want
			//File myObj = new File("C:\\Users\\MyName\\filename.txt");
			
			if(myObj.createNewFile()) {
				System.out.println("File created " + myObj.getName());
			}else {
				System.out.println("File already exists.");
			}
		} catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		
		//Write a file
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
	}

}
