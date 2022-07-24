// Given a string , convert it into alternate lower case and upper case letters. First char 
// should be lower case and upper case and so on....
public class java37_upperLowerCase {
	public static void main(String [] args) {
		String str = "TCSNQT"; //cOdInGiNjAvA
		String str1 = "", str2 = "";
		for(int i=0; i<str.length(); i++) {
			if(i % 2 != 0) {
				str1 += Character.toUpperCase(str.charAt(i));
				if(!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
					str2 += (char)(str.charAt(i) - 32);
				}else {
					str2 += str.charAt(i);
				}
			}
			if(i % 2 == 0) {
				str1 += Character.toLowerCase(str.charAt(i));
				if(!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
					str2 += (char)(str.charAt(i) + 32);
				}else {
					str2 += str.charAt(i);
				}
			}
		}
		System.out.println("Even Odd Conditions" + str1);
		System.out.println("Using ASCII" + str2);
	}
}
