//Qinyao Zhang 11.20.19
package Main;
import java.io.*;

//cannot really understand

public class JavaBuffered {

	public static void main(String[] args) {

		//Buffered input Stream demo;
	
			try {
				//attach the file to FileInputStream
				FileInputStream file = new FileInputStream("file1.txt");
				
				BufferedInputStream bin = new BufferedInputStream(file);
				
				// illustrating available method 
		        System.out.println("Number of remaining bytes:" + bin.available()); 
				
		        //illustrating markSupported() and mark () methis
		        
		       boolean b=bin.markSupported();
		       if(b) {
		    	   bin.mark(bin.available());
		       }
		       
		       // illustrating skip method 
		       /*Original File content: 
		        * lalala 
		       */
		        bin.skip(4); 
		        System.out.println("FileContents :"); 
		  
		        //read characters from FileInputStream and write them
		        int ch;
		        while((ch=bin.read())!= -1) {
		        	System.out.println((char)ch);
		        }
		        
		        // illustrating reset() method 
		        bin.reset(); 
		        while ((ch=bin.read()) != -1) 
		            System.out.print((char)ch);
		        
		        //close file
		        file.close();
		        
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			//Buffered output Stream demo;
			FileOutputStream fout;
			try {
				fout = new FileOutputStream("file1.txt");
				
				//creating bufferdOutputStream obj 
		        BufferedOutputStream bout = new BufferedOutputStream(fout); 
		  
		        //illustrating write() method 
		        for(int i = 65; i < 75; i++) 
		        { 
		            bout.write(i); 
		        } 
		          
		        byte b[] = { 75, 76, 77, 78, 79, 80 }; 
		        bout.write(b); 
		  
		        //illustrating flush() method 
		        bout.flush(); 
		          
		        //illustrating close() method 
		        bout.close(); 
		        fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	          
	         
	    } 
}


