//Qinyao Zhang 11.19.19
package Main;

//Merge Two Sorted Lists

public class LeetCode2 {

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
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode l3;
		if(l1.val < l2.val) {
			l3 = l1;
			l1 = l1.next;
		}else {
			l3 = l2;
			l2 = l2.next;
		}
		
		ListNode fakehead = new ListNode(-1);
		fakehead.next = l3;
		 while(l1!=null&&l2!=null){
			 if(l1.val<l2.val){
				 l3.next = l1;
				 l3 = l3.next;
				 l1 = l1.next;
			 }else {
				 l3.next = l2;
				 l3 = l3.next;
				 l2 = l2.next;
			 }
		 }
		
		 if(l1!=null) {
			 l3.next = l1;
		 }
		 if(l2!=null) {
			 l3.next = l2;
		 }
		return fakehead.next;
    }
	
	
	public static void main(String[] args) {

		ListNode A = new ListNode(6);
		ListNode p = A;
		p.next = new ListNode(4);
		p=p.next;
		p.next = new ListNode(2);
		p=p.next;
		p.next = new ListNode(1);
		System.out.println(A.toString());
		
		ListNode B = new ListNode(3);
		p = B;
		p.next = new ListNode(2);
		p=p.next;
		p.next = new ListNode(1);
		System.out.println(B.toString());
		
		ListNode C = mergeTwoLists(A,B);
		
		System.out.println(C.toString());
		
		
	}

}
