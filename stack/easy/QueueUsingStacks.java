package stack.easy;

// 54: Implement Queue Using Stacks
// Difficulty: Easy
//
// Problem Statement: Implement a FIFO (First-In-First-Out) queue using only two LIFO stacks. Support the following operations: enqueue(x) to add an element to the back, dequeue() to remove and return the front element, peek() to view the front element, and isEmpty() to check if the queue is empty. Each operation should have amortized O(1) time complexity.
//
// Examples:
// Input: enqueue(1), enqueue(2), dequeue(), enqueue(3), dequeue()
// Output: dequeue returns 1, then 2
//
// Input: enqueue(5), peek(), enqueue(10), dequeue()
// Output: peek returns 5, dequeue returns 5

import java.util.ArrayDeque;
import java.util.Deque;

class StackBackedQueue<T> {
    Deque<T> pushStack = new ArrayDeque<>();
    Deque<T> popStack = new ArrayDeque<>();

    public void enqueue(T data) {
        pushStack.push(data);
    }

    public T dequeue() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty())
                popStack.push(pushStack.pop());
        }

        if (popStack.isEmpty())
            return null;

        return popStack.pop();
    }

    public T peek() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty())
                popStack.push(pushStack.pop());
        }

        if (popStack.isEmpty())
            return null;

        return popStack.peek();
    }

    public boolean isEmpty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}

public class QueueUsingStacks {
    public static void main(String[] ignoredArgs) {
        StackBackedQueue<Integer> queue = new StackBackedQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // Expected output: 1
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // Expected output: 2

        queue.enqueue(5);
        System.out.println(queue.peek()); // Expected output: 3
        queue.enqueue(10);
        System.out.println(queue.dequeue()); // Expected output: 3
    }
}
