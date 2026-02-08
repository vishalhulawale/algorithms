package arrays.easy;

// 17: Pair Sum — Count Pairs with Given Sum
// Difficulty: Easy
//
// Problem Statement: Given an array of integers and a target sum, find the total number of pairs of elements whose sum equals the target. Each element may be used only once per pair. Two indices (i, j) where i < j form a valid pair if arr[i] + arr[j] == target.
//
// Examples:
//
// Input: arr = [1, 5, 7, -1, 5], target = 6
// Output: 3  — pairs: (1,5), (1,5), (7,-1)
//
// Input: arr = [2, 2, 2, 2], target = 4
// Output: 6

import java.util.HashMap;
import java.util.Map;

public class PairSum {

    public static int countPairsWithSum(int[] arr, int target) {
        Map<Integer, Integer> countMap = new HashMap<>();

        int pairCount = 0;

        for (int num : arr) {
            int requires = target - num;

            // Update pair count
            pairCount += countMap.getOrDefault(requires, 0);

            // Update count map
            int currentNumCount = countMap.getOrDefault(num, 0);
            countMap.put(num, currentNumCount + 1);
        }

        return pairCount;
    }

    public static void main(String[] ignoredArgs) {
        int[] arr1 = {1, 5, 7, -1, 5};
        int target1 = 6;
        System.out.println(countPairsWithSum(arr1, target1)); // Expected output: 3

        int[] arr2 = {2, 2, 2, 2};
        int target2 = 4;
        System.out.println(countPairsWithSum(arr2, target2)); // Expected output: 6
    }
}
