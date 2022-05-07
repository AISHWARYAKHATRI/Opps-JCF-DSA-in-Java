import java.util.stream.IntStream;

public class java09_avg {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6};
		float n = arr.length;
		int s = IntStream.of(arr).sum();
		float avg = s/n;
		System.out.println("Average of all elements of array is: " + avg);
		}
}
