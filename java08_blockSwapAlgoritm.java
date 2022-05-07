
public class java08_blockSwapAlgoritm {
	public static void main(String[] args) {
    int[] arr = { 1,2,3,4,5 };
    int k = 2;
    k = k % arr.length;
   reverse(arr, 0, arr.length-1);
   reverse(arr, 0, k);
   reverse(arr, k+1,arr.length-1);
   printArr(arr);
  }
     static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
     
     static void printArr(int[] arr) {
    	 for(int i=0; i<arr.length; i++) {
    	 System.out.println(arr[i]);
       }
     }
}