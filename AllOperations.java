class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    void deleteFromEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteFromPosition(int position) {
        if (head == null) {
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void sortList() {
        if (head == null) {
            return;
        }
        Node current = head;
        Node index;
        int temp;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            Node temp = current;
            while (temp.next != null) {
                if (current.data == temp.next.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertAtEnd(3);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(2);
        
        System.out.println("Original List:");
        list.display();
        
        System.out.println("After inserting 0 at the beginning:");
        list.insertAtBeginning(0);
        list.display();
        
        System.out.println("After inserting 4 at the end:");
        list.insertAtEnd(4);
        list.display();
        
        System.out.println("After inserting 5 at position 3:");
        list.insertAtPosition(5, 3);
        list.display();
        
        System.out.println("After deleting from beginning:");
        list.deleteFromBeginning();
        list.display();
        
        System.out.println("After deleting from end:");
        list.deleteFromEnd();
        list.display();
        
        System.out.println("After deleting from position 2:");
        list.deleteFromPosition(2);
        list.display();
        
        System.out.println("After sorting the list:");
        list.sortList();
        list.display();
        
        System.out.println("After removing duplicates:");
        list.removeDuplicates();
        list.display();
    }
}
