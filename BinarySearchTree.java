import java.util.Scanner;

// Node class representing each node in the binary search tree
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

  
    BinarySearchTree() {
        root = null;
    }

    
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive method to insert a new key in the tree
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // Method to perform in-order traversal of the tree
    void inorder() {
        inorderRec(root);
    }

    //
