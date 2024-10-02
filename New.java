import java.util.*;
class New{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int count=0;
        for(int i=n;i<=m;i++)
        if(check(i))
        {
            count++;
            System.out.print(i+" ");
        }
    }
    public static boolean check(int i)
    {
        boolean[] num=new boolean[10];
        while(i!=0)
        {
            int digit=i%10;
            if(num[digit])
            {
                return false;
            }
            num[digit]=true;
            i/=10;
        }
        return true;
    }
