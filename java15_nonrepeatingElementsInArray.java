
public class java15_nonrepeatingElementsInArray {

	public static void main(String[] args) {
		int[] arr = { 1,1,2,3,4,4,5,2 };
		findnonRepeatingElements(arr);
	}
	
	static void findnonRepeatingElements(int arr[]) {
		boolean chk;
		for(int i=0; i<arr.length; i++) {
			chk = false;
			for(int j=0; j<arr.length; j++) {
				if(i != j && arr[i] == arr[j]) {
					chk = true;
					break;
				}
			}
			if(!chk) System.out.println(arr[i] + " ");
		}
	}
}

// TC: O(N2)
// SC:O(1)