//Qinyao Zhang 11.18.19
package Main;
import java.util.HashMap; //import hashmap class


public class Hashmap {

	public static void main(String[] args) {

		//create a hashmap store String key and String values
		HashMap<String,String> capital = new HashMap<String,String>();
		
		//use put function add key and value
		capital.put("England", "London");
		capital.put("Germany", "Berlin");
		capital.put("Canada", "Ottawa");
		capital.put("China", "Beijin");
		System.out.println(capital);
		
		//get function
		System.out.println(capital.get("England"));
		
		//remove function
		capital.remove("England");
		System.out.println(capital.get("England")); //output null
		
		//size function
		System.out.println(capital.size());
		
		//clear function
		capital.clear();
		System.out.println(capital);
		
		capital.put("England", "London");
		capital.put("Germany", "Berlin");
		capital.put("Canada", "Ottawa");
		capital.put("China", "Beijin");
		
		//loop and only get key/value
		
		//Print keys (keyset())
		System.out.println(capital.keySet());//auto sort
		for(String i : capital.keySet()) {
			System.out.println(i);
		}
		
		//Print values (values())
		System.out.println(capital.values());//sort base on keys order
		for(String i : capital.values()) {
			System.out.println(i);
		}
		
		//Print keys and values
		for (String i : capital.keySet()) {
			System.out.println("Key: "+i+" Values: "+capital.get(i));
		}
		
		//Other type working as same as arraylist
		//Create a HashMap object called people
	    HashMap<String, Integer> people = new HashMap<String, Integer>();


	    // Add keys and values (Name, Age)
	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);

	    for (String i : people.keySet()) {
	      System.out.println("key: " + i + " value: " + people.get(i));
	    }
		
	}

}
