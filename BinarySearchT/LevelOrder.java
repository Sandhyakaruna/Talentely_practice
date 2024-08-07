import java.util.*;
class Node
{
    int data;
    Node left,right;
    public Node(int val)
    {
        data=val;
        left=right=null;
    }
}
class Tree
{
    Node root;
    Node create(int val)
    {
        return new Node(val);
    }
    Node insert(Node root , int val)
    {
        if(root==null)
        {
            return create(val);
        }
        else
        {
            if(val<root.data)
                root.left=insert(root.left, val);
            else
                root.right=insert(root.right, val);
        }
        return root;
    }
    public void preorder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(Node root)
    {
        if(root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
//    public void Search(root,int num)
//    {
//        if(num<root.data)
//        {
//            return Search(root.left,num);
//        }
//        return Search(root.right,num);
//    }
    public void levelOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> queue =new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Node current = queue.poll();
            System.out.print(current.data+" ");
            if(current.left!=null)
            {
                queue.add(current.left);
            }
            if(current.right!=null)
            {
                queue.add(current.right);
            }
        }
    }
    public int Search(Node root,int key)
    {
        if(root != null) {
            if (key == root.data) {
                return 1;
            } else if (key > root.data) {
                return Search(root.right, key);
            } else
                return Search(root.left, key);
        }else
            return 0;
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Tree t = new Tree();
        int k = obj.nextInt();
        Node root =t.create(k);
        while(true)
        {
            int val = obj.nextInt();
            if(val ==-1)
                break;
            t.insert(root, val);
        }
        System.out.println("Preorder");
        t.preorder(root);
        System.out.println("\nPostorder");
        t.postorder(root);
        System.out.println("\nInorder");
        t.inorder(root);
        System.out.println("\nLevel of Order");
        t.levelOrder(root);
        System.out.println("\nEnter search element");
        int key = obj.nextInt();
        if(t.Search(root,key)==1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
        //t.Search(root,key);
    }
}