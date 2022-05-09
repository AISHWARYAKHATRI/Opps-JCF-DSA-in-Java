import java.util.Arrays;
import java.util.*;

public class java12_removeDuplisUnsortedArr {

	public static void main(String[] args) {
		int[] arr = {2,3,1,9,3,1,3,9};
		Arrays.sort(arr);
		
// approach 1
//		int k = removeDuplis(arr);
		
// approach 2
		removeDuplis1(arr);
//		for(int i=0; i<k; i++) {
//			System.out.println(arr[i ]);
//		}
	}
	
	static int removeDuplis(int[] arr) {
		int i=0;
		for(int j=1; j<arr.length; j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i + 1;
	}
	
	static void removeDuplis1(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				System.out.println(arr[i] + " ");
				map.put(arr[i], 1);
			}
		}
	}
}
