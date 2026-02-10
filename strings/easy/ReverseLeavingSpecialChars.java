package strings.easy;

// String reversal while leaving the special chars in their original position problem
//
// Input : AB#CD$E
// Output : ED#CB$A
// Input : A#B$C
// Output : C#B$A

public class ReverseLeavingSpecialChars {

    public static String reverse(String input) {
        int n = input.length();
        int left = 0, right = n - 1;

        StringBuilder res = new StringBuilder(input);

        while (left < right) {
            char leftCh = res.charAt(left);
            char rightCh = res.charAt(right);

            if (Character.isLetter(leftCh) && Character.isLetter(rightCh)) {
                // Swap
                res.setCharAt(left, rightCh);
                res.setCharAt(right, leftCh);
                left++;
                right--;
            } else if (!Character.isLetter(leftCh)) {
                left++;
            } else {
                right--;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String input1 = "AB#CD$E";
        System.out.println(reverse(input1)); // Output: "ED#CB$A"

        String input2 = "A#B$C";
        System.out.println(reverse(input2)); // Output: "C#B$A"
    }

}
