
public class java36_replaces_0s_with_1s {
	public static void main(String [] args) {

	int n = 204;  // output = 214
	int result = replaceZerosWithOnes(n);
	System.out.println(result);
	}
	static int replaceZerosWithOnes(int n) {
		if(n == 0) return 1;
		int ans = 0, tmp = 1;
		while(n > 0) {
			int d = n % 10;
			if(d == 0) {
				d = 1;
			}
			ans = d * tmp + ans;
			n = n / 10;
			tmp = tmp * 10;
		}
		return ans;
	}
	
//	TC: O(N) where N is the number of digits in input integer
//	SC: O(1)
}
