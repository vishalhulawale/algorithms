package linkedlist.easy;

import linkedlist.common.ListNode;

public class DetectCycleInLinkedList {
    public static void main(String[] args) {
        ListNode l1N1 = new ListNode(1);
        ListNode l1N2 = new ListNode(2);
        ListNode l1N3 = new ListNode(3);
        l1N1.next = l1N2;
        l1N2.next = l1N3;
        l1N3.next = l1N1;

        ListNode l2N1 = new ListNode(1);
        ListNode l2N2 = new ListNode(3);
        ListNode l2N3 = new ListNode(4);
        l2N1.next = l2N2;
        l2N2.next = l2N3;

        boolean hasCycle1 = checkIfLLHasCycle(l1N1);
        System.out.println("Has cycle: " + hasCycle1);

        boolean hasCycle2 = checkIfLLHasCycle(l2N1);
        System.out.println("Has cycle: " + hasCycle2);
    }

    private static boolean checkIfLLHasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }


        return false;
    }
}
