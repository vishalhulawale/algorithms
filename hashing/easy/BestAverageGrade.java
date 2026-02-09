package hashing.easy;

// 47: Best Average Grade
// Difficulty: Easy
//
// Problem Statement: Given a list of student name-score pairs (where the same student may appear multiple times with different scores), find the highest average score among all students. For each student, compute their average score across all entries, then return the maximum average (as an integer, floored).
//
// Examples:
//
// Input: [("Alia", -678), ("Bobby", 100), ("Alex", 223), ("Alex", -23), ("Bobby", 723)]
// Output: 411  (Bobby's avg = (100+723)/2 = 411.5 → 411)
//
// Input: [("Alice", 90), ("Bob", 80), ("Alice", 100)]
// Output: 95

import java.util.HashMap;
import java.util.Map;

class Score {
    int total = 0;
    int count = 0;

    public void add(int marks) {
        total += marks;
        count++;
    }

    public int avg() {
        return total / count;
    }
}

public class BestAverageGrade {

    public static int bestAverageGrade(String[][] scores) {
        Map<String, Score> scoreMap = new HashMap<>();

        for (String[] entry : scores) {
            String name = entry[0];
            int marks = Integer.parseInt(entry[1]);

            scoreMap.putIfAbsent(name, new Score());
            scoreMap.get(name).add(marks);
        }

        int bestAverage = 0;
        for (Score score : scoreMap.values()) {
            bestAverage = Math.max(bestAverage, score.avg());
        }

        return bestAverage;
    }

    public static void main(String[] args) {
        String[][] scores1 = {{"Alia", "-678"}, {"Bobby", "100"}, {"Alex", "223"}, {"Alex", "-23"}, {"Bobby", "723"}};
        System.out.println(bestAverageGrade(scores1)); // Output: 411

        String[][] scores2 = {{"Alice", "90"}, {"Bob", "80"}, {"Alice", "100"}};
        System.out.println(bestAverageGrade(scores2)); // Output: 95
    }
}
