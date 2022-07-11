
public class java23_harshadNumber {

	public static void main(String[] args) {
		int i = 379, num = 379, sum=0;
		while(num > 0) {
			sum += num%10;
			num = num/10;
		}
		System.out.println(sum);
		if(i % sum == 0) System.out.println("Harshad Number");
		else System.out.println("Not a Harshad Number");
	
		String s = Integer.toString(i);
		sum = 0;
		for(int j=0; j<s.length(); j++) {
			sum += s.charAt(j) - '0';
		}
		if(i % sum == 0) System.out.println("Harshad Number");
		else System.out.println("Not a Harshad Number");
	}
}

// TC: O(N), where N is the number of digits;
// SC: 0(1);
