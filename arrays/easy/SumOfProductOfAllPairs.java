package arrays.easy;

// 18: Sum of Product of All Pairs
//
// Problem Statement: Given an array of integers, find the sum of the product of every unique pair (arr[i], arr[j]) where i < j.
// You should consider all combinations of two distinct indices and sum up their products. An efficient O(n) mathematical approach exists using algebraic identities.
//
// Examples:
// Input: [1, 3, 4]
// Output: 19  — (1*3) + (1*4) + (3*4) = 3 + 4 + 12 = 19
//
// Input: [2, 3, 5]
// Output: 31  — (2*3) + (2*5) + (3*5) = 6 + 10 + 15 = 31

public class SumOfProductOfAllPairs {

    public static long getSumOfProductOfAllPairs(int[] arr) {
        // (a+b+c)^2 = (a^2+b^2+c^2) + 2(ab+bc+ac)
        // (a+b+c)^2 - (a^2+b^2+c^2) = 2(ab+bc+ac)
        // ((a+b+c)^2 - (a^2+b^2+c^2))/2 = ab+bc+ac

        long sum = 0;
        long sumOfSquares = 0;
        for (int num : arr) {
            sum += num;
            sumOfSquares += ((long) num * num);
        }

        return ((sum * sum) - sumOfSquares) / 2;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 3, 4};
        System.out.println(getSumOfProductOfAllPairs(input1)); // Expected output: 19

        int[] input2 = {2, 3, 5};
        System.out.println(getSumOfProductOfAllPairs(input2)); // Expected output: 31
    }

}
