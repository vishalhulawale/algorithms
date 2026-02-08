package math.easy;

// 28: Armstrong Number Check
// Difficulty: Easy
//
// Problem Statement: An Armstrong number (also known as a narcissistic number) of n digits is a number where the sum of each digit raised to the power of n equals
// the number itself. For a 3-digit number, it means the sum of cubes of its digits equals the number. Given an integer, determine if it is an Armstrong number.
//
// Examples:
// Input: 371
// Output: true  (3³ + 7³ + 1³ = 27 + 343 + 1 = 371)
//
// Input: 123
// Output: false  (1³ + 2³ + 3³ = 1 + 8 + 27 = 36 ≠ 123)

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int input) {
        if (input < 0) return false;
        if (input == 0) return true;

        int num = input;
        int count = 0;

        // Count digits
        while (num > 0) {
            count++;
            num /= 10;
        }

        num = input;
        int sum = 0;

        // Calculate Armstrong sum
        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, count);
            num /= 10;
        }

        return sum == input;
    }

    public static void main(String[] args) {
        int input1 = 371;
        System.out.println(isArmstrongNumber(input1)); // Expected output: true

        int input2 = 123;
        System.out.println(isArmstrongNumber(input2)); // Expected output: false
    }
}
