//Qinyao Zhang 11.18.19
package Main;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> car = new ArrayList<String>();
		
		//add function
		car.add("Volvo");
		car.add("BMW");
		car.add("Ford");
		car.add("Benz");
		System.out.println(car);
		
		//get function
		System.out.println(car.get(0));
		
		//set function
		car.set(1, "Honda");
		System.out.println(car);
		
		//remove function
		car.remove(0);
		System.out.println(car);
		
		//clear function
		car.clear();
		System.out.println(car);
		
		//size function
		car.add("Volvo");
		car.add("BMW");
		car.add("Ford");
		car.add("Benz");
		System.out.println(car.size());

		//Loop
		for(int i = 0;i<car.size();i++) {
			
			System.out.println(car.get(i));
			
		}
		
		//for each loop
		for (String i : car) {
		      System.out.println(i);
		}
		
		//Sort (need to import collections)
		System.out.println(car);
		Collections.sort(car);
		System.out.println(car);
		
		//ArrayList can store Integer, Boolean, Character, Double and String
		 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		 myNumbers.add(33);
		 myNumbers.add(15);
		 myNumbers.add(20);
		 myNumbers.add(34);
		 myNumbers.add(8);
		 myNumbers.add(12);
		 System.out.println(myNumbers);
		 Collections.sort(myNumbers);
		 System.out.println(myNumbers);
		
		
	}

}
