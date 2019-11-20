//Qinyao Zhang 11.19.19
package Main;
import java.io.File;

public class Delete {

	public static void main(String[] args) {

		//delete a file
		File myObj = new File("filename.txt");
		if(myObj.delete()) {
			System.out.println("Deleted the file: "+ myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}

		//delete a folder
		//File myObj = new File("C:\\Users\\MyName\\Test");
		//myObj.delete();
	}

}
