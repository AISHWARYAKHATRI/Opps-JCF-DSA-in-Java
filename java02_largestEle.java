
public class java02_largestEle {

	public static void main(String[] args) {
		int[] arr = { 2,5,1,3,0 };
		System.out.println("The largest element in the array is: " + largestEle(arr));
	}
	
	static int largestEle(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}

}

// TC: O(N)
// SC: O(1)

// While doing it with sorting the last element can be printed directly.
// TC: O(N*log(N))
// SC: O(1)