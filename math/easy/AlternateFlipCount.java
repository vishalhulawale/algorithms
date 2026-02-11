package math.easy;

// Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by flipping some of the bits,
// our goal is to minimize the number of bits to be flipped.

// Examples :
// Input : str = 001
// Output : 1
// Minimum number of flips required = 1
// We can flip 1st bit from 0 to 1
//
// Input : str = 0001010111
// Output : 2
// Minimum number of flips required = 2
// We can flip 2nd bit from 0 to 1 and 9th
// bit from 1 to 0 to make alternate
// string 0101010101.
//

public class AlternateFlipCount {

    public static int countFlipBits(String str) {
        int flipsForStart0 = 0;
        int flipsForStart1 = 0;

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            char expectedForStart0 = i % 2 == 0 ? '0' : '1';
            char expectedForStart1 = i % 2 == 0 ? '1' : '0';

            if (expectedForStart0 != curr) {
                flipsForStart0++;
            }

            if (expectedForStart1 != curr) {
                flipsForStart1++;
            }
        }

        return Math.min(flipsForStart0, flipsForStart1);
    }

    public static void main(String[] args) {
        String input1 = "001";
        System.out.println(countFlipBits(input1)); // Expected output: 1

        String input2 = "0001010111";
        System.out.println(countFlipBits(input2)); // Expected output: 2
    }

}
