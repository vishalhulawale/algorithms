import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {


    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLen = lengthOfLongestSubString(s);
        System.out.println("Length of Longest Substring: " + maxLen);
    }

    private static int lengthOfLongestSubString(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
