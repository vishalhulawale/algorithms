package linkedlist.easy;

// 51: Detect Loop in a Linked List
// Difficulty: Easy
//
// Problem Statement: Given the head of a singly linked list, determine whether the linked list contains a cycle (loop). A cycle exists if some node's next pointer points back to a previously visited node. Use Floyd's cycle detection algorithm (tortoise and hare) for an O(n) time, O(1) space solution.
//
// Examples:
// Input: 1 → 2 → 3 → 4 → 2 (cycle back to node 2)
// Output: true
//
// Input: 1 → 2 → 3 → null
// Output: false

import linkedlist.common.SinglyNode;

public class DetectLoop {

    public static void main(String[] args) {
        DetectLoop solution = new DetectLoop();

        // Test case 1: Cycle exists
        SinglyNode node1 = new SinglyNode(1);
        SinglyNode node2 = new SinglyNode(2);
        SinglyNode node3 = new SinglyNode(3);
        SinglyNode node4 = new SinglyNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle
        System.out.println(solution.hasCycle(node1)); // Expected output: true

        // Test case 2: No cycle
        SinglyNode nodeA = new SinglyNode(1);
        SinglyNode nodeB = new SinglyNode(2);
        SinglyNode nodeC = new SinglyNode(3);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = null; // No cycle
        System.out.println(solution.hasCycle(nodeA)); // Expected output: false
    }

    public boolean hasCycle(SinglyNode head) {
        if (head == null) return false;

        SinglyNode slow = head;
        SinglyNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

}
