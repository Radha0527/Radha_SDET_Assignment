package longestSubstring;
import java.util.HashMap;
import java.util.Scanner;
public class lengthOfLongestSubstring {
	
	public static String[] findLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0, substringStart = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }
            map.put(ch, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                substringStart = start;
            }
        }
        String longestSubstring = s.substring(substringStart, substringStart + maxLength);
        return new String[]{longestSubstring, String.valueOf(maxLength)};
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] result = findLongestSubstring(input);
        System.out.println("Longest Substring: " + result[0] + ", Length: " + result[1]);
        
        // 🔽 Hardcoded test case version (commented out)
        /*
        String input1 = "abcabcbb";
        String input2 = "bbbbb";

        String[] result1 = findLongestSubstring(input1);
        String[] result2 = findLongestSubstring(input2);

        System.out.println("Input: " + input1);
        System.out.println("Longest Substring: " + result1[0] + ", Length: " + result1[1]);

        System.out.println("Input: " + input2);
        System.out.println("Longest Substring: " + result2[0] + ", Length: " + result2[1]);
        */
    }

}
