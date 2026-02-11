package linkedlist.easy;

// Implement double-ended (deque) queue that stores string

import linkedlist.common.DoublyNode;

class Deque {
    private DoublyNode head = null;
    private DoublyNode tail = null;

    public void addFirst(Integer num) {
        DoublyNode newNode = new DoublyNode(num);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Integer num) {
        DoublyNode newNode = new DoublyNode(num);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Integer removeFirst() {
        if (head == null)
            return null;
        Integer val = head.data;
        head = head.next;
        return val;
    }

    public Integer removeLast() {
        if (tail == null)
            return null;

        Integer val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }
}

public class DequeDemo {

    public static void main(String[] args) {
        // Example usage of Deque
        Deque deque = new Deque();
        deque.addLast(1);
        deque.addLast(2);
        deque.addFirst(0);

        System.out.println(deque.removeFirst()); // Output: 0
        System.out.println(deque.removeLast());  // Output: 2
        System.out.println(deque.removeFirst()); // Output: 1
    }

}
