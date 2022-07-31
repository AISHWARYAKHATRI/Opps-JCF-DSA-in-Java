// input: array, output: true/false
// Suppose the sequence is A(A1, A2, A3) of N elements.
// There exists a value X such that 1 <= X <= N, such that:
// 1) The sequence should be "strictly" increasing from index 1 to X. (1, 2, 2 not allowed)
// 2) The sequence should be strictly decreasing from the index X to N. You can rearrange the elements if required. Use the elements from the array only once

// eg. 1, 9, 8, 3, 4, 5 --> 1, 3, 4, 5, 8, 9 --> true
// eg. 1, 3, 3, 2 --> false 
// eg. 1, 4, 3, 3, 2 --> 1, 3, 4, 3, 2 --> true
// eg. 1, 4, 3, 2, 3, 3 --> false 
// eg. 1, 1, 2, 2, 3, 3, 4, 4, 9 --> 1, 2, 3, 4 , 9, 4, 3, 2, 1 --> true
// Algorithm: The maximum element will always be in the middle and can be 1. So it cannot repeat.
//          : The rest of the elements can repeat but not more than 2 time.

import java.util.*;
public class java42_sequence {
	public static void main(String [] args) {
		int [] arr = {1, 4, 3, 3, 2};
		int max = arr[0];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			if(!map.containsKey(arr[i])) map.put(arr[i], 1);
			else map.put(arr[i], map.get(arr[i])+1);
		}
		for(int key: map.keySet()) {
			if((key == max && map.get(key) > 1) || map.get(key) > 2) {
				System.out.println("False"); 
				return;
			}
		}
		System.out.println("True");
		return;
	}
}
