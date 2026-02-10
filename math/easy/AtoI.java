package math.easy;

// 58: ATOI — String to Integer Conversion
// Difficulty: Easy
//
// Problem Statement: Implement the atoi (ASCII to Integer) function, which converts a string to a 32-bit signed integer.
// The function should: (1) discard leading whitespace,
//                      (2) check for an optional + or - sign,
//                      (3) read in digits until a non-digit character is reached or end of string,
//                      (4) convert the digits to an integer.
// If the result overflows, clamp it to INT_MIN (-2³¹) or INT_MAX (2³¹ - 1). Return 0 if no valid conversion can be performed.

// Examples:
// Input: "42"
// Output: 42
//
// Input: "   -42"
// Output: -42
//
// Input: "4193 with words"
// Output: 4193

// Input: "2147483648"
// Output: 2147483647 (clamped to INT_MAX)
//
// Input: "-2147483649"
// Output: -2147483648 (clamped to INT_MIN)

// 2147483647 => INT_MAX

//

public class AtoI {
    public static int convert(String str) {
        if (str == null || str.isEmpty()) return 0;

        int i = 0;
        int n = str.length();

        // Skip whitespace
        while (i < n && str.charAt(i) == ' ') i++;

        // Handle sign
        int sign = 1;
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits
        int result = 0;

        while (i < n && Character.isDigit(str.charAt(i))) {

            int digit = str.charAt(i) - '0';

            // Overflow check
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String input1 = "42";
        System.out.println(convert(input1)); // Output: 42

        String input2 = "   -42";
        System.out.println(convert(input2)); // Output: -42

        String input3 = "4193 with words";
        System.out.println(convert(input3)); // Output: 4193

        String input4 = "2147483648";
        System.out.println(convert(input4)); // Output: 2147483647 (clamped to INT_MAX)

        String input5 = "-2147483649";
        System.out.println(convert(input5)); // Output: -2147483648 (clamped to INT_MIN)
    }
}
