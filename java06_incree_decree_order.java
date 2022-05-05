import java.util.Arrays;

public class java06_incree_decree_order {

	public static void main(String[] args) {
		int [] arr = { 4, 2, 8, 6, 15, 5, 9, 20, 3, 25 };
		int len = arr.length;
		Arrays.sort(arr);
		for(int i=0; i<len/2; i++) {
			System.out.println(arr[i]);
		}
		for(int i=len-1; i>=len/2; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("\napproach 2");
		
        sort(arr, len); //my approach
        
	}
	
	static void sort(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int temp;
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		sort2(arr, n);
	}
	
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void sort2(int[] arr, int n) {
		int temp, half = n/2;
		for(int i=n-1; i>=(n/2+n)/2; i--) {
			temp = arr[half];
			arr[half] = arr[i];
			arr[i] = temp;
			half++;
		}
		printArr(arr);
	}
}
