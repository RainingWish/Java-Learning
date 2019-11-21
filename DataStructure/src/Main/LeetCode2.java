//Qinyao Zhang 11.20.19
package Main;

//remove element



public class LeetCode2 {

	public static int removeElement(int[] nums, int val) {
        
        int j = 0;
		
		for (int i = 0; i<nums.length; i++) {
			if(nums[i]!=val) {
                nums[j] = nums[i];
                j++;
			}
		}
		return j;	
    }
	
	public static void main(String[] args) {

		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = arr.length;  
		
        n = removeElement(arr,2); 
   
        // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 

	}

}
