//Qinyao Zhang 11.19.19
package Main;

import Main.LeetCode2.ListNode;

//Merge Two Sorted Lists

public class LeetCode2ans2 {
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x;  next = null; }
		
		public String toString() {
		    String result = val + " ";
		    if (next != null) {
		        result += next.toString();
		    }
		    return result;
		}
		
	}
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
	        if(l1 == null) return l2;
			if(l2 == null) return l1;
			
			if(l1.val < l2.val)  
	        { 
	            l1.next = mergeTwoLists(l1.next, l2); 
	            return l1; 
	        } 
	        else 
	        { 
	           l2.next = mergeTwoLists(l1, l2.next); 
	            return l2; 
	        } 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
