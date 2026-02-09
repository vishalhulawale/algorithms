package hashing.easy;

// 50: Election Winner (Most Votes with Tie-Breaking)
// Difficulty: Medium
//
// Problem Statement: Given an array of candidate names where each name represents one vote for that candidate, determine the winner of the election. The winner is the candidate with the most votes. If there is a tie, return the candidate whose name is lexicographically smallest. Use a hash map to count votes efficiently.
//
// Examples:
// Input: ["Alice", "Bob", "Alice", "Charlie", "Bob", "Alice"]
// Output: "Alice"
//
// Input: ["John", "Jane", "John", "Jane"]
// Output: "Jane"  (tie-breaker: lexicographically smaller)

import java.util.HashMap;
import java.util.Map;

public class ElectionWinner {

    public static String getElectionWinner(String[] votes) {
        Map<String, Integer> voteCount = new HashMap<>();

        for (String vote : votes) {
            Integer count = voteCount.getOrDefault(vote, 0);
            voteCount.put(vote, count + 1);
        }

        String name = null;
        Integer max = null;

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            String currName = entry.getKey();
            Integer count = entry.getValue();

            if (max == null || count > max) {
                name = currName;
                max = count;
            } else if (count.equals(max) && name.compareTo(currName) > 0) {
                name = currName;
            }

        }

        return name;
    }

    public static void main(String[] args) {
        String[] votes1 = {"Alice", "Bob", "Alice", "Charlie", "Bob", "Alice"};
        System.out.println(getElectionWinner(votes1)); // Output: "Alice"

        String[] votes2 = {"John", "Jane", "John", "Jane"};
        System.out.println(getElectionWinner(votes2)); // Output: "Jane"
    }
}
