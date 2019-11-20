//Qinyao Zhang 11.19.19
package Main;
import java.io.File;

//File handling is an important part of any application.

//Java has several methods for creating, reading, updating, and deleting files.


/*
 * Method			Type						Description
canRead()			Boolean			Tests whether the file is readable or not
canWrite()			Boolean			Tests whether the file is writable or not
createNewFile()		Boolean			Creates an empty file
delete()			Boolean			Deletes a file
exists()			Boolean			Tests whether the file exists
getName()			String			Returns the name of the file
getAbsolutePath()	String			Returns the absolute pathname of the file
length()			Long			Returns the size of the file in bytes
list()				String[]		Returns an array of the files in the directory
mkdir()				Boolean			Creates a directory
 */
public class Files {

	public static void main(String[] args) {

		File myObj = new File("filename.txt");//Specify the filename

	}

}
