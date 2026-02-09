package math.easy;

// 31: Fibonacci — Nth Number (Iterative and Recursive)
// Difficulty: Easy
//
// Problem Statement: The Fibonacci series is defined as: F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2) for n ≥ 2. Given a non-negative integer n, return the nth Fibonacci number. Implement both an iterative and a recursive approach. Discuss the time and space complexity trade-offs of each.
//
// Examples:
// Input: n = 6
// Output: 8  (sequence: 0, 1, 1, 2, 3, 5, 8)
//
// Input: n = 10
// Output: 55

public class Fibonacci {
    public static int fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;


        int prev = 0, fib = 1;
        for (int i = 2; i <= n; i++) {
            int temp = fib;
            fib = prev + fib;
            prev = temp;
        }

        return fib;
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n1 = 6;
        System.out.println("Iterative: " + fibonacciIterative(n1)); // Expected output: 8
        System.out.println("Recursive: " + fibonacciRecursive(n1)); // Expected output: 8

        int n2 = 10;
        System.out.println("Iterative: " + fibonacciIterative(n2)); // Expected output: 55
        System.out.println("Recursive: " + fibonacciRecursive(n2)); // Expected output: 55
    }
}
