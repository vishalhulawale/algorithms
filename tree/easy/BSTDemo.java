package tree.easy;

// 57: Binary Search Tree — Put, Contains, InOrder Traversal
// Difficulty: Easy
//
// Problem Statement: Implement a Binary Search Tree (BST) with the following operations:
//
// put(value): Insert a new value into the BST maintaining the BST property (left child < parent < right child).
// contains(value): Return true if the value exists in the BST, false otherwise.
// inOrderTraversal(): Return all values in the BST in sorted (ascending) order by performing an in-order traversal (left → root → right).
//
// Examples:
// Input: put(5), put(3), put(7), put(1), contains(3), contains(6), inOrderTraversal()
// Output: contains(3) → true, contains(6) → false, inOrderTraversal → [1, 3, 5, 7]
//
// Input: put(10), put(5), put(15), inOrderTraversal()
// Output: [5, 10, 15]

import tree.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class BST {

    TreeNode root;

    void put(Integer num) {
        root = insert(root, num);
    }

    private TreeNode insert(TreeNode node, Integer num) {
        if (node == null)
            return new TreeNode(num);

        if (num <= node.val)
            node.left = insert(node.left, num);
        else
            node.right = insert(node.right, num);

        return node;
    }

    boolean contains(Integer num) {
        return search(root, num);
    }

    boolean search(TreeNode root, Integer num) {
        if (root == null)
            return false;

        if (root.val.equals(num))
            return true;
        else if (num <= root.val) {
            return search(root.left, num);
        } else {
            return search(root.right, num);
        }
    }

    List<Integer> inOrderTraversal() {
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }

    private void traverse(TreeNode root, List<Integer> res) {
        if (root == null)
            return;

        traverse(root.left, res);
        res.add(root.val);
        traverse(root.right, res);
    }
}

public class BSTDemo {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.put(5);
        bst.put(3);
        bst.put(7);
        bst.put(1);

        System.out.println(bst.contains(3)); // Output: true
        System.out.println(bst.contains(6)); // Output: false
        System.out.println(bst.inOrderTraversal()); // Output: [1, 3, 5, 7]

        BST bst2 = new BST();
        bst2.put(10);
        bst2.put(5);
        bst2.put(15);

        System.out.println(bst2.inOrderTraversal()); // Output: [5, 10, 15]
    }
}
