//Qinyao Zhang 11.20.19
package Main;
import java.util.*;

//Set is an interface which extends Collection. 
//It is an unordered collection of objects in which 
//duplicate values cannot be stored.
//same as dictionare in Python
//No repeat Variable


public class JavaSet {

	public static void main(String[] args) {

		//hashSet
		Set<String> hashS = new HashSet<String>();
		hashS.add("lalala");
		hashS.add("for");
		hashS.add("lalala");
		hashS.add("Example");
		hashS.add("Set");
		System.out.print("Set output without the duplicates");  
        System.out.println(hashS);

        //TreeSet
        System.out.print("Sorted Set after passing into TreeSet"); 
        Set<String> treeS = new TreeSet<String>(hashS);
        System.out.println(treeS); 
        
        //Two Set combination
        //Create two integer set
        Set<Integer> a = new HashSet<Integer>(); 
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
        Set<Integer> b = new HashSet<Integer>(); 
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
        
        // To find union 
        // find all number in two set without repeate vlue
        Set<Integer> union = new HashSet<Integer>(a); // union == a
        union.addAll(b); //add b value into union
        System.out.print("Union of the two Set"); //set will auto remove repeat value
        System.out.println(union);
        
        // To find intersection
        //find all number both in a and b
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
        
        //To find different
        //find the number that only in a or b
        Set<Integer> diff = new HashSet<Integer>(a);
        diff.removeAll(b);
        System.out.print("Different of the two Set"); 
        System.out.println(diff);
        
        
        
	}

}
