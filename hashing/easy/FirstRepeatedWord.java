package hashing.easy;

// 48: First Repeated Word in a String
// Difficulty: Easy
//
// Problem Statement: Given a string of words separated by spaces, find the first word that appears more than once. Traverse the words left to right and return the first word that has been seen before. Use a hash set for O(1) lookup per word.
//
// Examples:
// Input: "Ravi had been saying that he had been there"
// Output: "had"
//
// Input: "he went to to the market"
// Output: "to"

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedWord {

    public static String getFirstRepeatedWord(String input) {
        String[] words = input.split(" ");
        Set<String> visited = new HashSet<>();

        for (String word : words) {
            if (visited.contains(word))
                return word;

            visited.add(word);
        }

        return null;
    }

    public static void main(String[] args) {
        String input1 = "Ravi had been saying that he had been there";
        System.out.println(getFirstRepeatedWord(input1)); // Output: "had"

        String input2 = "he went to to the market";
        System.out.println(getFirstRepeatedWord(input2)); // Output: "to"
    }
}
