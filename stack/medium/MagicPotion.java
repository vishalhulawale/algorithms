package stack.medium;

// 56: Magic Potion (Stack-Based Simulation)
// Difficulty: Medium
//
// Problem Statement: A wizard is brewing a magic potion by adding ingredients one at a time. If the same ingredient is added consecutively ( the top of the current potion stack matches the new ingredient), they cancel each other out and both are removed. Given a sequence of ingredients, determine the final state of the potion after all ingredients have been processed. This is essentially a stack-based adjacent duplicate removal problem.
//
// Examples:
// Input: ["a", "b", "a", "a", "b"]
// Output: ["a", "b", "b"]
//
// Input: ["a", "a", "b", "b"]
// Output: []  (all cancel out)

import java.util.ArrayDeque;
import java.util.Deque;

public class MagicPotion {

    public static String[] getMagicPotion(String[] ingredients) {
        if (ingredients == null || ingredients.length == 0) {
            return new String[0];
        }

        Deque<String> stack = new ArrayDeque<>();

        for (String ing : ingredients) {
            if (!stack.isEmpty() && stack.peek().equals(ing)) {
                stack.pop();
            } else {
                stack.push(ing);
            }
        }

        // Stack has reverse order → need reverse output
        String[] result = new String[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String[] input1 = {"a", "b", "a", "a", "b"};
        String[] result1 = getMagicPotion(input1);
        System.out.print("Output: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Expected output: ["a", "b", "b"]

        String[] input2 = {"a", "a", "b", "b"};
        String[] result2 = getMagicPotion(input2);
        System.out.print("Output: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Expected output: []
    }
}
