//Qinyao Zhang 11.20.19
package Main;

//Trees: Unlike Arrays, Linked Lists, Stack and queues,
//which are linear data structures, 
//trees are hierarchical data structures.

//Binary Tree: A tree whose elements have at most 
//2 childrenis called a binary tree. 
//Since each element in a binary tree can have only 2 children,
//we typically name them the left and right child.


//here we will create a Class containing left
//and right chile of current node and key value
class Node{
	int key;
	Node left,right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
}

//here we want to program a simple binary tree
public class JavaTree1 {

	//Root of Binary Tree
	Node root;
	
	//Constrctors
	JavaTree1(int key){
		root = new Node(key);
	}
	
	JavaTree1(){
		root = null;
	}
	
	public static void main(String[] args) {

		JavaTree1 tree = new JavaTree1();
		
		//create root
		tree.root = new Node(1);
		
		 /* following is the tree after above statement 
		  
        1 
      /   \ 
    null  null     */
		
		//add left and right child
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		 /* 2 and 3 become left and right children of 1 
        1 
      /   \ 
     2      3 
   /    \    /  \ 
 null null null null  */
		
		//add another left child for 2
		tree.root.left.left = new Node(4); 
        /* 4 becomes left child of 2 
                    1 
                /       \ 
               2          3 
             /   \       /  \ 
            4    null  null  null 
           /   \ 
          null null 
         */
	}
}
