//Qinyao Zhang 11.16.19
package Main;

public class JavaDataType {

	/* byte - 1 byte - Stores whole numbers from -128 to 127
	 * short - 2 bytes - Stores whole numbers from -32,768 to 32,767
	 * int - 4 bytes - Stores whole numbers from -2,147,483,648 to 2,147,483,647
	 * long - 8 bytes
	 * float- 4 bytes - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	 * double - 8 bytes - Stores fractional numbers. Sufficient for storing 15 decimal digits
	 * boolean - 1 bit - Stores true or false values
	 * char - 2 bytes - Stores a single character/letter or ASCII values
	 */
	
	public static void main(String[] args) {
		// test space
		byte Num1 = 100;
		System.out.println(Num1);
		
		short Num2 = 5000;
		System.out.println(Num2);
		
		int Num3 = 100000;
		System.out.println(Num3);
		
		long Num4 = 15000000000L; // long number need to add L in the end
		System.out.println(Num4);
		
		float Num5 = 5.75f; //float number need add f in the end
		System.out.println(Num5);
		
		double Num6 = 19.99d; //double number need add d in the end
		System.out.println(Num6);
		
		float f1 = 35e3f; //e or E mean the power of 10
		double d1 = 12e4d;
		System.out.println(f1);
		System.out.println(d1);
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false
		
		char myGrade = 'A'; //char only can store one character 
		System.out.println(myGrade);
		
		char a = 65, b = 66, c = 67; //number also have ASCII reference, here store ASCII number not int
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		String greeting = "Hello World";
		System.out.println(greeting);
	}

}
