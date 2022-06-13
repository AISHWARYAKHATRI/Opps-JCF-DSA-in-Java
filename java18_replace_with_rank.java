import java.util.Arrays;
import java.util.*;

public class java18_replace_with_rank {

	public static void main(String[] args) {
		int [] arr = {20,15,26,2,98,6};
		int [] arr1 = Arrays.copyOf(arr, arr.length);
		Map<Integer, Integer> map = new HashMap<>();
		
		Arrays.sort(arr1);
		int temp = 1;
		for(int i=0;i<arr1.length; i++) {
			map.put(arr1[i], temp);
			temp++;
		}
		
		for(int i=0; i<arr.length; i++) {
				System.out.print(map.get(arr[i]) + " ");
		}
	}
}

// TC: O(n) + O(nlogn) + O(n) for copying the elements,sorting the elements, priting the rank respectively
// SC: O(n+n)
