
public class java17_maximumProduct {

	public static void main(String[] args) {
		int nums[] = { 1,2,-3,0,-4,-5 };
		// Kadane's algorithm
		int curr_max = nums[0]*nums[1];
		int max = nums[0]*nums[1];
		for(int i=2; i<nums.length; i++) {
			curr_max *= nums[i];
			
			if(curr_max > max) {
				max = curr_max;
			}
			
			else if(curr_max < max) {
				curr_max = nums[i];
			}
		}
		System.out.println("Maximum product: " + max);
	}
}

// TC: O(N)
// SC: O(1)
