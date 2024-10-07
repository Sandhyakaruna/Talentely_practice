import java.util.*;
class Ration
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int chocolate=obj.nextInt();
        int kids=obj.nextInt();
        int prev;
        for(int i=1;i<kids;i++)
        {
            prev=chocolate-1;
            chocolate=chocolate+prev;
        }
        System.out.println(chocolate);
    }

}
