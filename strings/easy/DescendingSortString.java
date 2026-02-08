package strings.easy;

// 7: Sort a String in Descending Order
// Difficulty: Easy

// Problem Statement: Given a string consisting of lowercase English characters, sort all characters of the string in descending (reverse alphabetical) order. Return the resulting string. Characters that appear more than once should all appear in their correct sorted positions.

// Examples:
// Input: "mupursingh"
// Output: "uusrpnmihg"

// Input: "apple"
// Output: "pplea"

import java.util.Arrays;

public class DescendingSortString {

    public static String sortStringDescending(String input) {
        if (input == null || input.isEmpty())
            return input;

        int[] count = new int[26];
 
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            int index = curr - 'a';
            count[index]++;
        }

        StringBuilder result = new StringBuilder();
        for (int j = count.length - 1; j >= 0; j--) {
            if (count[j] == 0)
                continue;

            char curr = (char) (j + 'a');
            for (int k = 0; k < count[j]; k++) {
                result.append(curr);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "mupursingh";
        String input2 = "apple";

        System.out.println(sortStringDescending(input1)); // Expected output: "uusrpnmihg"
        System.out.println(sortStringDescending(input2)); // Expected output: "pplea"
    }
}
