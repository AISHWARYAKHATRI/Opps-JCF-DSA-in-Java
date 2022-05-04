
import java.util.*;

public class java05_freqOfEachElement {
	
	public static void main(String[] args) {
		int[] arr = {3, 5, 1, 10, 10, 1, 3, 5, 10};
		int n = arr.length;
		countFreq(arr);
		countFreq1(arr, n);
	}
	
	// using map
	
	static void countFreq(int[] arr) {
		   Map<Integer, Integer> map = new HashMap<>();
		   for(int i=0; i<arr.length; i++) {
			   if(map.containsKey(arr[i])) {
				   map.put(arr[i], map.get(arr[i]) + 1);
			   }
			   else {
				   map.put(arr[i], 1);
			   }
		   }
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -----> " + entry.getValue());
		}
		System.out.println("\n\n");
  }
	
	// using two for loops 
	
	static void countFreq1(int[] arr, int n) {
		boolean visited[] = new boolean[n];
		
		for(int i=0; i<n; i++) {
			if(visited[i] == true) continue;
			
			int count = 1;
			for(int j=i+1; j<n; j++){
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " ---->" + count);
		}
	}
}