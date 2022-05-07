import java.util.Arrays;

public class java10_median {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 1, 2, 5, 6 };
		median(arr, arr.length);
	}
	
	static void median(int[] arr, int n) {
		Arrays.sort(arr);
		int ind1, ind2;
		if(n%2 == 0) {
			ind1 = (n/2)-1;
			ind2 = (n/2);
			System.out.println((double)(arr[ind1] + arr[ind2])/2);
		}
		else {
			System.out.println(arr[(n/2)]);
		}
	}
}

// Time-complexity: O(N*Log N), sorting of array
// Space-complexity: O(1);
