package math.easy;

// 29: Check if a Number is a Power of Another Number
// Difficulty: Easy
//
// Problem Statement: Given two positive integers x and y, determine whether x is a power of y. That is, check if there exists a non-negative integer k such that y^k == x. Handle edge cases where y is 1 (only x = 1 is valid) and where x is 0.
//
// Examples:
// Input: x = 27, y = 3
// Output: true  (3³ = 27)
//
// Input: x = 10, y = 2
// Output: false

public class PowerCheck {
    public static boolean isPowerOfAnother(int x, int y) {
        if (x == 1) return true;
        if (x == 0) return y == 0;

        while (x % y == 0) {
            x /= y;
        }

        return x == 1;
    }

    public static void main(String[] args) {
        int x1 = 27, y1 = 3;
        System.out.println(isPowerOfAnother(x1, y1)); // Expected output: true

        int x2 = 10, y2 = 2;
        System.out.println(isPowerOfAnother(x2, y2)); // Expected output: false
    }
}
