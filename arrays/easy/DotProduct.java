package arrays.easy;

// 15: Dot Product of Two Arrays
// Difficulty: Easy
//
// Problem Statement: Given two integer arrays, compute and return their dot product. The dot product is defined as the sum of element-wise products: result = array1[0]*array2[0] + array1[1]*array2[1] + .... If the two arrays have different lengths, compute the dot product over the length of the shorter array, ignoring extra elements in the longer one.
//
// Examples:
// Input: array1 = [1, 2, 3], array2 = [4, 5, 6]
// Output: 32  (1*4 + 2*5 + 3*6)
//
// Input: array1 = [1, 2, 3, 4], array2 = [5, 6]
// Output: 17  (1*5 + 2*6)

public class DotProduct {
    // Dummy implementation with dummy return value, to be implemented by the user
    public static long computeDotProduct(int[] array1, int[] array2) {
        int minLength = Math.min(array1.length, array2.length);

        long result = 0;
        for (int i = 0; i < minLength; i++) {
            result += (long) array1[i] * array2[i];
        }

        return result;
    }

    public static void main(String[] ignoredArgs) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println(computeDotProduct(array1, array2)); // Expected output: 32

        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {5, 6};
        System.out.println(computeDotProduct(array3, array4)); // Expected output: 17
    }
}
