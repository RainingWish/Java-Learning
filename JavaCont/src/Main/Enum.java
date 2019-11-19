//Qinyao Zhang 11.18.19
package Main;

//Use enums when you have values that you know aren't going to change, 
//like month days, days, colors, deck of cards, etc.

enum Level{
	LOW,
	MEDIUM,
	HIGH
}

public class Enum {

	enum Level{ //cna be coth inside and ourside class
		LOW,
		MEDIUM,
		HIGH
	}
	
	public static void main(String[] args) {

		Level Var = Level.MEDIUM;
		System.out.println(Var);
		
		switch(Var) {
		
		case LOW:
			System.out.println("Low level");
			break;
		
		case MEDIUM:
			System.out.println("Medium level");
			break;
			
		case HIGH:
			System.out.println("High level");
			break;
		}
		
	}

}
