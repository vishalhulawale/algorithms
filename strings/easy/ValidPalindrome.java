package strings.easy;

/**
 * Problem Statement: Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * <p>
 * Invalid Example: s = "race a car"
 * Output = false
 **/
public class ValidPalindrome {

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        boolean result1 = isPalindrome(s1);
        System.out.println("Is \"" + s1 + "\" a palindrome? " + result1); // true

        String s2 = "race a car";
        boolean result2 = isPalindrome(s2);
        System.out.println("Is \"" + s2 + "\" a palindrome? " + result2); // false

        // Additional test cases to cover empty and single character strings
        String s3 = "";
        boolean result3 = isPalindrome(s3);
        System.out.println("Is \"" + s3 + "\" a palindrome? " + result3); // true

        String s4 = "a";
        boolean result4 = isPalindrome(s4);
        System.out.println("Is \"" + s4 + "\" a palindrome? " + result4); // true
    }

    private static boolean isPalindrome(String str) {
        int strLen = str.length();

        // Cover edge cases
        if (strLen == 0 || strLen == 1)
            return true;

        int left = 0, right = str.length() - 1;

        while (left < right) {
            // Ensure character at left is alphanumeric
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Check for exit condition
            char leftChar = Character.toLowerCase(str.charAt(left));
            char rightChar = Character.toLowerCase(str.charAt(right));

            if(leftChar != rightChar){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
