
public class java28_search_element_inArray {
	public static void main(String[] args) {
		int [] arr = {1, 4, 5, 9, 3, 2, 0};
	
		int k = 5, ans = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == k) {
				ans = i;
				break;
			}
		}
		System.out.println("Using linear search:");
		System.out.println(ans);
		
		int [] arr1 = {1, 2, 3, 4, 5, 6};
		int low = 0, high = arr1.length-1;
		int k1 = 1, ans1 = -1;
		while(low < high) {
			int mid = (low + high)/2;
			if(arr1[mid] == k1) {
				ans1 = mid;
				break;
			}else if(k1 < mid) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		System.out.println("Using binary search(provided that the array is sorted):");
		System.out.println(ans1);
	}
}
