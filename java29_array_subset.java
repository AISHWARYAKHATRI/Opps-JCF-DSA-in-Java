import java.util.*;
public class java29_array_subset {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 8, 2};
		int[] arr2  = {1, 2, 3, 4, 5, 8};
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<arr2.length; i++) {
			set.add(arr2[i]);
		}
		for(int i=0; i<arr1.length; i++) {
			if(!set.contains(arr1[i])) {
				System.out.println("Not a subset");
				return;
			}else {
				continue;
			}
		}
		System.out.println("Is a subset");
	}
}
