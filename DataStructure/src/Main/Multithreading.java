//Qinyao Zhang 11.20.19
package Main;

//Multithreading is a Java feature that allows concurrent
//execution of two or more parts of a program 
//for maximum utilization of CPU.



//the Thread class
class MultiDemo extends Thread{
	
	public void run() {
		
		try {
			//Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + "is running");
		}catch(Exception e) {
			//Throwing an exception
			System.out.println("Error");
		}
	}
	
}


public class Multithreading {

	public static void main(String[] args) {
		int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
        	MultiDemo object = new MultiDemo(); 
            object.start(); 
        } 

	}

}
