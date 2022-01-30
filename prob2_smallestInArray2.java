//Problem Statement: Given an array, we have to find the smallest element in the array.

public class prob2_smallestInArray2 {

	public static void main(String[] args) {
		int[] arr = {15, 78, 5, 2, 9};
		System.out.println("The smallest number in array is: " + min(arr));
	}
	
	static int min(int[] arr) {
		
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) min = arr[i];
		}
		return min;
	}
}

//Time complexity: O(N)
//Space Complexity: 0(1)
