package strings.easy;

// Find Smallest and Largest Word in a String
// Difficulty: Easy
// 
// Problem Statement: Given a sentence consisting of words separated by spaces, find and return the smallest (shortest) and the largest (longest) word in the sentence. If there are multiple words with the same minimum or maximum length, return the first one encountered.
// 
// Examples:
// 
// Input: "This is a test string"
// Output: Minimum length word: "a", Maximum length word: "string"
// 
// Input: "I love coding challenges"
// Output: Minimum length word: "I", Maximum length word: "challenges"

public class SmallestAndLargestWord {

    public static String[] findSmallestAndLargestWord(String sentence) {
        if (sentence == null || sentence.isBlank()) {
            return new String[]{"", ""};
        }

        int len = sentence.length();

        int smallStart = 0, smallEnd = 0;
        int largeStart = 0, largeEnd = 0;

        int currentStart = 0;

        for (int i = 0; i <= len; i++) {

            if (i == len || sentence.charAt(i) == ' ') {

                if (currentStart < i) { // ignore multiple spaces

                    int currentSize = i - currentStart;
                    int smallSize = smallEnd - smallStart;
                    int largeSize = largeEnd - largeStart;

                    if (smallSize == 0 || currentSize < smallSize) {
                        smallStart = currentStart;
                        smallEnd = i;
                    }

                    if (currentSize > largeSize) {
                        largeStart = currentStart;
                        largeEnd = i;
                    }
                }

                currentStart = i + 1;
            }
        }

        return new String[]{
                sentence.substring(smallStart, smallEnd),
                sentence.substring(largeStart, largeEnd)
        };
    }

    public static void main(String[] ignoredArgs) {
        String sentence1 = "This is a test string";
        String[] result1 = findSmallestAndLargestWord(sentence1);
        System.out.println("Minimum length word: \"" + result1[0] + "\", Maximum length word: \"" + result1[1] + "\"");

        String sentence2 = "I love coding challenges";
        String[] result2 = findSmallestAndLargestWord(sentence2);
        System.out.println("Minimum length word: \"" + result2[0] + "\", Maximum length word: \"" + result2[1] + "\"");
    }
}
