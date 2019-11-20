//Qinyao Zhang 11.19.19
package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Valid Parentheses

public class Leetcode1 {

	static Map <Character,Character> mappings = new HashMap<>();
    static{
        mappings.put('(', ')');
        mappings.put('{', '}');
        mappings.put('[', ']');
    }
    
	//create a stack, puch the char in first,
    //if the char same as mapping char on the top
    //pop the top of the char
    //otherwise add in top of the stack
    //final check the stack is empty or not
    
    public static boolean isValid(String s) {
        
    	Stack<Character> p = new Stack<>();
    	for (int i = 0; i<s.length(); i++) {
    		char c = s.charAt(i);
    		if (mappings.containsKey(c)) {
    			p.push(mappings.get(c));
    			System.out.println("Step: " + i + "Stack:" + p);
    			System.out.println(mappings.get(c));
    		}else if (mappings.containsValue(c)) {
    			System.out.println("Step: " + i + "Stack:" + p);
    			System.out.println(mappings.containsValue(c));
    			if(p.isEmpty()||p.pop()!=c) {
    				return false;
    			}
    		}
    	}
    	return p.isEmpty();
    }
    
	public static void main(String[] args) {
		
		String s = "{[]()}";
		boolean check = isValid(s);
		System.out.println(check);
		

	}

}
