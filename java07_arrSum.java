import java.util.stream.IntStream;

public class java07_arrSum {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 9, 10, 3};
		int sum = 0;
		// using for loop
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		// using collection in java
		int s = IntStream.of(arr).sum();
		System.out.println(s);
	}
}
