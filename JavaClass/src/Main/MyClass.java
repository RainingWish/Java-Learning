//Qinyao Zhang 11.17.19
package Main;

public class MyClass {
	
	//To create a class, use the keyword class
	//In Java, an object is created from a class.
	
	 int x = 5; //if we use final int x = 5, main class cannot change x value
	 int y = 3;
	  
	 public static void main(String[] args) {
		 
	    MyClass myObj = new MyClass();
	    System.out.println(myObj.x);
	    
	    
	    MyClass myObj1 = new MyClass();  // Object 1
	    MyClass myObj2 = new MyClass();  // Object 2
	    System.out.println(myObj1.x);
	    System.out.println(myObj2.x);
	    
	    //set value of x to 40
	    MyClass myObj3 = new MyClass();
	    myObj3.x = 40;
	    System.out.println(myObj3.x);
	    
	    //change to 25
	    myObj3.x = 25;
	    System.out.println(myObj3.x);
	    
	    //Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged
	    myObj2.x = 25;
	    System.out.println(myObj1.x);  // Outputs 5
	    System.out.println(myObj2.x);  // Outputs 25
	    
	    Student myObj4 = new Student();

	    System.out.println("Name: " + myObj4.fname);
	    System.out.println("Age: " + myObj4.age);
	    System.out.println("Graduation Year: " + myObj4.graduationYear);
	    myObj4.study(); // call abstract method
	  }
	}


