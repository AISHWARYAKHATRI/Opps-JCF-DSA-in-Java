// Write a program to reverse the string?
class java45_reverse_string{
	public static void main(String [] args) {
		String str = "reverse the string";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}
}