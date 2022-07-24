
public class java38_barcode {
	public static void main(String [] args) {
		String str = "CD#34";  // 1 + 2 + 9(97, max of 9 and 7) + 9(98, max of 9 a0nd 8) = 21
//		+ 4(42, max of 4 and 2)
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			int max = 0;
			if(Character.isDigit(str.charAt(i))) {   // if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
//     to convert numeric char to int Character.getNumericValue(str.charAt(i))
//				sum += Character.getNumericValue(str.charAt(i));
				sum += (int) str.charAt(i) - 48;
			}else {
				int n = (int) str.charAt(i);
				while(n > 0) {
					int digit;
					digit = n % 10;
					if(digit > max) max = digit;
					n /= 10;
				}
				sum += max;
			}
		}
		System.out.println("The price of the product is: " + sum);
//		Methods to convert string to number Integer.parseInt() and Integer.valueOf()
		String s = "24";
		System.out.println(Integer.parseInt(s));
		System.out.println(Integer.valueOf(s));
	}
}
