
public class java13_addElementInArray {
	public static void main(String[] args) {
		int[] arr = { 10,9,14,8,20,48,16,9,0 };
		int n = 8;
        
		System.out.println("Before manipulation: ");
		for(int i=0; i<=n; i++) {
			System.out.print(arr[i] + " ");
		}
        System.out.println(" ");
//		System.out.println("After inserting in beginning: ");
//		insertAtBegin(arr, 40, n);
//		System.out.println("After inserting at end: ");
//		insertAtEnd(arr, n, 40);
		System.out.println("After inserting in between: ");
		insertAtPosition(arr, n, 6, 2);
		for(int i=0; i<=n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void insertAtBegin(int[] arr, int value, int len) {
		for(int i=len-1; i>=0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = value;
	}
	
	static void insertAtEnd(int[] arr, int n, int value) {
		arr[n] = value;
	}
	
	static void insertAtPosition(int[] arr, int n, int value, int pos) {
		for(int i=n; i>=pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos-1] = value;
	}

}
