import java.util.*;
public class Main 
  {
    static class DLLNode 
    {
      int data;
      DLLNode next;
      DLLNode prev;
      DLLNode head;
      DLLNode(int num)
        {
          data = num;
          next = null;
          prev=null;
          head=null;
        }
    }
    static class DoublyLinkedList 
      {
        static DLLNode head = null;
        static DLLNode tail = null;
        void create_node(int num)
        {
          DLLNode newnode =  new DLLNode(num);
          if(head == null)
          {
            head = newnode;
            tail = newnode;
          }
          else
          {
            newnode.prev = tail;
            tail.next= newnode;
            tail= newnode;
          }
          void forward_display()
            {
            DLLNode tptr = head;
            while(tptr != null)
            {
              System.out.print(tptr.data+" ");
              tptr = tptr.next;
            }
          }
        }
        public static void main(String[] args) 
        {
          Scanner input = new Scanner(System.in);
          DoublyLinkedList DLL = new DoublyLinkedList();
          int num;
          while(true)
            {
               num = input.nextInt();
               if(num == -1) break;
               DLL.create_node(num);
            }
          DLL.forward_display();
          input.close();
        }
      }
              
                
              
           
             
          
          
            
