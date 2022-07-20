import java.util.*;
public class java35_remove_duplicates_from_string {
	public static void main(String[] args) {
		String str = "madam";
// BRUTE FORCE SC: O(N*NN) SC: O(1)
		System.out.println(removeDuplicates1(str));
// USING BOOLEAN ARRAY SC: O(N) SC: O(1)
		System.out.println(removeDuplicates(str));
	}
	
	public static String removeDuplicates(String str) {
		boolean[] map = new boolean[26];
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			if(map[str.charAt(i) - 'a'] == false) 
				ans += str.charAt(i);
				map[str.charAt(i) - 'a'] = true;
			}
		return ans;
		}
	public static String removeDuplicates1(String str) {
		String ans = "";
	    for (int i = 0; i < str.length(); i++) {
	      int j = 0;
	      for (j = 0; j < i; j++) {
	        if (str.charAt(i) == str.charAt(j)) //same character found
	        {
	          break;
	        }
	      }
	      if (i == j) {
	        ans += str.charAt(i);
	      }
		}
	    return ans;
	}
}
