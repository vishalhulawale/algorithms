package stack.medium;

// 55: Convert Infix to Prefix Notation
// Difficulty: Medium
//
// Problem Statement: Given a mathematical expression in infix notation (e.g., A + B * C), convert it to prefix (Polish) notation.
//  Use the Shunting-yard algorithm adapted for prefix conversion: reverse the infix expression, swap parentheses, apply the standard infix-to-postfix algorithm,
//  then reverse the result. Handle operator precedence and associativity correctly.
//
// Examples:
// Input: "A + B * C"
// Output: "+ A * B C"
//
// Input: "(A + B) * (C - D)"
// Output: "* + A B - C D"

import java.util.Stack;

public class InfixToPrefix {

    public static String infixToPrefix(String infix) {
        if (infix == null || infix.isEmpty())
            return infix;

        // 1. Reverse infix
        String reversed = reverse(infix);
        System.out.println("1. Reversed: " + reversed);

        // 2. Swap brackets
        String cleaned = swapBrackets(reversed.replaceAll("\\s+", ""));
        System.out.println("2. Brackets swapped: " + cleaned);

        // 3. Infix to Postfix
        String postfix = infixToPostFix(cleaned);
        System.out.println("3. Infix -> Postfix: " + postfix);

        // 4. Reverse
        return reverse(postfix);
    }

    private static String infixToPostFix(String cleaned) {
        int i = 0;
        Stack<Character> charStack = new Stack<>();
        StringBuilder answer = new StringBuilder();

        while (i < cleaned.length()) {
            char curr = cleaned.charAt(i);

            if ((curr >= 'A' && curr <= 'Z') || (curr >= 'a' && curr <= 'z') || (curr >= '0' && curr <= '9')) {
                answer.append(curr);
            } else if (curr == '(') {
                charStack.push(curr);
            } else if (curr == ')') {
                while (!charStack.empty() && charStack.peek() != '(') {
                    answer.append(charStack.pop());
                }
                charStack.pop();
            } else {
                while (!charStack.empty() && priority(curr) < priority(charStack.peek())) {
                    answer.append(charStack.pop());
                }
                charStack.push(curr);
            }

            i++;
        }

        while (!charStack.empty()) {
            answer.append(charStack.pop());
        }

        return answer.toString();
    }

    private static int priority(char curr) {
        if (curr == '+' || curr == '-') {
            return 1;
        } else if (curr == '*' || curr == '/') {
            return 2;
        } else if (curr == '^') {
            return 3;
        }

        return -1;
    }

    private static String swapBrackets(String reversed) {
        StringBuilder cleaned = new StringBuilder(reversed);

        for (int i = 0; i < reversed.length(); i++) {
            char current = cleaned.charAt(i);

            if (current == '(') {
                cleaned.setCharAt(i, ')');
            } else if (current == ')') {
                cleaned.setCharAt(i, '(');
            }
        }

        return cleaned.toString();
    }

    private static String reverse(String infix) {
        int len = infix.length();

        StringBuilder reversed = new StringBuilder();

        for (int i = len - 1; i >= 0; i--) {
            reversed.append(infix.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String infix1 = "A + B * C";
        System.out.println(infixToPrefix(infix1)); // Expected output: "+ A * B C"

        String infix2 = "(A + B) * (C - D)";
        System.out.println(infixToPrefix(infix2)); // Expected output: "* + A B - C D"
    }

}
