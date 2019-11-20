//Qinyao Zhang 11.19.19
package Main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;//import scanner class to read the files


public class ReadFile {

	public static void main(String[] args) {

		try {
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		
		//get file information
		File myObj = new File("filename.txt");
		if (myObj.exists()) {
			System.out.println("File name: " + myObj.getName());
		    System.out.println("Absolute path: " + myObj.getAbsolutePath()); //print path
		    System.out.println("Writeable: " + myObj.canWrite());
		    System.out.println("Readable " + myObj.canRead());
		    System.out.println("File size in bytes " + myObj.length());
		}else {
			System.out.println("File does not exist");
		}
	}

}
