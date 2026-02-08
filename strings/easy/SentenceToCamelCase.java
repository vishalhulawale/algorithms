package strings.easy;

// 9: Convert String to Camel Case
// Difficulty: Easy

// Problem Statement: Given a sentence of words separated by spaces, remove all spaces and convert the sentence to CamelCase format, where every word begins with an uppercase letter and the remaining characters are lowercase. This is commonly used in programming for naming conventions.

// Examples:
// Input: "this is a test string"
// Output: "ThisIsATestString"

// Input: "hello world from java"
// Output: "HelloWorldFromJava"

public class SentenceToCamelCase {

    public static String convertToCamelCase(String sentence) {
        if (sentence == null || sentence.isEmpty())
            return sentence;

        StringBuilder result = new StringBuilder();
        boolean newWord = true;

        for (int i = 0; i < sentence.length(); i++) {
            char current = sentence.charAt(i);
            if (current == ' ') {
                newWord = true;
                continue;
            }

            if (newWord) {
                result.append(Character.toUpperCase(current));
                newWord = false;
            } else {
                result.append(Character.toLowerCase(current));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "this is a test string";
        System.out.println(convertToCamelCase(input1)); // Expected output: "ThisIsATestString"

        String input2 = "hello world from java";
        System.out.println(convertToCamelCase(input2)); // Expected output: "HelloWorldFromJava"
    }
}
