package math.easy;

// 30: Is Power of 10
// Difficulty: Easy
//
// Problem Statement: Given a positive integer x, determine whether it is a power of 10. A number is a power of 10 if it can be expressed as 10^k for some non-negative integer k (i.e., 1, 10, 100, 1000, ...). Implement this without using logarithmic functions for a clean iterative solution.
//
// Examples:
// Input: 1000
// Output: true
//
// Input: 500
// Output: false

public class PowerOf10Check {
    public static boolean isPowerOf10(int x) {
        if (x <= 0) return false; // Power of 10 must be positive

        while (x % 10 == 0) {
            x /= 10;
        }

        return x == 1;
    }

    public static void main(String[] args) {
        int input1 = 1000;
        System.out.println(isPowerOf10(input1)); // Expected output: true

        int input2 = 500;
        System.out.println(isPowerOf10(input2)); // Expected output: false
    }
}
