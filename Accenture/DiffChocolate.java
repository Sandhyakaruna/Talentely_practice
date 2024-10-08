import java.util.*;
public class DiffChocolate
{
    public static void main(String[] args)
    {
       Scanner obj = new Scanner(System.in);
       int n = obj.nextInt();
       int[] choco=new int[n];
       for(int i=0;i<n;i++)
       {
           choco[i]= obj.nextInt();
       }
       int t=obj.nextInt();
       System.out.println(MinimumCost(choco,t,n));
    }
    public static int MinimumCost(int[] choco,int t,int n)
    {
        int MinC=0;
        if(n<t)
        {
            return -1;
        }
        Arrays.sort(choco);
        for (int i=0;i<t;i++)
        {
            MinC+=choco[i];
        }
        return MinC;
    }
}
