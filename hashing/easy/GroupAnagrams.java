package hashing.easy;

// 49: Group Anagrams
// Difficulty: Medium
//
// Problem Statement: Given a list of strings, group the anagrams together. Two strings are anagrams if they contain the same characters with the same frequencies. Return a list of groups where each group contains all strings that are anagrams of each other. Use sorted characters or character frequency as a hash key.
//
// Examples:
// Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
// Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
//
// Input: ["listen", "silent", "hello"]
// Output: [["listen", "silent"], ["hello"]]

import java.util.*;

public class GroupAnagrams {

    public static Collection<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for (int i = 0; i < str.length(); i++) {
                int numIndex = str.charAt(i) - 'a';
                count[numIndex]++;
            }

            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                char ch = (char) (i + 'a');
                key.append(ch).append(count[i]);
            }

            anagramGroups.putIfAbsent(key.toString(), new ArrayList<>());
            anagramGroups.get(key.toString()).add(str);
        }

        return anagramGroups.values();
    }

    public static void main(String[] args) {
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(input1)); // Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

        String[] input2 = {"listen", "silent", "hello"};
        System.out.println(groupAnagrams(input2)); // Output: [["listen", "silent"], ["hello"]]
    }

}
