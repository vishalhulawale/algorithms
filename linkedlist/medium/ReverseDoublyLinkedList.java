package linkedlist.medium;

// 53: Reverse a Doubly Linked List Using Recursion
// Difficulty: Medium
//
// Problem Statement: Given the head of a doubly linked list, reverse the entire list using recursion. Each node has data, next, and prev pointers. After reversal, the head should point to the original tail, and all next and prev pointers should be swapped correctly. The function should return the new head of the reversed list.
//
// Examples:
//
// Input: 1 ⇄ 2 ⇄ 3 ⇄ 4
// Output: 4 ⇄ 3 ⇄ 2 ⇄ 1
//
// Input: 10 ⇄ 20
// Output: 20 ⇄ 10

import linkedlist.common.DoublyNode;

public class ReverseDoublyLinkedList {

    // Method to reverse a doubly linked list using recursion.
    public static DoublyNode reverse(DoublyNode head) {
        DoublyNode prev = head.prev;
        DoublyNode next = head.next;

        head.next = prev;
        head.prev = next;

        if (head.prev == null)
            return head;

        return reverse(head.prev);
    }

    public static void main(String[] args) {
        // Test case 1: Reversing a list of 4 nodes
        DoublyNode node1 = new DoublyNode(1);
        DoublyNode node2 = new DoublyNode(2);
        DoublyNode node3 = new DoublyNode(3);
        DoublyNode node4 = new DoublyNode(4);
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;

        DoublyNode reversedHead1 = reverse(node1);
        printDoublyLinkedList(reversedHead1); // Expected output: 4 ⇄ 3 ⇄ 2 ⇄ 1

        // Test case 2: Reversing a list of 2 nodes
        DoublyNode nodeA = new DoublyNode(10);
        DoublyNode nodeB = new DoublyNode(20);
        nodeA.next = nodeB;
        nodeB.prev = nodeA;

        DoublyNode reversedHead2 = reverse(nodeA);
        printDoublyLinkedList(reversedHead2); // Expected output: 20 ⇄ 10

    }

    private static void printDoublyLinkedList(DoublyNode head) {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ⇄ ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
