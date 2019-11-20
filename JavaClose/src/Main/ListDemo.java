//Qinyao Zhang 11.19.19
package Main;
import java.util.*;


public class ListDemo {

	public static void main(String[] args) {
		
		//Positional Access
		//Creating a List
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0, 1);// add 1 at index 0
		l1.add(1, 2);// add 2 at index 1
		System.out.println(l1); //[1, 2]

		//Create another list
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		System.out.println(l2); //[1, 2, 3]
		
		//add list l2 form index 1
		l1.addAll(1, l2); // add l2 at index 1 then link original data at index 1 + l2.lengh
		System.out.println(l1); //[1, 1, 2, 3, 2]
		
		// Removes 
        l1.remove(1); 
        System.out.println(l1); // [1, 2, 3, 2] 
		
		// Get
        System.out.println(l1.get(3)); //2
        
        // Set
        l1.set(0, 5); 
        System.out.println(l1); //[5, 2, 3, 2]
        
        //Search
        //Create String list
        List<String> l = new ArrayList<String>(5);
        l.add("lalala");
        l.add("for");
        l.add("lalala");
        
        //Using indexOf() and lastIndexOf to search inside value
        System.out.println("first index of lalala:"
                + l.indexOf("lalala")); 
        System.out.println("last index of lalala:"
                + l.lastIndexOf("lalala")); 
        System.out.println("Index of element"
                + " not present : "
                + l.indexOf("Hello"));
        
        //Range View
        l = new ArrayList<String>(5);
        l.add("GeeksforGeeks"); 
        l.add("Practice"); 
        l.add("GeeksQuiz"); 
        l.add("IDE"); 
        l.add("Courses"); 
  
        List<String> range = new ArrayList<String>(); 
        // Return List between 2nd(including) 
        // and 4th element(excluding) 
        range = l.subList(2, 4); 
  
        System.out.println(l); 
        System.out.println(range); 
        
	}

}
