// Given a string find the number of permutation possible form its character
// Permutation: A permutation of a string is another  string that contains same character, only 
// the order of characters can be different
import java.util.*;
public class java41_possible_permutation {
	public static void main(String [] args) {
		String str = "aabbcc"; // 4! / 2 = 12, if abc = 6, if hello = 5! / 2 = 60, aabbbcc = 7! / 2! * 3! * 2!
		int freq = 1, ans = 0;
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		ans = fact(str.length());
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				freq = entry.getValue();
				 ans =  ans/fact(freq);
			}
			
		}
		System.out.println(ans);
	}
	static int fact(int n) {
		if(n == 0) return 1;
		return fact(n-1)*n; 
	}
}
