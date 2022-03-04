class Reverse{
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public void rev(int[] arr) {
		int n = arr.length-1, temp;
		for(int i=0; i<=n/2; i++) {
		 temp = arr[i];
		  arr[i] = arr[n-i];
		  arr[n-i] = temp;
		}
		printArr(arr);
	}
}

public class java04_reverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = {5,4,3,2,1};
         Reverse sol = new Reverse();
         sol.rev(arr);
	}

}

//Time Complexity: O(n), single-pass involved.
//
//Space Complexity: O(1) 
