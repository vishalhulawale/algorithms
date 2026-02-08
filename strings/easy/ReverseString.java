package strings.easy;

// 10: Debug and Fix String Reversal
// Difficulty: Easy

// Problem Statement: You are given a program that is intended to reverse a string but contains one or more bugs. Your task is to identify the bugs, fix them, and ensure the corrected program passes all test cases. The function should take a string as input and return its reverse. Consider edge cases such as empty strings, single characters, and strings with special characters.

// Examples:
// Input: "hello"
// Output: "olleh"

// Input: "abcd"
// Output: "dcba"

public class ReverseString {

    // Dummy implementation with bugs
    public static String reverseString(String input) {
        if (input == null || input.isEmpty())
            return input;

        int len = input.length();
        int start = 0, end = len - 1;

        StringBuilder result = new StringBuilder(input);
        while (start < end) {
            char temp = result.charAt(start);
            result.setCharAt(start, result.charAt(end));
            result.setCharAt(end, temp);

            start++;
            end--;
        }

        return result.toString();
    }

    public static void main(String[] ignoredArgs) {
        String input1 = "hello";
        String input2 = "abcd";
        String input3 = "";
        String input4 = "a";
        String input5 = "123!@#";

        System.out.println(reverseString(input1)); // Expected output: "olleh"
        System.out.println(reverseString(input2)); // Expected output: "dcba"
        System.out.println(reverseString(input3)); // Expected output: ""
        System.out.println(reverseString(input4)); // Expected output: "a"
        System.out.println(reverseString(input5)); // Expected output: "#@!321"
    }

}
