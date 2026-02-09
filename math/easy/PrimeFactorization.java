package math.easy;

// 33: Prime Factorization
// Difficulty: Easy
//
// Problem Statement: Given a positive integer x, find all prime factors of x and return them as an array.
// The product of all elements in the returned array should equal x. Each prime factor should appear in the result as many times as it divides x.
// Return the factors in ascending order.

// Examples:
// Input: 12
// Output: [2, 2, 3]
//
// Input: 100
// Output: [2, 2, 5, 5]

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    public static List<Integer> primeFactors(int x) {
        int divisor = 2;
        List<Integer> factors = new ArrayList<>();

        while (divisor * divisor <= x) {
            if (x % divisor == 0) {
                factors.add(divisor);
                x /= divisor;
            } else {
                divisor++;
            }
        }

        if (x != 1)
            factors.add(x);

        return factors;
    }

    public static void main(String[] args) {
        int input1 = 12;
        System.out.println(primeFactors(input1)); // Expected output: [2, 2, 3]

        int input2 = 100;
        System.out.println(primeFactors(input2)); // Expected output: [2, 2, 5, 5]
    }
}
