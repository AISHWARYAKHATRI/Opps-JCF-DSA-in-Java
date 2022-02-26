import java.util.Arrays;

class Solution{
	
	//TC: O(nlogn) SC: O(1)
	
//	public void sol(int[] arr) {
//		if(arr.length == 0 || arr.length == 1) {
//			System.out.println("-1");
//		}
//		Arrays.sort(arr);
//		System.out.println("Second largest Element: " + arr[arr.length - 2]);
//		System.out.println("Second smallest ELement: " + arr[1]);
//	}
	
	//TC: O(n) SC: O(1) We do two traversals in out array
	
//	public void sol(int[] arr) {
//		if(arr.length == 0 || arr.length == 1) {
//			System.out.println("-1");
//		}
//		int small=Integer.MAX_VALUE, large=Integer.MIN_VALUE;
//		int second_small=Integer.MAX_VALUE, second_large=Integer.MIN_VALUE;
//		
//		for(int i=0; i<arr.length; i++) {
//			small = Math.min(small, arr[i]);
//			large = Math.max(large, arr[i]);
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] != small && arr[i] < second_small) second_small = arr[i];
//			if(arr[i] != large && arr[i] > second_large) second_large = arr[i]; 
//		}
//	
//	System.out.println("Second largest Element: " + second_large);
//	System.out.println("Second smallest ELement: " + second_small);
// }
	
	//TC: O(n) SC: O(1) Single pass solution 
		
    public int secondSmallest(int[] arr) {
    	if(arr.length == 0 || arr.length == 1) return -1;
			
    	int small = Integer.MAX_VALUE;
    	int second_small = Integer.MAX_VALUE;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] < small) {
    			second_small = small;
    			small = arr[i];
    		}
    		else if(arr[i] < second_small && arr[i] != small) {
    			second_small = arr[i];
    		}
    	}
    	return second_small;
    }
    
    public int secondLargest(int[] arr)
    {
    	if(arr.length<2) return -1;
    	
    	int large = Integer.MIN_VALUE;
    	int second_large = Integer.MIN_VALUE;
    	for (int i = 0; i < arr.length; i++)
    	{
    		if (arr[i] > large)
    		{
    			second_large = large;
    			large = arr[i];
    		}

    		else if (arr[i] > second_large && arr[i] != large)
    		{
    			second_large = arr[i];
    		}
    	}
    	return second_large;
    }
}

public class java03_2ndSmallestandLargest {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,7,5};
	    Solution res = new Solution();
//	    res.sol(arr);
		int second_small = res.secondSmallest(arr);
		System.out.println("Second smallest ELement: " + second_small);
		int second_large = res.secondLargest(arr);
		System.out.println("Second largest ELement: " + second_large);
	}
}
