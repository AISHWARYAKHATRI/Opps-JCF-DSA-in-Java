
public class java14_findRepeatingElements {

	public static void main(String[] args) {
		int[] arr = { 1,1,2,3,4,4,5,2 };
		findRepeatingElements(arr);
	}
	
	static void findRepeatingElements(int arr[]) {
		int len = arr.length-1;
		int cnt = 0;
		int[] dup = new int[arr.length];
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<=len; j++) {
				if(arr[i] == arr[j]) dup[cnt++] = arr[i];
			}
	}
		for(int i=0; i<cnt; i++) {
			if(dup[i] != dup[i+1]) System.out.println(dup[i] + " ");
		}
	}
}

// TC: O(N2) + O(N) REASON: We are taking one element and searching its repeating element again in the array. Also, iterating through the dup array which contains repeating elements to find unique repeating elements.
// SC: O(N)