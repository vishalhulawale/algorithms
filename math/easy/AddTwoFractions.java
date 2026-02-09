package math.easy;

// 32: Add Two Fractions
// Difficulty: Easy
//
// Problem Statement: Given two fractions represented as pairs of integers (numerator, denominator), compute their sum and return the result as a simplified fraction.
// The result should be reduced to its lowest terms using the Greatest Common Divisor (GCD). Handle negative fractions and ensure the denominator is always positive.
//
// Examples:
// Input: (1, 3) + (3, 9)
// Output: (2, 3)
//
// Input: (1, 2) + (1, 3)
// Output: (5, 6)

public class AddTwoFractions {

    public static int[] addFractions(int[] fraction1, int[] fraction2) {
        int n1 = fraction1[0], d1 = fraction1[1];
        int n2 = fraction2[0], d2 = fraction2[1];

        int nom = (n1 * d2) + (n2 * d1);
        int deno = d1 * d2;

        int gcd = gcd(nom, deno);

        nom /= gcd;
        deno /= gcd;

        if (deno < 0) {
            deno = -deno;
            nom = -nom;
        }

        return new int[]{nom, deno};
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] fraction1 = {1, 3};
        int[] fraction2 = {3, 9};
        int[] result1 = addFractions(fraction1, fraction2);
        System.out.println("(" + result1[0] + ", " + result1[1] + ")"); // Expected output: (2, 3)

        int[] fraction3 = {1, 2};
        int[] fraction4 = {1, 3};
        int[] result2 = addFractions(fraction3, fraction4);
        System.out.println("(" + result2[0] + ", " + result2[1] + ")"); // Expected output: (5, 6)
    }
}
