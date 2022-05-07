import java.util.HashSet;

public class java11_removeDuplis {
	public static  void main(String[] args) {
		int[] arr = { 1,1,2,2,2,3,3 };
//		int j = removeDuplis(arr);
//		System.out.println("Brute-forcce: ");
//		for(int i=0; i<j; i++) {
//			System.out.println(arr[i]);
//		}
		int k = removeDuplis(arr);
		System.out.println("Two-pointer: ");
		for(int i=0; i<k; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// brute-force (using set)
	static int removeduplis0(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		int k = set.size();
		int j = 0;
		for(int x: set) {
			arr[j++] = x;
		}
		return k;
	}
//	TC: O(N*Log(N))+O(N)
//	SC: O(N)
	
	// two pointer approach
	static int removeDuplis(int[] arr) {
		int i=0;
		for(int j=1; j<arr.length; j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}
}

// TC: O(N)
// SC: O(1)