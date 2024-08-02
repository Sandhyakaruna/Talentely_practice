import java.util.Scanner;
public class Queue {
    static int front = -1;
    static int rear = -1;
    static int[] queue = new int[1001];
    static int enque(int enq_val) {
        if (front == -1)
            front = 0;
        rear++;
        if (rear > 1000)
             return -1; // queue full
        queue[rear] = enq_val;
    }
    static int deque() {
        if(front >rear ||front==-1|| rear==-1)
        {
            front=rear=-1;
            return 0;
        }
    }
    static int isEmpty() {
        if (front == -1 || rear == -1 || front > rear)
        return 0; // empty queue
        return 1; // non empty queue
    }
    static int peek() {
        int peek_val;
        if (front == -1 || front > rear || rear == -1)
        return 0; // empty queue
        peek_val = queue[front];
        return peek_val;
    }
    static int elementCount() {
        if (rear == -1 || front == -1 || front > rear)
        return 0;
        return rear - front + 1; // number of elements
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch;
        int input;
        int return_val;
        while (true) {
            ch = scanner.nextInt();
            if (ch == -1)
            break;
            switch (ch) {
                case 1:
                    input = scanner.nextInt();
                    return_val = enque(input);
                    if (return_val == -1)
                        System.out.println("Queue Full");
                    break;
                case 2:
                    return_val = deque();
                    if (return_val == 0)
                        System.out.println("Empty Queue");
                    else
                        System.out.println(return_val);
                    break;
                case 3:
                    return_val = peek();
                    if (return_val == 0)
                        System.out.println("Empty Queue");
                    else
                        System.out.println(return_val);
                    break;
                case 4:
                    return_val = isEmpty();
                    if (return_val == 0)
                        System.out.println("Empty Queue");
                    else
                        System.out.println("Non Empty Queue");
                    break;
                case 5:
                    return_val = elementCount();
                        System.out.println("Number elements stored inside Queue : " + return_val);
                    break;
            }
        }
    }
}