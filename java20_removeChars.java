
public class java20_removeChars {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String str = "take12% *&u ^$#forward";
		for(int i=0; i<str.length(); i++) {
			int ascii = (int) str.charAt(i);
			if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}

// TC: O(N)
// SC: O(N)