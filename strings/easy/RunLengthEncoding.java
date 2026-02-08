package strings.easy;

// Run Length Encoding

// Problem Statement: Implement a run-length encoding function. Given a string of characters, compress it by replacing consecutive identical characters with the character followed by the count of its consecutive occurrences. This is a basic form of lossless data compression.

// Examples:

// Input: "aabbb"
// Output: "a2b3"

// Input: "SSSSSTTPPQ"
// Output: "S5T2P2Q1"

public class RunLengthEncoding {

    // Dummy method with no implementation, to be implemented by the user
    public static String encode(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        char prev = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {

            char curr = input.charAt(i);

            if (curr == prev) {
                count++;
            } else {
                result.append(prev).append(count);
                prev = curr;
                count = 1;
            }
        }

        // Add last character group
        result.append(prev).append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "aabbb";
        System.out.println(encode(input1)); // Expected output: "a2b3"

        String input2 = "SSSSSTTPPQ";
        System.out.println(encode(input2)); // Expected output: "S5T2P2Q1"
    }
}