package arrays.easy;

// Problem Statement: Find the second-smallest element in a sorted rotated array.

// Example:
// Input: [5, 6, 1, 2, 3, 4]
// Output: 2

public class SecondSmallestNumberInRotatedArray {

    public static int findSecondSmallest(int[] input) {
        int length = input.length;

        if (length == 1)
            return input[0];

        int left = 0, right = length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (input[mid] > input[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int secondMinIndex = (left + 1) % length;

        return input[secondMinIndex];
    }

    public static void main(String[] ignoredArgs) {
        int[] input1 = {3, 4, 5, 6, 1, 2};
        int[] input2 = {2, 1};

        System.out.println(findSecondSmallest(input1)); // Expected output: 2
        System.out.println(findSecondSmallest(input2)); // Expected output: 2
    }
}
