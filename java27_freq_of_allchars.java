import java.util.*;
public class java27_freq_of_allchars {

	public static void main(String[] args) {
//		using map TC: O(N) SC: O(N)
		String str = "takeyouforward";
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			if(!map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), 1);
				}
			else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		System.out.println("Using map");
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
//		Using sorting the string after converting into char array TC: O(NlogN), since sorting 
//		function requires nlogn time. SC: O(1)
		System.out.println("Using sorting");
		printFrequency(str);
		
//		Using array frequency. Since we have only 26 possible lowercase english alphabets. The indexes of the array will represent all such characters and value at any index will represent 
//		the count or frequency of that character in the original array. TC: O(N), where n is the length of string. SC: O(1);

//      For example, index 0 will represent character ‘a’, index 1 will represent the character ‘b’, so on and so forth.
		System.out.println("Using frequency array");
		arrayFrequency(str);
	}
	
	static void printFrequency(String str) {
		str = SortString(str);
		char ch = str.charAt(0);
		int count = 1;
		for(int i=1; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}else {
				System.out.println(ch + " " + count);
				ch = str.charAt(i);
				count = 1;
			}
		}
			System.out.println(ch + " " + count);
	}
	static String SortString(String str) {
		char c[] = str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	static void arrayFrequency(String str) {
		int[] freq = new int[26];
		for(int i=0; i<str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[i] != 0) {
				System.out.print((char) (i + 'a'));
				System.out.print(" " + freq[i] + "\n");
			}
		}
	}
}
