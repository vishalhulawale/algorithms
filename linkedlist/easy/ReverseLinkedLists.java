package linkedlist.easy;

import linkedlist.common.ListNode;

public class ReverseLinkedLists {
    public static void main(String[] args) {
        ListNode l1N1 = new ListNode(1);
        ListNode l1N2 = new ListNode(2);
        ListNode l1N3 = new ListNode(3);
        l1N1.next = l1N2;
        l1N2.next = l1N3;


        ListNode reversedListNode = reverseLinkedList(l1N1);

        while (reversedListNode != null) {
            System.out.println(reversedListNode.val);
            reversedListNode = reversedListNode.next;
        }
    }

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
