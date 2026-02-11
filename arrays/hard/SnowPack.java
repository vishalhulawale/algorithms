package arrays.hard;

// Instructions to candidate.
// 1) Given an array of non-negative integers representing the elevations
//    from the vertical cross-section of a range of hills, determine how
//    many units of snow could be captured between the hills.
//    See the example array and elevation map below.
//                                ___
//            ___                |   |        ___
//           |   |        ___    |   |___    |   |
//        ___|   |    ___|   |   |   |   |   |   |
//    ___|___|___|___|___|___|___|___|___|___|___|___
//    {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
//                                ___
//            ___                |   |        ___
//           |   | *   *  _*_  * |   |_*_  * |   |
//        ___|   | *  _*_|   | * |   |   | * |   |
//    ___|___|___|_*_|___|___|_*_|___|___|_*_|___|___
//    {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
//
//    Solution: In this example 13 units of snow (*) could be captured.
public class SnowPack {

    public static Integer computeSnowpack(Integer[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        }

        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], arr[j + 1]);
        }

        int count = 0;
        for (int k = 0; k < n; k++) {
            int max = Math.min(leftMax[k], rightMax[k]);
            if (max > arr[k]) {
                count += max - arr[k];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Integer[] input1 = {0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0};
        System.out.println(computeSnowpack(input1)); // Expected output: 13

        Integer[] input2 = {4, 2, 0, 3, 2, 5};
        System.out.println(computeSnowpack(input2)); // Expected output: 9
    }
}
