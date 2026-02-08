package arrays.easy;

// Best Average Grade with Floor

// Problem Statement: Given a list of student test scores where each student may have multiple scores, find the best average grade. If the average is not an integer, return the floor value. Return 0 for empty input.

// Example:
// Input: [["Bobby", "87"], ["Charles", "100"], ["Eric", "64"], ["Charles", "22"]]
// Output: 87 (Bobby: 87, Charles: 61, Eric: 64)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BestAverageGradeWithFloor {

    public static int getBestAverageGradeV1(String[][] scores) {
        if (scores.length == 0)
            return 0;

        Map<String, Integer> totalMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (String[] entry : scores) {
            String name = entry[0];
            Integer marks = Integer.parseInt(entry[1]);

            Integer total = totalMap.getOrDefault(name, 0) + marks;
            Integer count = countMap.getOrDefault(name, 0) + 1;

            totalMap.put(name, total);
            countMap.put(name, count);
        }

        int bestAverage = 0;

        for (Map.Entry<String, Integer> entry : totalMap.entrySet()) {
            Integer count = countMap.get(entry.getKey());
            Integer total = entry.getValue();

            bestAverage = Math.max(bestAverage, (total / count));
        }

        return bestAverage;
    }

    public static int getBestAverageGradeV2(String[][] scores) {
        if (scores.length == 0)
            return 0;

        Double avgScore = Arrays.stream(scores)
                .collect(Collectors.groupingBy(arr -> arr[0],
                        Collectors.averagingInt(arr -> Integer.parseInt(arr[1]))))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getValue).orElse(0.0);

        return (int) Math.floor(avgScore);
    }

    public static int getBestAverageGradeV3(String[][] scores) {
        if (scores.length == 0)
            return 0;

        Map<String, Score> scoreMap = new HashMap<>();

        for (String[] entry : scores) {
            String name = entry[0];
            int marks = Integer.parseInt(entry[1]);


            scoreMap.putIfAbsent(name, new Score());
            scoreMap.get(name).add(marks);
        }

        int bestAverage = 0;

        for (Score entry : scoreMap.values()) {
            bestAverage = Math.max(bestAverage, entry.avg());
        }

        return bestAverage;
    }

    public static void main(String[] args) {
        String[][] input1 = {{"Bobby", "87"}, {"Charles", "100"}, {"Eric", "64"}, {"Charles", "22"}};
        String[][] input2 = {};

        System.out.println(getBestAverageGradeV1(input1)); // Expected output: 87
        System.out.println(getBestAverageGradeV1(input2)); // Expected output: 0

        System.out.println(getBestAverageGradeV2(input1)); // Expected output: 87
        System.out.println(getBestAverageGradeV2(input2)); // Expected output: 0

        System.out.println(getBestAverageGradeV3(input1)); // Expected output: 87
        System.out.println(getBestAverageGradeV3(input2)); // Expected output: 0
    }

    private static class Score {
        int total = 0;
        int count = 0;

        void add(int marks) {
            total += marks;
            count++;
        }

        int avg() {
            return total / count;
        }
    }
}
