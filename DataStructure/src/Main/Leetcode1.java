//Qinyao Zhang 11.20.19
package Main;

//remove duplicates from sorted array

public class Leetcode1 {

	public static int removeDuplicates(int[] nums) {
		
		int n = nums.length;
		
		if (n==0|n==1) {
			return n;
		}
		
		int j = 0;
		
		for (int i = 1; i<n; i++) {
			if(nums[i]!=nums[j]) {
				j++;
                nums[j] = nums[i];
			}
		}
		return j+1;	
		
	}

	public static void main(String[] args) {

		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = arr.length;  
		
        n = removeDuplicates(arr); 
   
        // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 

	}

}
