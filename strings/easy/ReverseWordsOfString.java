package strings.easy;

// Print Words of a String in Reverse Order
// Difficulty: Easy

// Problem Statement: Given a sentence as a string, reverse the order of words in it. Words are separated by single spaces. The individual characters within each word should remain unchanged — only the word positions should be swapped so the last word comes first, the second-to-last comes second, and so on.

// Examples:

// Input: "I AM A TESTER"
// Output: "TESTER A AM I"

// Input: "Hello World"
// Output: "World Hello"

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ReverseWordsOfString {

    public static String reverseWordsWithStack(String sentence) {
        if (sentence == null || sentence.isBlank()) {
            return sentence;
        }

        String[] words = sentence.split(" ");

        ArrayDeque<String> wordStack = new ArrayDeque<>();

        for (String word : words) {
            wordStack.push(word);
        }

        List<String> reversedWords = new ArrayList<>();
        while (!wordStack.isEmpty()) {
            reversedWords.add(wordStack.pop());
        }

        return String.join(" ", reversedWords);
    }

    public static String reverseWords(String input) {
        char[] charArr = input.toCharArray();
        reverse(charArr, 0, charArr.length - 1);

        int start = 0;
        for (int i = 0; i <= charArr.length; i++) {
            if (i == charArr.length || charArr[i] == ' ') {
                reverse(charArr, start, i - 1);
                start = i + 1;
            }
        }

        return new String(charArr);
    }

    private static void reverse(char[] charArr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
        }
    }

    public static void main(String[] ignoredArgs) {
        String sentence1 = "I AM A TESTER";
        String sentence2 = "Hello World";

        System.out.println(reverseWordsWithStack(sentence1)); // Expected output: "TESTER A AM I"
        System.out.println(reverseWordsWithStack(sentence2)); // Expected output: "World Hello"

        System.out.println(reverseWords(sentence1)); // Expected output: "TESTER A AM I"
        System.out.println(reverseWords(sentence2)); // Expected output: "World Hello"
    }
}
