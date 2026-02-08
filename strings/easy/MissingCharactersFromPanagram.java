package strings.easy;

// 4: Missing Characters to Make Pangram
// Difficulty: Easy

// Problem Statement: A pangram is a sentence that contains every letter of the English alphabet at least once. Given a string, determine which letters of the English alphabet are missing from the string. Return all missing letters in alphabetical order. The check should be case-insensitive.

// Examples:

// Input: "The quick brown fox jumps over the lazy dog"
// Output: "" (empty — it is already a pangram)

// Input: "Hello World"
// Output: "abcfgijkmnpqstuvxyz"

public class MissingCharactersFromPanagram {

    // Dummy method without logic
    public static String findMissingCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return "abcdefghijklmnopqrstuvwxyz";
        }

        boolean[] present = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a';
                present[index] = true;
            }
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < present.length; i++) {
            if (!present[i]) {
                char c = (char) (i + 'a');
                str.append(c);
            }
        }

        return str.toString();
    }

    public static void main(String[] ignoredArgs) {
        String input1 = "The quick brown fox jumps over the lazy dog";
        String input2 = "Hello World";

        System.out.println("Missing Chars: \"" + findMissingCharacters(input1) + "\""); // Expected output: ""
        System.out.println("Missing Chars: \"" + findMissingCharacters(input2) + "\""); // Expected output: "abcfgijkmnpqstuvxyz"
    }
}
