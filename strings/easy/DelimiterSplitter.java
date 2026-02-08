package strings.easy;

import java.util.ArrayList;
import java.util.List;

// 8: Split String by Delimiter
// Difficulty: Easy

// Problem Statement: Given a string and a delimiter character, split the string at each occurrence of the delimiter and return the resulting list of substrings. Consecutive delimiters may produce empty strings in the result. This tests basic string parsing without using built-in split methods.

// Examples:

// Input: str = "one,two,three,four", delimiter = ','
// Output: ["one", "two", "three", "four"]

// Input: str = "hello world foo", delimiter = ' '
// Output: ["hello", "world", "foo"]

public class DelimiterSplitter {

    // Dummy method with no implementation, to be implemented by the user
    public static List<String> splitStringByDelimiter(String str, char delimiter) {
        if (str == null) {
            return null;
        }

        List<String> result = new ArrayList<>();

        StringBuilder current = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delimiter) {
                result.add(current.toString());
                current.setLength(0);
            } else {
                current.append(str.charAt(i));
            }
        }

        // Add last word
        result.add(current.toString());

        return result;
    }

    public static void main(String[] ignoredArgs) {
        String str1 = "one,two,three,four";
        char delimiter1 = ',';
        List<String> result1 = splitStringByDelimiter(str1, delimiter1);
        System.out.println(result1); // Expected output: ["one", "two", "three", "four"]

        String str2 = "hello world foo";
        char delimiter2 = ' ';
        List<String> result2 = splitStringByDelimiter(str2, delimiter2);
        System.out.println(result2); // Expected output: ["hello", "world", "foo"]
    }

}
