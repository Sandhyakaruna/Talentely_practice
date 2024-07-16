import java.util.Scanner;

// Define the Node class for the doubly linked list
class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// Define the DoublyLinkedList class
class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Method to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class to test the doubly linked list implementation
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values to insert at the beginning of the list (enter -1 to stop):");
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            list.insertAtBeginning(value);
        }

        System.out.println("The list is:");
        list.printList();

        scanner.close();
    }
}
