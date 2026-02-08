package strings.easy;

// First Non-Repeating Character

// Problem Statement: Given a string of lowercase English characters, find and return the first character that does not repeat anywhere in the string.
// Traverse the string from left to right and identify the character whose frequency is exactly one and whose first occurrence comes earliest.
// If every character repeats, return an appropriate indicator (e.g., '_' or null).

// Examples:
// Input: "racecars"
// Output: "e"

// Input: "aabdcce"
// Output: "b"

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacterV1(String input) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);

            Integer currentCount = countMap.getOrDefault(ch, 0);
            countMap.put(ch, currentCount + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            Integer count = countMap.get(ch);
            if (count == 1)
                return ch;
        }

        return '_'; // Placeholder return value
    }

    public static char findFirstNonRepeatingCharacterV2(String input) {
        int[] arr = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int chIndex = ((int) ch - 97);
            arr[chIndex] = arr[chIndex] + 1;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int chIndex = ((int) ch - 97);
            int count = arr[chIndex];
            if (count == 1)
                return ch;
        }

        return '_'; // Placeholder return value
    }

    public static void main(String[] args) {
        String input1 = "racecars";
        String input2 = "aabdcce";
        String input3 = "aabbcc";

        System.out.println(findFirstNonRepeatingCharacterV1(input1)); // Expected output: 'e'
        System.out.println(findFirstNonRepeatingCharacterV1(input2)); // Expected output: 'b'
        System.out.println(findFirstNonRepeatingCharacterV1(input3)); // Expected output: '_'

        System.out.println(findFirstNonRepeatingCharacterV2(input1)); // Expected output: 'e'
        System.out.println(findFirstNonRepeatingCharacterV2(input2)); // Expected output: 'b'
        System.out.println(findFirstNonRepeatingCharacterV2(input3)); // Expected output: '_'
    }
}
