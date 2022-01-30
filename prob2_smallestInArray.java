import java.util.Arrays;

//Problem Statement: Given an array, we have to find the smallest element in the array.

public class prob2_smallestInArray {
      public static void main(String[] args) {
    	  int arr1[] = {10, 15, 6, 3, 90};
    	  System.out.println("The smallest number is: " + sort(arr1));
    	  int arr2[] = {12, 100, 78, 1, 23};
    	  System.out.println("The smallest number is: " + sort(arr2));
      }
    	  
    	  static int sort(int[] arr) {
    		  Arrays.sort(arr);
    		  return arr[0];
      }
}

//Time complexity: O(N*log(N))
//Space Complexity: 0(1)
