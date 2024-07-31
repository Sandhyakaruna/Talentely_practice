import java.util.Scanner;

public class Priorityqueue{
    Node head;
    
    class Node{
        int data;
        int pri;
        Node next;
        
        Node(int val, int k){
            data = val;
            pri = k;
            next = null;
        }
    }
    Priorityqueue(){
        head = null;
    }
    public void enqueue(int val, int pri){
        Node newnode = new Node(val,pri);
         
        if (head==null){
            head = newnode;
        }
        else{
            if (head.pri > pri){
                newnode.next = head;
                head = newnode;
            }
            else{
                Node temp = head;
                while(temp.next != null && temp.next.pri < pri){
                    temp =  temp.next;       
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
    }
    public void dequeue(){
        head = head.next;
    }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null \n");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Priorityqueue q1 = new Priorityqueue();
        q1.enqueue(10,2);
        q1.enqueue(20,0);
        q1.enqueue(30,1);
        q1.enqueue(40,3);
        System.out.println("ENQUEUE :");
        q1.display();
        q1.dequeue();
        q1.dequeue();
        System.out.println("DEQUEUE :");
        q1.display();
    }
}
