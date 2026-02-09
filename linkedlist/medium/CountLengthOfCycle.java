package linkedlist.medium;

// 52: Count Length of Cycle in a Linked List
// Difficulty: Medium
//
// Problem Statement: Given the head of a linked list that may contain a cycle, determine the length of the cycle if one exists. First, detect the cycle using Floyd's algorithm. Once the slow and fast pointers meet inside the cycle, keep one pointer fixed and advance the other, counting steps until they meet again. Return 0 if no cycle exists.
//
// Examples:
// Input: 1 → 2 → 3 → 4 → 5 → 3 (cycle of length 3: 3→4→5→3)
// Output: 3
//
// Input: 1 → 2 → 3 → null
// Output: 0

import linkedlist.common.SinglyNode;

public class CountLengthOfCycle {

    public static int getLengthOfCycle(SinglyNode head) {
        if (head == null || head.next == null) return 0;

        SinglyNode slow = head;
        SinglyNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return countCycleLength(slow);
            }
        }

        return 0;
    }

    private static int countCycleLength(SinglyNode initialPoint) {
        int count = 1;
        SinglyNode current = initialPoint.next;

        while (current != initialPoint) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        // Test case 1: Cycle of length 3
        SinglyNode node1 = new SinglyNode(1);
        SinglyNode node2 = new SinglyNode(2);
        SinglyNode node3 = new SinglyNode(3);
        SinglyNode node4 = new SinglyNode(4);
        SinglyNode node5 = new SinglyNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3; // Creates a cycle of length 3
        System.out.println(getLengthOfCycle(node1)); // Expected output: 3

        // Test case 2: No cycle
        SinglyNode nodeA = new SinglyNode(1);
        SinglyNode nodeB = new SinglyNode(2);
        SinglyNode nodeC = new SinglyNode(3);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = null; // No cycle
        System.out.println(getLengthOfCycle(nodeA)); // Expected output: 0
    }
}
