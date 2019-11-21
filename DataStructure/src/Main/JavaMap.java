//Qinyao Zhang 11.20.19
package Main;
import java.util.*;

//The java.util.Map interface represents a mapping between a key and a value.

//Map is a interface
//HashMap is a class implements Map
//LinkedHashMap is a class extends HashMap
//SortedMap is a interface extends Map
//TreeMap is a class implements StortedMap

public class JavaMap {

	public static void main(String[] args) {


		//HashMap
		Map< String,Integer> hm =  
                new HashMap< String,Integer>(); 
				hm.put("a", new Integer(100)); 
				hm.put("b", new Integer(200)); 
				hm.put("c", new Integer(300)); 
				hm.put("d", new Integer(400)); 

		// Returns Set view      
		Set< Map.Entry< String,Integer> > st = hm.entrySet();    

		for (Map.Entry< String,Integer> me:st) 
		{	 
			System.out.print(me.getKey()+":"); 
			System.out.println(me.getValue()); 
		} 
	}

}
