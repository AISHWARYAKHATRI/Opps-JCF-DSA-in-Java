import java.util.*;

public class java16_symmetricPairs {
	public static void main(String[] args) {
		int[][] arr = { {1,2}, {2,1}, {3,4}, {4,5}, {5,4} };
		int n = 5;
		System.out.println("Brute-Force Approach: ");
		symmetricPairs(arr, n);
		System.out.println("Using Hashmap: ");
		symmetricPairs1(arr, n);
	}
	// Brute-force
	static void symmetricPairs(int[][] arr, int n) {
		for(int i=0; i<n; i++) {	
			for(int j=i+1; j<n; j++) {
				if((arr[i][0] == arr[j][1]) && (arr[i][1] == arr[j][0])) {
					System.out.println(" (" + arr[i][0] + "," + arr[i][1] + ")");
					break;
				}
			}
		}
	}
	// TC: O(N*N)
	// SC: O(1)
	
	// Using hashMap
	static void symmetricPairs1(int[][] arr, int n) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			int first = arr[i][0];
			int second = arr[i][1];
			if(map.get(second) != null && map.get(second) == first) {
				System.out.println("(" + first + "," + second + ")");
			}
			else {
				map.put(first, second);
			}
		}
	}
    // TC: O(N);
    // SC: 0(N) for using a hashmap	
	
}

