package strings.easy;

// Find Last Index of a Character in a String
// Difficulty: Easy

// Problem Statement: Given a string str and a character x, write a function that returns the last (rightmost) index at which x appears in str. 
// If the character is not found, return -1. The search should consider the entire string.

// Examples:

// Input: str = "hello world", x = 'o'
// Output: 7

// Input: str = "programming", x = 'g'
// Output: 10


public class LastIndexOfCharacter {

    public static int findLastIndexOfCharacter(String str, char x) {
        int strLen = str.length();
        for (int i = strLen - 1; i >= 0; i--) {
            if (str.charAt(i) == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "hello world";
        char x1 = 'o';
        System.out.println(findLastIndexOfCharacter(str1, x1)); // Expected output: 7

        String str2 = "programming";
        char x2 = 'g';
        System.out.println(findLastIndexOfCharacter(str2, x2)); // Expected output: 10
    }
}
