import java.util.*;
class Findsockspair
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] hash=new int[200];
        
        for(int i=1;i<n;i++)
        {
            hash[obj.nextInt()]++;
        }
        int res=0;
        for(int f : hash)
        {
            res+=f/2;
        }
        System.out.print(res);
    }
}
