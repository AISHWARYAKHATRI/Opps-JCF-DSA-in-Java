
public class java01_smallestElement {

	public static void main(String[] args) {
		int[] arr = { 2,5,1,3,0 };
		System.out.println("The smallest element in the array is: " + smallestEle(arr));
	}
	
	static int smallestEle(int[] arr) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) min = arr[i];
		}
		return min;
	}
}

// TC: O(N)
// SC: O(1)

// While doing it with sorting the first element can be printed directly.
// TC: O(N*log(N))
// SC: O(1)