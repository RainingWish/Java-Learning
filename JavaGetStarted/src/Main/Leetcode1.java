//Qinyao Zhang 11.16.19
package Main;

//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].


public class Leetcode1 {

	public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++) {
        	for(int j=i+1; j< nums.length; j++) {
        		if(target == nums[i] + nums[j]) {
        			return new int[] {i,j};
        		}
        		
        	}
        }
        return null;
    }
	
	public static void main(String[] args) {
	
		int[] nums = {2,7,11,15};
		int target = 1;
		int[] ans = twoSum(nums,target);
		if (ans == null) {
			System.out.println("cannot find sum");
		}else {
			System.out.println(ans[0]+" "+ans[1]);
		}
		
	}
}
