//Qinyao Zhang 11.16.19
package Main;


public class JavaVaribles {
//here we will review variable type
	/*String - stores test
	 * int - stores integers
	 * float - stores floating point number ie: 1.99
	 * char - store single characters
	 * boolean  - store ture or flse
	 */
	
	public static void main(String[] args) {
		String name = "John";
		System.out.println(name);
		System.out.println("Hello" + name);
	
		int myNum = 19;
		System.out.println(myNum);
		myNum = 15;
		System.out.println(myNum);
		final int FinalNum = 20;
		//FinalNum = 15;
		System.out.println(FinalNum);
		//here will generate an error
		
		
		float FNum = 5.99f;
		System.out.println(FNum);
		
		char myLetter = 'D';
		System.out.println(myLetter);
		
		boolean myBool = true;;
		System.out.println(myBool);
		
		String firstN = "Qinyao";
		String lastN = "Zhang";
		String fullN = firstN +" "+ lastN;
		System.out.println(fullN);
		
		int x = 5, y = 6, z = 50;
		System.out.println(x + y + z);
		
		
	}
	
}
