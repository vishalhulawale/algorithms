package linkedlist.easy;

import linkedlist.common.ListNode;

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        ListNode l1N1 = new ListNode(1);
        ListNode l1N2 = new ListNode(2);
        ListNode l1N3 = new ListNode(3);
        l1N1.next = l1N2;
        l1N2.next = l1N3;

        ListNode l2N1 = new ListNode(1);
        ListNode l2N2 = new ListNode(3);
        ListNode l2N3 = new ListNode(4);
        l2N1.next = l2N2;
        l2N2.next = l2N3;

        ListNode combinedListNode = mergeSortedLinkedList(l1N1, l2N1);

        while (combinedListNode != null) {
            System.out.println(combinedListNode.val);
            combinedListNode = combinedListNode.next;
        }
    }

    private static ListNode mergeSortedLinkedList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(null);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = (l1!=null) ? l1:l2;

        return dummy.next;
    }
}
