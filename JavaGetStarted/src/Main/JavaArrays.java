//Qinyao Zhang 11.16.19
package Main;

public class JavaArrays {

	public static void main(String[] args) {
		// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

		//To declare an array, define the variable type with square brackets

		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		cars[0] = "Opel";
		System.out.println(cars[0]);
		System.out.println(cars.length);
		
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);
			}
		//for each loop for array
		for (String i : cars) {
			  System.out.println(i);
			}
		
		int[] myNum = {10, 20, 30, 40};
		System.out.println(myNum[3]);
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2]; //the counter of array start with 0 instead 1
		System.out.println(x); // Outputs 7
		
		//print all number in two-dimensionl array
		for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		        System.out.println(myNumbers[i][j]);
		      }
		}
		
	}

}
