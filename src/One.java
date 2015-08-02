import java.util.HashMap;
import java.util.HashSet;
public class One {
	public static void main(String[] args) {
		int[] a = {0, 4, 5, 7, 10};
		//return {2, 5}
		System.out.println("{"+twoSum(a, 14)[0] + ", " + twoSum(a, 14)[1]+"}");
	}
	
	//Given an array of integers, find two numbers such that they add up to a specific target number.
	//The function twoSum should return indices of the two numbers such that they add up to the target, 
	//where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
	//You may assume that each input would have exactly one solution.
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
        int[] finalArray = new int[2];
        for (int i = 0; i<nums.length; i++){
        	if(!store.containsKey(target - nums[i]))
        		store.put(nums[i], i+1);
        	else{
        		finalArray[0] = store.get(target - nums[i]);
        		finalArray[1] = i+1;
        	}		
        }
        return finalArray;
    }
}
