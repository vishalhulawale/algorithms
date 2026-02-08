package arrays.easy;

// 19: Divisible by 3 Using Array Digits
// Difficulty: Easy
//
// Problem Statement: Given an array of single-digit integers, determine whether it is possible to concatenate all the digits (in any order) to form a number that is divisible by 3.
// A number is divisible by 3 if and only if the sum of its digits is divisible by 3. You must use all digits in the array.
//
// Examples:
// Input: [3, 1, 2]
// Output: true  (sum = 6, divisible by 3)
//
// Input: [1, 2, 4]
// Output: false  (sum = 7, not divisible by 3)

public class DivisibleByThree {

    public static boolean canFormDivisibleByThree(int[] digits) {
        long sum = 0;
        for (int num : digits) {
            sum += num;
        }

        return sum % 3 == 0;
    }

    public static void main(String[] ignoredArgs) {
        int[] input1 = {3, 1, 2};
        System.out.println(canFormDivisibleByThree(input1)); // Expected output: true

        int[] input2 = {1, 2, 4};
        System.out.println(canFormDivisibleByThree(input2)); // Expected output: false
    }
}
