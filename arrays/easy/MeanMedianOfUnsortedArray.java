package arrays.easy;

// 16: Mean and Median of an Unsorted Array
// Difficulty: Easy
//
// Problem Statement: Given an unsorted array of n integers, compute both the mean (arithmetic average) and the median.
// The mean is the sum of all elements divided by the count. The median is the middle element when sorted; if the array has even length, return the average of the two middle elements.
//
// Examples:
// Input: [3, 1, 4, 1, 5]
// Output: Mean = 2.8, Median = 3
//
// Input: [7, 2, 10, 4]
// Output: Mean = 5.75, Median = 5.5

import java.util.Arrays;

public class MeanMedianOfUnsortedArray {
    public static double[] computeMeanAndMedian(int[] input) {
        int length = input.length;

        if (length == 0)
            return new double[]{0.0, 0.0};

        // Calculate mean
        long sum = 0;
        for (int j : input) {
            sum += j;
        }
        double mean = (double) sum / length;

        int[] sorted = Arrays.copyOf(input, length);
        Arrays.sort(sorted);

        double median;
        if (length % 2 == 0) {
            int mid1 = length / 2;
            int mid2 = mid1 - 1;

            median = (double) (sorted[mid1] + sorted[mid2]) / 2;
        } else {
            int mid = length / 2;
            median = sorted[mid];
        }

        return new double[]{mean, median};
    }

    public static void main(String[] ignoredArgs) {
        int[] input1 = {3, 1, 4, 1, 5};
        double[] result1 = computeMeanAndMedian(input1);
        System.out.println("Mean = " + result1[0] + ", Median = " + result1[1]); // Expected output: Mean = 2.8, Median = 3

        int[] input2 = {7, 2, 10, 4};
        double[] result2 = computeMeanAndMedian(input2);
        System.out.println("Mean = " + result2[0] + ", Median = " + result2[1]); // Expected output: Mean = 5.75, Median = 5.5
    }
}
