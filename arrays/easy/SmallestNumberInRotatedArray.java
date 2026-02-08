package arrays.easy;

//   Problem Statement: Find the smallest number in a sorted array that has been rotated.
//   Example:
//   Input: [3, 4, 5, 6, 1, 2]
//   Output: 1

//   Test Cases:
//   FindMin(new int[]{3,4,5,6,1,2}) == 1
//   FindMin(new int[]{2,1}) == 1
//   FindMin(new int[]{1}) == 1

//   Observations:
//   When arr[mid] > arr[right] means originally initial and now rotated part of array is in right side -> smallest number is on right side
//                   else smallest number is on left side
//   0 1 2 3 4 5
//   3 4 5 6 1 2 => i = 0, left = 0, right = 5, mid = 2 -> arr[mid] > arr[right]
//                  i = 1, left = 3, right = 5, mid = 4 -> arr[mid] !> arr[right]
//                  i = 2, left = 3, right = 4, mid = 3 -> arr[mid] > arr[right] -> left = 4, right= 4 (exits from loop)
//
//   Edge cases:
//   No empty array, array can have 1 element
//   Approach 1: Linear scan -> min=arr[0] and iterate through array and update min as needed, return min => O(n)
//   Approach 2: Binary search -> Compare mid with right most part of array if mid>right means smaller value is on right else left* => O(log n)

public class SmallestNumberInRotatedArray {

    public static int getSmallestNumberInRotatedArray(int[] input) {
        if (input.length == 1)
            return input[0];

        int left = 0, right = input.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (input[mid] > input[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return input[left];
    }

    public static void main(String[] args) {
        int[] input1 = {3, 4, 5, 6, 1, 2};
        int[] input2 = {2, 1};
        int[] input3 = {1};

        System.out.println(getSmallestNumberInRotatedArray(input1)); // Expected output: 1
        System.out.println(getSmallestNumberInRotatedArray(input2)); // Expected output: 1
        System.out.println(getSmallestNumberInRotatedArray(input3)); // Expected output: 1
    }
}
